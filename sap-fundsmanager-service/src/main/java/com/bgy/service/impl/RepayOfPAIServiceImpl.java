package com.bgy.service.impl;

import com.bgy.common.utils.SysReturnSapUrlConfig;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.exception.ExceptionManager;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.RepayOfPAIAttItemPOMapper;
import com.bgy.dao.RepayOfPAIHeadPOMapper;
import com.bgy.dao.RepayOfPAIItemPOMapper;
import com.bgy.entity.dto.*;
import com.bgy.entity.po.*;
import com.bgy.entity.vo.FundTransHeadVO;
import com.bgy.entity.vo.RepayOfPAIHeadVO;
import com.bgy.service.RepayOfPAIService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @desc TR085 Service层实现类
 * @author linlangleo
 * @date 2018-04-19 11:08
 **/
@Service
public class RepayOfPAIServiceImpl implements RepayOfPAIService {
    @Resource
    private RepayOfPAIAttItemPOMapper repayOfPAIAttItemPOMapper;
    @Resource
    private RepayOfPAIHeadPOMapper repayOfPAIHeadPOMapper;
    @Resource
    private RepayOfPAIItemPOMapper repayOfPAIItemPOMapper;
    @Resource
    private SysReturnSapUrlConfig sysReturnSapUrlConfig;
    @Resource
    private ExceptionManager exceptionManager;

    /**
     * 向数据库插入，TR085的表单数据
     */
    @Override
    public ResultData saveRepayOfPAI(RepayOfPAIBusinessDataDTO businessData, FormInfoDTO formInfo) {
        //进行数据拷贝
        RepayOfPAIHeadPO repayOfPAIHeadPO =
                MapperUtils.mapperBean(businessData.getRepayOfPAIRecord(), RepayOfPAIHeadPO.class);
        List<RepayOfPAIItemPO> repayOfPAIItemPOList =
                MapperUtils.mapperList(businessData.getRepayOfPAIRecord().getRepayOfPAIItemList(),
                        RepayOfPAIItemPO.class);
        List<AttItemPO> repayOfPAIAttItemPOList =
                MapperUtils.mapperList(businessData.getRepayOfPAIRecord().getRepayOfPAIAttItemList(),
                        AttItemPO.class);

        //获取单号
        String docID =  formInfo.getDocID();

        //查询数据库并删除符合此id的数据
        RepayOfPAIHeadPO repayOfPAIHeadPO_del = new RepayOfPAIHeadPO();
        repayOfPAIHeadPO_del.setHeadId(docID);
        RepayOfPAIItemPO repayOfPAIItemPO_del = new RepayOfPAIItemPO();
        repayOfPAIItemPO_del.setHeadId(docID);
        AttItemPO repayOfPAIAttItemPO_del = new AttItemPO();
        repayOfPAIAttItemPO_del.setHeadId(docID);
        repayOfPAIAttItemPOMapper.delete(repayOfPAIAttItemPO_del);
        repayOfPAIHeadPOMapper.delete(repayOfPAIHeadPO_del);
        repayOfPAIItemPOMapper.delete(repayOfPAIItemPO_del);

        //分别插入主表/明细表的数据
        repayOfPAIHeadPO.setHeadId(docID);
        repayOfPAIHeadPOMapper.insertSelective(repayOfPAIHeadPO);
        if(repayOfPAIItemPOList != null && repayOfPAIItemPOList.size() > 0){
            repayOfPAIItemPOList.stream().forEach(repayItem -> {
                repayItem.setHeadId(docID);
                repayOfPAIItemPOMapper.insertSelective(repayItem);
            });
        }
        if(repayOfPAIAttItemPOList != null && repayOfPAIAttItemPOList.size() > 0){
            repayOfPAIAttItemPOList.stream().forEach(repayItem -> {
                repayItem.setHeadId(docID);
                repayItem.setCreate_time(LocalDateTime.now());
                repayItem.setCreate_by("admin");
                repayItem.setUpdate_time(LocalDateTime.now());
                repayItem.setUpdate_by("admin");
                repayOfPAIAttItemPOMapper.insertSelective(repayItem);
            });
        }

        //封装返回参数
        ResultData resultData = new ResultData();
        resultData.setDocID(formInfo.getDocID());//单号
        resultData.setProcessTempID(formInfo.getProcessTempID());//流程模板ID
        //拼接url
        resultData.setFormURL(sysReturnSapUrlConfig.
                returnUrl(formInfo.getDocID(), formInfo.getProcessTempID(), "fundsmanager"));//给SAP对应的地址
        return resultData;
    }

    /**
     * 根据单号获取TR005业务 数据
     */
    @Override
    public RepayOfPAIHeadVO getRepayOfPAI(String docID) {
        //根据docID，获取主表的数据
        RepayOfPAIHeadPO repayOfPAIHeadPO = new RepayOfPAIHeadPO();
        repayOfPAIHeadPO.setHeadId(docID);
        repayOfPAIHeadPO = repayOfPAIHeadPOMapper.selectOne(repayOfPAIHeadPO);
        //根据docID，获取明细表的数据
        List<RepayOfPAIItemPO> repayOfPAIItemPOList = null;
        RepayOfPAIItemPO repayOfPAIItemPO = new RepayOfPAIItemPO();
        repayOfPAIItemPO.setHeadId(docID);
        repayOfPAIItemPOList = repayOfPAIItemPOMapper.select(repayOfPAIItemPO);
        //根据docID，获取附件明细表的数据
        List<AttItemPO> repayOfPAIAttItemPOList = null;
        AttItemPO repayOfPAIAttItemPO = new AttItemPO();
        repayOfPAIAttItemPO.setHeadId(docID);
        repayOfPAIAttItemPOList = repayOfPAIAttItemPOMapper.select(repayOfPAIAttItemPO);
        //明细表放入主表
        if(repayOfPAIHeadPO == null){//非空判断
            throw exceptionManager.createByCode("SAP_FM_ROP_001");
        }
        repayOfPAIHeadPO.setRepayOfPAIItem(repayOfPAIItemPOList);
        repayOfPAIHeadPO.setRepayOfPAIAttItem(repayOfPAIAttItemPOList);

        //进行数据拷贝
        RepayOfPAIHeadVO repayOfPAIHeadVO = MapperUtils.mapperBean(repayOfPAIHeadPO, RepayOfPAIHeadVO.class);
        //把获取的主表/明细表 的数据放入到 表单数据DTO中
        return repayOfPAIHeadVO;
    }
}
