package com.bgy.service.impl;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.exception.ExceptionManager;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.AccApplyCloseAccItemPOMapper;
import com.bgy.dao.AccApplyCloseAccPOMapper;
import com.bgy.entity.dto.AccApplyCloseAccBusinessDataDTO;
import com.bgy.entity.dto.AccApplyCloseAccHeadDTO;
import com.bgy.entity.dto.AccApplyCloseAccountDTO;
import com.bgy.entity.po.AccApplyCloseAccountItemPO;
import com.bgy.entity.po.AccApplyCloseAccountPO;
import com.bgy.entity.vo.AccApplyCloseAccountItemVO;
import com.bgy.entity.vo.AccApplyCloseAccountVO;
import com.bgy.service.AccApplyCloseAccountService;
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
public class AccApplyCloseAccountServiceimpl implements AccApplyCloseAccountService {

    @Resource
    private AccApplyCloseAccPOMapper accApplyCloseAccPOMapper;

    @Resource
    private AccApplyCloseAccItemPOMapper accApplyCloseAccItemPOMapper;

    @Resource
    private ExceptionManager exceptionManager;

    @Value("${ipSapUrl}")
    String ipSapUrl;

    @Value("${port}")
    String port;


    /**
     * sap写入TR-TR034_3-账户销户相关数据
     *
     * @param closeAccountDTO
     * @return ResultData
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData addAccApplyCloseAcc(AccApplyCloseAccountDTO closeAccountDTO) {
        //数据拷贝
        AccApplyCloseAccBusinessDataDTO businessDataDTO = MapperUtils.
                mapperBean(closeAccountDTO.getBusinessData(), AccApplyCloseAccBusinessDataDTO.class);
        AccApplyCloseAccHeadDTO headDTO = MapperUtils.mapperBean(businessDataDTO.getAccApplyRecord(), AccApplyCloseAccHeadDTO.class);
        AccApplyCloseAccountPO accCloseAccountPO = MapperUtils.mapperBean(headDTO, AccApplyCloseAccountPO.class);
        List<AccApplyCloseAccountItemPO> accApplyCloseAccountItemPOS = MapperUtils.mapperList(headDTO.getAccApplyAttItem(), AccApplyCloseAccountItemPO.class);
        //获取表单编号
        String docID = closeAccountDTO.getFormInfo().getDocID();

        //查询数据库并删除符合此id的数据
        AccApplyCloseAccountPO countPo = new AccApplyCloseAccountPO();
        countPo.setHeadid(docID);
        int count = this.accApplyCloseAccPOMapper.selectCount(countPo);
        if (count > 0) {
            accApplyCloseAccPOMapper.delete(countPo);
            AccApplyCloseAccountItemPO detelePO = new AccApplyCloseAccountItemPO();
            detelePO.setHeadid(countPo.getHeadid());
            accApplyCloseAccItemPOMapper.delete(detelePO);
        }
        //添加操作
        accCloseAccountPO.setHeadid(docID);
        accCloseAccountPO.setCreateTime(LocalDateTime.now());
        accCloseAccountPO.setUpdateTime(LocalDateTime.now());
        accCloseAccountPO.setCreateBy("1");
        accCloseAccountPO.setUpdateBy("1");
        accApplyCloseAccPOMapper.insertSelective(accCloseAccountPO);
        accApplyCloseAccountItemPOS.stream().forEach(s -> {
            if (!s.getFilename().equals("")) {
                s.setHeadid(docID);
                accApplyCloseAccItemPOMapper.insertSelective(s);
            }
        });

        //封装返回参数
        ResultData resultData = new ResultData();
        resultData.setDocID(docID);
        resultData.setProcessTempID(closeAccountDTO.getFormInfo().getProcessTempID());
        //拼接url
        String sapurl = "http://" + ipSapUrl + ":" + port + "/sap/fundsmanager/fundsmanagerIndex.html?docID=" + docID + "&tempID="
                + closeAccountDTO.getFormInfo().getProcessTempID() + "&act=";
        resultData.setFormURL(sapurl);
        return resultData;
    }

    @Override
    public AccApplyCloseAccountVO getAccApplyCloseAccAllInfo(String billsNumber) {
        //查询主表数据
        AccApplyCloseAccountPO selectPO = new AccApplyCloseAccountPO();
        selectPO.setHeadid(billsNumber);
        AccApplyCloseAccountPO applyCloseAccountPO = this.accApplyCloseAccPOMapper.selectOne(selectPO);
        if (applyCloseAccountPO == null) {
            throw exceptionManager.createByCode("SAP_FM_CA_001");
        }
        //copy主表数据
        AccApplyCloseAccountVO headVO = MapperUtils.mapperBean(applyCloseAccountPO, AccApplyCloseAccountVO.class);
        //查询子表数据
        AccApplyCloseAccountItemPO selecct = new AccApplyCloseAccountItemPO();
        selecct.setHeadid(billsNumber);
        List<AccApplyCloseAccountItemPO> accApplyCloseItemPOS = new ArrayList<AccApplyCloseAccountItemPO>();
        accApplyCloseItemPOS = this.accApplyCloseAccItemPOMapper.select(selecct);
        //copy字表数据
        List<AccApplyCloseAccountItemVO> closeAccountItemVOS = new ArrayList<AccApplyCloseAccountItemVO>();
        if (accApplyCloseItemPOS.size() > 0) {
            closeAccountItemVOS = MapperUtils.mapperList(accApplyCloseItemPOS, AccApplyCloseAccountItemVO.class);
        }
        headVO.setSettexchAtttItemVO(closeAccountItemVOS);

        return headVO;
    }
}
