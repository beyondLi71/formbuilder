package com.bgy.controller.fundsmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.RefundOrderDTO;
import com.bgy.entity.dto.RepayOfPAIDTO;
import com.bgy.entity.vo.RepayOfPAIHeadVO;
import com.bgy.service.RepayOfPAIService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @desc TR085的controller
 * @author linlangleo
 * @date 2018-04-19 10:52
 **/
@RestController
@Api(value = "sap", tags = {"fundsmanager"})
@RequestMapping("/fundsmanager/repayofpai")
public class RepayOfPAIController {
    @Resource
    private RepayOfPAIService repayOfPAIService;

    /**
     * SAP 插入数据
     */
    @ApiOperation(value = "保存TR085 (还本付息付中收 SAP-表单)", produces = "application/json")
    @RequestMapping(value = "/saverepayofpai", method = RequestMethod.POST)
    public AbstractApiResult saveRepayOfPAI(@RequestBody RepayOfPAIDTO repayOfPAIDTO){
        //表单存入到数据库里面
        //获取结果数据实体
        ResultData resultData = repayOfPAIService.
                saveRepayOfPAI(repayOfPAIDTO.getBusinessData(), repayOfPAIDTO.getFormInfo());
        //返回结果数据实体的JSON格式
        return AbstractApiResult.success(resultData);
    }
    /**
     * 前端 获取数据
     */
    @ApiOperation(value = "查看TR085 (还本付息付中收 SAP-表单)", produces = "application/json")
    @RequestMapping(value = "/getrepayofpai/{docID}", method = RequestMethod.GET)
    public AbstractApiResult getRepayOfPAI(@PathVariable String docID) {
        //根据单号获取数据
        RepayOfPAIHeadVO repayOfPAIHeadVO =
                repayOfPAIService.getRepayOfPAI(docID);
        //返回查询的数据的JSON格式
        return AbstractApiResult.success(repayOfPAIHeadVO);

    }
}
