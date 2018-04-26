package com.bgy.service.impl;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.exception.ExceptionManager;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.AccApplyAlterItemPOMapper;
import com.bgy.dao.AccApplyAlterPOMapper;
import com.bgy.entity.dto.AccApplyAlterAllDTO;
import com.bgy.entity.dto.AccApplyAlterBusinessDataDTO;
import com.bgy.entity.dto.AccApplyAlterDTO;
import com.bgy.entity.po.AccApplyAlterItemPO;
import com.bgy.entity.po.AccApplyAlterPO;
import com.bgy.entity.vo.AccApplyAlterVO;
import com.bgy.entity.vo.SettexchAtttItemVO;
import com.bgy.service.AccApplyAlterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yyg
 * @date 2018/4/18 18:56
 * @desc TR-TR034_2-账户变更 实现类
 */
@Service
public class AccApplyAlterServiceimpl implements AccApplyAlterService {

    @Resource
    private AccApplyAlterPOMapper accApplyAlterPOMapper;

    @Resource
    private AccApplyAlterItemPOMapper accApplyAlterItemPOMapper;

    @Resource
    private ExceptionManager exceptionManager;

    @Value("${ipSapUrl}")
    String ipSapUrl;

    @Value("${port}")
    String port;


    /**
     * 写入sap金划转及结汇购汇业务（结汇购汇业务)相关数据
     *
     * @param alterAllDTO
     * @return ResultData
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData addAccApplyAlter(AccApplyAlterAllDTO alterAllDTO) {
        //数据拷贝
        AccApplyAlterBusinessDataDTO businessDataDTO = MapperUtils.
                mapperBean(alterAllDTO.getBusinessData(), AccApplyAlterBusinessDataDTO.class);
        AccApplyAlterDTO headDTO = MapperUtils.mapperBean(businessDataDTO.getAccApplyRecord(), AccApplyAlterDTO.class);
        AccApplyAlterPO accApplyAlterPO = MapperUtils.mapperBean(headDTO, AccApplyAlterPO.class);
        List<AccApplyAlterItemPO> accApplyAlterItemPOS = MapperUtils.mapperList(headDTO.getAccApplyAttItem(), AccApplyAlterItemPO.class);
        //获取表单编号
        String docID = alterAllDTO.getFormInfo().getDocID();

        //查询数据库并删除符合此id的数据
        AccApplyAlterPO countPo = new AccApplyAlterPO();
        countPo.setHeadid(docID);
        int count = this.accApplyAlterPOMapper.selectCount(countPo);
        if (count > 0) {
            accApplyAlterPOMapper.delete(countPo);
            AccApplyAlterItemPO detelePO = new AccApplyAlterItemPO();
            detelePO.setHeadid(countPo.getHeadid());
            accApplyAlterItemPOMapper.delete(detelePO);
        }
        //添加操作
        accApplyAlterPO.setHeadid(docID);
        accApplyAlterPO.setCreateTime(LocalDateTime.now());
        accApplyAlterPO.setUpdateTime(LocalDateTime.now());
        accApplyAlterPO.setCreateBy("1");
        accApplyAlterPO.setUpdateBy("1");
        accApplyAlterPOMapper.insertSelective(accApplyAlterPO);
        accApplyAlterItemPOS.stream().forEach(s -> {
            if (!s.getFilename().equals("")) {
                s.setHeadid(docID);
                accApplyAlterItemPOMapper.insertSelective(s);
            }
        });

        //封装返回参数
        ResultData resultData = new ResultData();
        resultData.setDocID(docID);
        resultData.setProcessTempID(alterAllDTO.getFormInfo().getProcessTempID());
        //拼接url
        String sapurl = "http://" + ipSapUrl + ":" + port + "/sap/fundsmanager/fundsmanagerIndex.html?docID=" + docID + "&tempID="
                + alterAllDTO.getFormInfo().getProcessTempID() + "&act=";
        resultData.setFormURL(sapurl);
        return resultData;
    }

    @Override
    public AccApplyAlterVO getAccApplyAlterAllInfo(String billsNumber) {
        AccApplyAlterPO selectPO = new AccApplyAlterPO();
        selectPO.setHeadid(billsNumber);
        AccApplyAlterPO accApplyAlterPO = this.accApplyAlterPOMapper.selectOne(selectPO);
        if (accApplyAlterPO == null) {
            throw exceptionManager.createByCode("SAP_FM_AT_001");
        }

        AccApplyAlterVO  headVO = MapperUtils.mapperBean(accApplyAlterPO, AccApplyAlterVO.class);

        AccApplyAlterItemPO selecct = new AccApplyAlterItemPO();
        selecct.setHeadid(billsNumber);
        List<AccApplyAlterItemPO> accApplyAlterItemPOList = this.accApplyAlterItemPOMapper.select(selecct);
        List<SettexchAtttItemVO> settexchAtttItemVO = new ArrayList<SettexchAtttItemVO>();
        if (accApplyAlterItemPOList.size() > 0) {
        settexchAtttItemVO = MapperUtils.mapperList(accApplyAlterItemPOList, SettexchAtttItemVO.class);
        }
        headVO.setSettexchAtttItemVO(settexchAtttItemVO);
        return headVO;
    }
}
