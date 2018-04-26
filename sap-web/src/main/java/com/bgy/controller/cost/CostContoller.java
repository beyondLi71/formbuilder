package com.bgy.controller.cost;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.SpecialBudDTO;
import com.bgy.entity.vo.SpecialBudHeadVO;
import com.bgy.service.SpecialBudService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 9:23
 * @desc 费用接口.
 */
@Api(value = "费用表单", tags = {"cost"})
@RestController
@RequestMapping(value = "/cost")
public class CostContoller {

    @Resource
    private SpecialBudService specialBudService;


    /**
     * @author LF--liufang@maxrocky.com
     * @desc  .保存FM005 (专项预算调整 SAP-表单)
     */
    @RequestMapping(value = "/savespecialbudall", method = RequestMethod.POST)
    @ApiOperation(value = "保存FM005 (专项预算调整 SAP-表单)", produces = "application/json")
    public AbstractApiResult saveSpecialBudAll(@RequestBody SpecialBudDTO specialBud) {
        ResultData result = specialBudService.saveSpecialBudAll(specialBud);
        return AbstractApiResult.success(result);
    }

    /**
     * @author LF--liufang@maxrocky.com
     * @desc  .显示FM005 (专项预算调整 SAP-表单)
     */
    @RequestMapping(value = "/getspecialbudall/{headId}", method = RequestMethod.GET)
    @ApiOperation(value = "显示FM005 (专项预算调整 SAP-表单)", produces = "application/json")
    public AbstractApiResult getSpecialBudAll(@PathVariable String headId) {
        SpecialBudHeadVO result = specialBudService.getSpecialBudAll(headId);
        return AbstractApiResult.success(result);
    }
}

