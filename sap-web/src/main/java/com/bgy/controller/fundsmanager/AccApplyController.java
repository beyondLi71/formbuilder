package com.bgy.controller.fundsmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.AccApplyDTO;
import com.bgy.entity.vo.AccApplyHeadVO;
import com.bgy.service.AccApplyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/19 15:39
 * @desc .TR034_1-开户行申请与表单的流程审批接口
 */
@RestController
@Api(value = "sap", tags = {"fundsmanager"})
@RequestMapping(value = "/fundsmanager/accapply")
public class AccApplyController {
    @Resource
    private AccApplyService accApplyService;


    /**
     * @author LF--liufang@maxrocky.com
     * @desc  .保存TR034_1-开户行申请与表单的流程审批接口
     */
    @RequestMapping(value = "/saveaccapplyall", method = RequestMethod.POST)
    @ApiOperation(value = "保存TR034_1-开户行申请与表单的流程审批接口", produces = "application/json")
    public AbstractApiResult saveAccApplyAll(@RequestBody AccApplyDTO accApply) {
        ResultData result = accApplyService.saveAccApplyAll(accApply);
        return AbstractApiResult.success(result);
    }

    /**
     * @author LF--liufang@maxrocky.com
     * @desc  .显示FM005 (专项预算调整 SAP-表单)
     */
    @RequestMapping(value = "/getaccapplyall/{headId}", method = RequestMethod.GET)
    @ApiOperation(value = "显示TR034_1-开户行申请与表单的流程审批接口", produces = "application/json")
    public AbstractApiResult getAccApplyAll(@PathVariable String headId) {
        AccApplyHeadVO result = accApplyService.getAccApplyAll(headId);
        return AbstractApiResult.success(result);
    }
}

