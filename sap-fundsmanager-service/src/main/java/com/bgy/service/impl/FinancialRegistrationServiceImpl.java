package com.bgy.service.impl;

import com.bgy.common.utils.SysReturnSapUrlConfig;
import com.bgy.common.utils.exception.ExceptionManager;
import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.FinancialRegistrationCUDMapper;
import com.bgy.dao.FinancialRegistrationQueryMapper;
import com.bgy.entity.dto.FinancialRegistrationBusinessDataDTO;
import com.bgy.entity.dto.GetSapInfoDTO;
import com.bgy.entity.po.*;
import com.bgy.entity.vo.FinancialRegisterItemVO;
import com.bgy.entity.vo.FinancialRegistrationBusinessDataVO;
import com.bgy.entity.vo.PaymentOrderHeadVO;
import com.bgy.service.FinancialRegistrationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 *  理财登记流程的业务层实现类
 */
@Service
public class FinancialRegistrationServiceImpl implements FinancialRegistrationService {
    @Resource
    private FinancialRegistrationCUDMapper financialRegistrationCUDMapper;
    @Resource
    private FinancialRegistrationQueryMapper financialRegistrationQueryMapper;
    @Resource
    private SysReturnSapUrlConfig sysReturnSapUrlConfig;
    @Resource
    private ExceptionManager exceptionManager;

    /**
     * 向数据库插入,理财登记流程的表单数据
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData addFinancialRegistration(FinancialRegistrationBusinessDataDTO businessData, FormInfoDTO formInfo) {
        //进行数据拷贝
        List<FinancialRegisterItemPO> financialRegisterItemPOList = null;
        //非空判断
        if(businessData.getFinancialRegisterItem() != null && businessData.getFinancialRegisterItem().size() > 0){
            financialRegisterItemPOList = MapperUtils.
                    mapperList(businessData.getFinancialRegisterItem(), FinancialRegisterItemPO.class);
        }

        //获取单号
        String docID =  formInfo.getDocID();

        //查询数据库并删除符合此id的数据
        //根据headId，删除financialRegisterItem明细表（FB_SAP_FM_FINANCIALREGISTITEM）
        financialRegistrationCUDMapper.delByHeadId("FB_SAP_FM_FINANCIALREGISTITEM", docID);

        //分别插入主表/明细表的数据
        //把financialRegisterItem明细表的数据，添加到数据库
        if(financialRegisterItemPOList != null && financialRegisterItemPOList.size() > 0){
            financialRegisterItemPOList.stream().forEach(frItem -> {    //循环泛型，依次添加主键并插入数据
                frItem.setId(UUID.randomUUID().toString().replaceAll("-", ""));//添加id
                financialRegistrationCUDMapper.addFinancialRegisterItem(frItem, docID);
            });
        }

        //返回结果数据实体
        ResultData resultData = new ResultData();
        resultData.setDocID(formInfo.getDocID());//单号
        resultData.setProcessTempID(formInfo.getProcessTempID());//流程模板ID
        //拼接url
        resultData.setFormURL(sysReturnSapUrlConfig.
                returnUrl(formInfo.getDocID(), formInfo.getProcessTempID(), "fundsmanager"));
        return resultData;
    }

    /**
     * 根据单号获取 理财登记流程 数据
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public FinancialRegistrationBusinessDataVO getFinancialRegistration(String docID){
        FinancialRegistrationBusinessDataVO financialRegistrationBusinessDataVO = new FinancialRegistrationBusinessDataVO();

        //先分别获取主表/明细表的数据
        //根据单号，获取financialRegisterItem明细表的数据
        List<FinancialRegisterItemPO> financialRegisterItemPOList = financialRegistrationQueryMapper.getFinancialRegistetItem(docID);
        if(financialRegisterItemPOList == null || financialRegisterItemPOList.size() <= 0){//非空判断
            throw exceptionManager.createByCode("SAP_FM_FR_001");
        }

        //进行数据拷贝
        List<FinancialRegisterItemVO> financialRegisterItemVOList =
                MapperUtils.mapperList(financialRegisterItemPOList, FinancialRegisterItemVO.class);

        //把获取的主表/明细表 的数据放入到 表单数据DTO中
        financialRegistrationBusinessDataVO.setFinancialRegisterItem(financialRegisterItemVOList);
        return financialRegistrationBusinessDataVO;
    }

    /**
     * 插入sap数据
     * @param getSapInfoDTO
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData savePaymentOrder(GetSapInfoDTO getSapInfoDTO) {
        //进行数据拷贝
        PaymentOrderHeadPO paymentOrderHeadVO = null;
        List<PaymentOrderItemPO> paymentOrderItemPO = null;
        if(getSapInfoDTO.getBusinessData().getPaymentOrderHead() != null){
            paymentOrderHeadVO = MapperUtils.
                    mapperBean(getSapInfoDTO.getBusinessData().getPaymentOrderHead(), PaymentOrderHeadPO.class);
        }
        if(getSapInfoDTO.getBusinessData().getPaymentOrderItem() != null && getSapInfoDTO.getBusinessData().getPaymentOrderItem().size() > 0){
            paymentOrderItemPO = MapperUtils.
                    mapperList(getSapInfoDTO.getBusinessData().getPaymentOrderItem(), PaymentOrderItemPO.class);
        }

        //新增之前，判断headId，存在就删除
        //根据headId，删除paymentOrderHead主表（FB_SAP_FM_PAYMENTORDERHEAD）信息
        financialRegistrationCUDMapper.delByHeadId("FB_SAP_FM_PAYMENTORDERHEAD", getSapInfoDTO.getFormInfo().getDocID());
        //根据headId，PaymentOrderItem明细表（FB_SAP_FM_PAYMENTORDERITEM）信息
        financialRegistrationCUDMapper.delByHeadId("FB_SAP_FM_PAYMENTORDERITEM", getSapInfoDTO.getFormInfo().getDocID());

        if(paymentOrderHeadVO != null){
            paymentOrderHeadVO.setHeadId(getSapInfoDTO.getFormInfo().getDocID());
            financialRegistrationCUDMapper.savePaymentOrderHead(paymentOrderHeadVO);
        }
        if(paymentOrderItemPO != null && paymentOrderItemPO.size() > 0){
            paymentOrderItemPO.stream().forEach(itemList -> {
                itemList.setHeadId(getSapInfoDTO.getFormInfo().getDocID());
                financialRegistrationCUDMapper.savePaymentOrderItem(itemList);
            });
        }

        ResultData resultData = new ResultData();
        //单号
        resultData.setDocID(getSapInfoDTO.getFormInfo().getDocID());
        //流程模板ID
        resultData.setProcessTempID(getSapInfoDTO.getFormInfo().getProcessTempID());
        //返回sap
        resultData.setFormURL(sysReturnSapUrlConfig.
                returnUrl(getSapInfoDTO.getFormInfo().getDocID(), getSapInfoDTO.getFormInfo().getProcessTempID(), "fundsmanager"));
        return resultData;
    }

    /**
     * 获取sap信息
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public PaymentOrderHeadVO getPaymentOrder(String docId) {
        //查询数据
        PaymentOrderHeadPO paymentOrderHeadPO = financialRegistrationQueryMapper.getPaymentOrderHeadInfo(docId);
        List<PaymentOrderItemPO> paymentOrderItemPOList = financialRegistrationQueryMapper.getPaymentOrderItemByHeadId(docId);
        if(paymentOrderHeadPO == null){//非空判断
            throw exceptionManager.createByCode("SAP_FM_PM_001");
        }
        paymentOrderHeadPO.setPaymentOrderItem(paymentOrderItemPOList);

        //进行数据拷贝
        PaymentOrderHeadVO paymentOrderHeadVO = MapperUtils.mapperBean(paymentOrderHeadPO, PaymentOrderHeadVO.class);
        return paymentOrderHeadVO;
    }
}
