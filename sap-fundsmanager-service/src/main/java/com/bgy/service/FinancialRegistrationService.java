package com.bgy.service;

import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.FinancialRegistrationBusinessDataDTO;
import com.bgy.entity.dto.GetSapInfoDTO;
import com.bgy.entity.vo.FinancialRegistrationBusinessDataVO;
import com.bgy.entity.vo.PaymentOrderHeadVO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * 理财登记流程的业务层接口
 */
@Validated
public interface FinancialRegistrationService {

    /**
     * 向数据库插入，理财登记流程的表单数据
     */

    ResultData addFinancialRegistration(@Valid FinancialRegistrationBusinessDataDTO businessData, @Valid FormInfoDTO formInfo);

    /**
     * 向数据库中插入sap数据
     * @param getSapInfoDTO
     */
    ResultData savePaymentOrder(@Valid GetSapInfoDTO getSapInfoDTO);

    /**
     * 获取Sap信息
     * @return
     */
    PaymentOrderHeadVO getPaymentOrder(String docId);

    /**
     * 根据单号和节点id获取 理财登记流程 数据
     */
    FinancialRegistrationBusinessDataVO getFinancialRegistration(String docID);
}
