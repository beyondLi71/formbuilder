package com.bgy.controller.cost;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.ConsBudDTO;
import com.bgy.entity.vo.ConsBudHeadVO;
import com.bgy.service.ConsBudService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 20:06
 * @desc 消耗预算.
 */
@Api(value = "费用表单", tags = {"cost"})
@RestController
@RequestMapping(value = "/cost/consbud")
public class ConsBudContoller {

    @Resource
    ConsBudService consBudService;

    /**
     * @author LF--liufang@maxrocky.com
     * @desc  .保存FM053 (预算执行结果管理-消耗预算调整 SAP-表单)
     */
    @RequestMapping(value = "/saveconsbudall", method = RequestMethod.POST)
    @ApiOperation(value = "保存FM053 (预算执行结果管理-消耗预算调整 SAP-表单)", produces = "application/json")
    public AbstractApiResult saveConsBudAll(@RequestBody ConsBudDTO consBud) {
        ResultData result = consBudService.saveConsBudAll(consBud);
        return AbstractApiResult.success(result);
    }

    /**
     * @author LF--liufang@maxrocky.com
     * @desc  .显示FM053 (预算执行结果管理-消耗预算调整 SAP-表单)
     */
    @RequestMapping(value = "/getconsbudall/{headId}", method = RequestMethod.GET)
    @ApiOperation(value = "显示FM053 (预算执行结果管理-消耗预算调整 SAP-表单)", produces = "application/json")
    public AbstractApiResult getConsBudAll(@PathVariable String headId) {
        ConsBudHeadVO result = consBudService.getConsBudAll(headId);
        return AbstractApiResult.success(result);
    }
}

