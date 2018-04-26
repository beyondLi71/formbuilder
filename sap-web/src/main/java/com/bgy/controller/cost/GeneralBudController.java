package com.bgy.controller.cost;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.BudgetDTO;
import com.bgy.entity.vo.BudgetHeadVO;
import com.bgy.service.BudgetHeadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yyg
 * @date 2018/4/18 14:16
 * @desc FS-S4-FM007 (一般预算调整 SAP-表单)
 */
@RestController
@Api(value = "sap", tags = {"cost"})
@RequestMapping(value = "/cost/generalBud")
public class GeneralBudController {

    @Resource
    BudgetHeadService budgetHeadService;

    /**
     * 保存FS-S4-FM007 (一般预算调整 SAP-表单)sap写入数据
     *
     * @param dto
     * @return
     */
    @RequestMapping(value = "/saveGeneralBud", method = RequestMethod.POST)
    @ApiOperation(value = "保存FS-S4-FM007 (一般预算调整 SAP-表单)生成接口", produces = "application/json")
    public AbstractApiResult savePaymentAll(@RequestBody BudgetDTO dto) {
        ResultData resultData = budgetHeadService.addBudget(dto);
        return AbstractApiResult.success(resultData);
    }

    /***
     *  k2调用显示接口
     * @param billsNumber
     * @return
     */
    @RequestMapping(value = "/getGeneralBud/{billsNumber}", method = RequestMethod.GET)
    @ApiOperation(value = "FS-S4-FM007 (一般预算调整 SAP-表单)生成表单", produces = "application/json")
    public AbstractApiResult getPaymentAll(@PathVariable String billsNumber) {
        BudgetHeadVO result = budgetHeadService.getBudgetAllInfo(billsNumber);
        return AbstractApiResult.success(result);
    }

}
