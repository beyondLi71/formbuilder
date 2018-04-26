package com.bgy.controller.fundsmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.FinancialRegistrationDTO;
import com.bgy.entity.dto.GetSapInfoDTO;
import com.bgy.entity.vo.FinancialRegistrationBusinessDataVO;
import com.bgy.entity.vo.PaymentOrderHeadVO;
import com.bgy.service.FinancialRegistrationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 应付单的controller
 */
@RestController
@Api(value = "sap", tags = {"fundsmanager"})
@RequestMapping(value = "/fundsmanager")
public class FundsManagerController {
    @Resource
    FinancialRegistrationService financialRegistrationService;

    /**
     * SAP 传递数据调用的,理财登记流程接口
     */
    @ApiOperation(value = "保存TR001_2-理财登记与表单系统的流程审批接口", produces = "application/json")
    @RequestMapping(value = "/savefinancialregistration", method = RequestMethod.POST)
    public AbstractApiResult saveFinancialRegistration(@RequestBody FinancialRegistrationDTO financialRegistrationDTO) {
        //表单存入到数据库里面
        //获取结果数据实体
        ResultData resultData = financialRegistrationService.
                addFinancialRegistration(financialRegistrationDTO.getBusinessData(), financialRegistrationDTO.getFormInfo());
        //返回结果数据实体的JSON格式
        return AbstractApiResult.success(resultData);
    }
    /**
     * 前端 获取数据调用的,理财登记流程接口
     */
    @ApiOperation(value = "查看TR001_2-理财登记与表单系统的流程审批接口", produces = "application/json")
    @RequestMapping(value = "/getfinancialregistration/{docID}", method = RequestMethod.GET)
    public AbstractApiResult getFinancialRegistration(@PathVariable String docID) {
        //根据单号获取数据
        FinancialRegistrationBusinessDataVO financialRegistrationBusinessDataVO =
                financialRegistrationService.getFinancialRegistration(docID);
        //返回查询的数据的JSON格式
        return AbstractApiResult.success(financialRegistrationBusinessDataVO);

    }

    /**
     * SAP数据插入
     */
    @ApiOperation(value = "保存TR030_拉单付款K2审批流程交互", produces = "application/json")
    @RequestMapping(value = "/savepaymentorder", method = RequestMethod.POST)
    public AbstractApiResult savePaymentOrder(@RequestBody GetSapInfoDTO getSapInfoDTO) {
        ResultData resultData = financialRegistrationService.savePaymentOrder(getSapInfoDTO);
        return AbstractApiResult.success(resultData);
    }

    /**
     * 查询所有SAP数据
     */
    @ApiOperation(value = "查看TR030_拉单付款K2审批流程交互", produces = "application/json")
    @RequestMapping(value = "/getpaymentorder/{docId}", method = RequestMethod.GET)
    public AbstractApiResult getPaymentOrder(@PathVariable String docId) {
        PaymentOrderHeadVO paymentOrderHeadVO = financialRegistrationService.getPaymentOrder(docId);
        return AbstractApiResult.success(paymentOrderHeadVO);
    }
}
