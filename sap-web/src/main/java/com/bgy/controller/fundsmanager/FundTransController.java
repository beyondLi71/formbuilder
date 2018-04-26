package com.bgy.controller.fundsmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.FinancialRegistrationDTO;
import com.bgy.entity.dto.FundTransDTO;
import com.bgy.entity.vo.FundTransBusinessDataVO;
import com.bgy.entity.vo.FundTransHeadVO;
import com.bgy.service.FundTransService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 资金划转及结汇购汇业务（资金划转业务）的controller
 * @by linlangleo
 * @date 2018/4/18 9:59
 */
@RestController
@Api(value = "sap", tags = {"fundsmanager"})
@RequestMapping(value = "/fundsmanager/fundtrans")
public class FundTransController {
    @Resource
    private FundTransService fundTransService;

    /**
     * SAP 插入数据
     */
    @ApiOperation(value = "保存TR020-01-资金划转及结汇购汇业务（资金划转业务）", produces = "application/json")
    @RequestMapping(value = "/savefundtrans", method = RequestMethod.POST)
    public AbstractApiResult saveFundTrans(@RequestBody FundTransDTO fundTransDTO) {
        //表单存入到数据库里面
        //获取结果数据实体
        ResultData resultData = fundTransService.saveFundTrans(fundTransDTO.getBusinessData(), fundTransDTO.getFormInfo());
        //返回封装的参数
        return AbstractApiResult.success(resultData);
    }
    /**
     * 前端 获取数据
     */
    @ApiOperation(value = "查看TR020-01-资金划转及结汇购汇业务（资金划转业务）", produces = "application/json")
    @RequestMapping(value = "/getfundtrans/{docId}", method = RequestMethod.GET)
    public AbstractApiResult getFundTrans(@PathVariable String docId){
        //根据单号获取数据
        FundTransHeadVO fundTransHeadVO = fundTransService.getFundTrans(docId);
        //返回查询的数据的JSON格式
        return AbstractApiResult.success(fundTransHeadVO);
    }

}
