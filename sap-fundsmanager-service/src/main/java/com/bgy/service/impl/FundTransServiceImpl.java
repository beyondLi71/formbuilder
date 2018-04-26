package com.bgy.service.impl;

import com.bgy.common.utils.SysReturnSapUrlConfig;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.exception.ExceptionManager;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.FundTransAttItemPOMapper;
import com.bgy.dao.FundTransHeadPOMapper;
import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.entity.dto.FundTransBusinessDataDTO;
import com.bgy.entity.po.FundTransAttItemPO;
import com.bgy.entity.po.FundTransHeadPO;
import com.bgy.entity.vo.FundTransHeadVO;
import com.bgy.service.FundTransService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 资金划转及结汇购汇业务（资金划转业务) Service层实现类
 * @by linlangleo
 * @date 2018/4/18 10:45
 */
@Service
public class FundTransServiceImpl implements FundTransService {
    @Resource
    private FundTransHeadPOMapper fundTransHeadPOMapper;
    @Resource
    private FundTransAttItemPOMapper fundTransAttItemPOMapper;
    @Resource
    private SysReturnSapUrlConfig sysReturnSapUrlConfig;
    @Resource
    private ExceptionManager exceptionManager;

    /**
     * 向数据库插入，资金划转业务流程的表单数据
     */
    @Override
    public ResultData saveFundTrans(FundTransBusinessDataDTO businessData, FormInfoDTO formInfo) {
        //进行数据拷贝
        FundTransHeadPO fundTransHeadPO =
                MapperUtils.mapperBean(businessData.getFundTransRecord(), FundTransHeadPO.class);
        List<FundTransAttItemPO> fundTransAttItemPOList =
                MapperUtils.mapperList(businessData.getFundTransRecord().getFundTransAttItem(),
                        FundTransAttItemPO.class);

        //获取单号
        String docID =  formInfo.getDocID();

        //查询数据库并删除符合此id的数据
        FundTransHeadPO fundTransHeadPO_del = new FundTransHeadPO();
        fundTransHeadPO_del.setHeadId(docID);
        FundTransAttItemPO fundTransAttItemPO_del = new FundTransAttItemPO();
        fundTransAttItemPO_del.setHeadId(docID);
        fundTransHeadPOMapper.delete(fundTransHeadPO_del);
        fundTransAttItemPOMapper.delete(fundTransAttItemPO_del);

        //分别插入主表/明细表的数据
        fundTransHeadPO.setHeadId(docID);
        fundTransHeadPOMapper.insertSelective(fundTransHeadPO);
        if(fundTransAttItemPOList != null && fundTransAttItemPOList.size() > 0){
            fundTransAttItemPOList.stream().forEach(fundItem -> {
                fundItem.setHeadId(docID);
                fundTransAttItemPOMapper.insertSelective(fundItem);
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
     * 根据单号获取资金划转业务 数据
     */
    @Override
    public FundTransHeadVO getFundTrans(String docID) {
        //根据docID，获取主表的数据
        FundTransHeadPO fundTransHeadPO_select = new FundTransHeadPO();
        fundTransHeadPO_select.setHeadId(docID);
        fundTransHeadPO_select = fundTransHeadPOMapper.selectOne(fundTransHeadPO_select);
        //根据docID，获取附件明细表的数据
        List<FundTransAttItemPO> fundTransAttItemPOList_select = null;
        FundTransAttItemPO fundTransAttItemPO_select = new FundTransAttItemPO();
        fundTransAttItemPO_select.setHeadId(docID);
        fundTransAttItemPOList_select = fundTransAttItemPOMapper.select(fundTransAttItemPO_select);
        //明细表放入主表
        if(fundTransHeadPO_select == null){//非空判断
            throw exceptionManager.createByCode("SAP_FM_FT_001");
        }
        fundTransHeadPO_select.setFundTransAttItem(fundTransAttItemPOList_select);

        //进行数据拷贝
        FundTransHeadVO fundTransHeadVO = MapperUtils.mapperBean(fundTransHeadPO_select, FundTransHeadVO.class);
        //把获取的主表/明细表 的数据放入到 表单数据DTO中
        return fundTransHeadVO;
    }
}
