package com.bgy.controller.cost;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.InitBudDTO;
import com.bgy.entity.vo.InitBudHeadVO;
import com.bgy.service.InitBudService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 20:06
 * @desc FM045 (一般预算初始化导入 SAP-表单)
 */
@Api(value = "费用表单", tags = {"cost"})
@RestController
@RequestMapping(value = "/cost/initbud")
public class InitBudContoller {

    @Resource
    InitBudService initBudService;

    /**
     * @author LF--liufang@maxrocky.com
     * @desc  .保存FM045 (一般预算初始化导入 SAP-表单)
     */
    @RequestMapping(value = "/saveinitbudall", method = RequestMethod.POST)
    @ApiOperation(value = "保存FM045 (一般预算初始化导入 SAP-表单)", produces = "application/json")
    public AbstractApiResult saveInitBudAll(@RequestBody InitBudDTO initBud) {
        ResultData result = initBudService.saveConsBudAll(initBud);
        return AbstractApiResult.success(result);
    }

    /**
     * @author LF--liufang@maxrocky.com
     * @desc  .显示FM045 (一般预算初始化导入 SAP-表单)
     */
    @RequestMapping(value = "/getinitbudall/{headId}", method = RequestMethod.GET)
    @ApiOperation(value = "显示FM045 (一般预算初始化导入 SAP-表单)", produces = "application/json")
    public AbstractApiResult getInitBudAll(@PathVariable String headId) {
        InitBudHeadVO result = initBudService.getInitBudAll(headId);
        return AbstractApiResult.success(result);
    }
}

