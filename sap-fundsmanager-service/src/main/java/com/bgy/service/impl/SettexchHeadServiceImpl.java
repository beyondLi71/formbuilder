package com.bgy.service.impl;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.exception.ExceptionManager;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.SettexchAtttItemPOMapper;
import com.bgy.dao.SettexchHeadPOMapper;
import com.bgy.entity.dto.SettexchBusinessDataDTO;
import com.bgy.entity.dto.SettexchDTO;
import com.bgy.entity.dto.SettexchHeadDTO;
import com.bgy.entity.po.SettexchAtttItemPO;
import com.bgy.entity.po.SettexchHeadPO;
import com.bgy.entity.vo.SettexchAtttItemVO;
import com.bgy.entity.vo.SettexchHeadVO;
import com.bgy.service.SettexchHeadService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yyg
 * @date 2018/4/17 14:48
 * @desc 资金划转及结汇购汇业务（结汇购汇业务) 接口实现类层
 */
@Service
public class SettexchHeadServiceImpl implements SettexchHeadService {

    @Resource
    private SettexchHeadPOMapper settexchHeadPOMapper;

    @Resource
    private SettexchAtttItemPOMapper settexchAtttItemPOMapper;

    @Resource
    private ExceptionManager exceptionManager;

    @Value("${ipSapUrl}")
    String ipSapUrl;

    @Value("${port}")
    String port;


    /**
     * 写入sap金划转及结汇购汇业务（结汇购汇业务)相关数据
     *
     * @param settexchDTO
     * @return ResultData
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData addSettexch(SettexchDTO settexchDTO) {
        //数据拷贝
        SettexchBusinessDataDTO settexchBusinessData = MapperUtils.mapperBean(settexchDTO.getBusinessData(), SettexchBusinessDataDTO.class);
        SettexchHeadDTO settexchHeadDTO = MapperUtils.mapperBean(settexchBusinessData.getSettExchRecord(), SettexchHeadDTO.class);
        SettexchHeadPO settexchHeadPO = MapperUtils.mapperBean(settexchHeadDTO, SettexchHeadPO.class);
        List<SettexchAtttItemPO> settexchAtttItemPOs =
                MapperUtils.mapperList(settexchHeadDTO.getSettExchAtttItem(), SettexchAtttItemPO.class);
        //获取表单编号
        String docID = settexchDTO.getFormInfo().getDocID();

        //查询数据库并删除符合此id的数据
        SettexchHeadPO countPo = new SettexchHeadPO();
        countPo.setHeadid(docID);
        int count = this.settexchHeadPOMapper.selectCount(countPo);
        if (count > 0) {
            settexchHeadPOMapper.delete(countPo);
            SettexchAtttItemPO detelePO = new SettexchAtttItemPO();
            detelePO.setHeadid(countPo.getHeadid());
            settexchAtttItemPOMapper.delete(detelePO);
        }
        //添加操作
        settexchHeadPO.setHeadid(docID);
        settexchHeadPO.setCreateTime(LocalDateTime.now());
        settexchHeadPO.setUpdateTime(LocalDateTime.now());
        settexchHeadPO.setCreateBy("1");
        settexchHeadPO.setUpdateBy("1");
        settexchHeadPOMapper.insertSelective(settexchHeadPO);
        settexchAtttItemPOs.stream().forEach(s -> {
            if (!s.getFilename().equals("")) {
                s.setHeadid(docID);
                settexchAtttItemPOMapper.insertSelective(s);
            }
        });

        //封装返回参数
        ResultData resultData = new ResultData();
        resultData.setDocID(docID);
        resultData.setProcessTempID(settexchDTO.getFormInfo().getProcessTempID());
        //拼接url
        String sapurl = "http://" + ipSapUrl + ":" + port + "/sap/fundsmanager/fundsmanagerIndex.html?docID=" + docID + "&tempID="
                + settexchDTO.getFormInfo().getProcessTempID() + "&act=";
        resultData.setFormURL(sapurl);
        return resultData;
    }

    @Override
    public SettexchHeadVO getSettexchAllInfo(String billsNumber) {
        SettexchHeadPO settexchHeadslect = new SettexchHeadPO();
        settexchHeadslect.setHeadid(billsNumber);
        SettexchHeadPO settexchHeadPO = this.settexchHeadPOMapper.selectOne(settexchHeadslect);
        if (settexchHeadPO == null) {
            throw exceptionManager.createByCode("SAP_FM_ST_001");
        }
        SettexchAtttItemPO selecct = new SettexchAtttItemPO();
        selecct.setHeadid(billsNumber);
        List<SettexchAtttItemPO> settexchAtttItemPO = this.settexchAtttItemPOMapper.select(selecct);
        SettexchHeadVO settexchHeadVO = MapperUtils.mapperBean(settexchHeadPO, SettexchHeadVO.class);

        List<SettexchAtttItemVO> settexchAtttItemVO = new ArrayList<SettexchAtttItemVO>();
        if (settexchAtttItemPO.size() > 0) {
            settexchAtttItemVO = MapperUtils.mapperList(settexchAtttItemPO, SettexchAtttItemVO.class);
        }
        settexchHeadVO.setSettexchAtttItemVO(settexchAtttItemVO);
        return settexchHeadVO;
    }

}
