package com.bgy.controller.sys;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.entity.dto.FormFlowDTO;
import com.bgy.entity.vo.FormFlowVO;
import com.bgy.service.formmanager.FormFlowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @desc 表单流程Controller
 * @author linlangleo
 * @date 2018-04-22 20:29
 **/
@RestController
@Api(value = "sap", tags = {"sys"})
@RequestMapping("/formmanager/flow")
public class FormFlowController {
    @Resource
    private FormFlowService formFlowService;

    /**
     * 保存流程信息
     */
    @ApiOperation(value = "保存流程信息", produces = "application/json")
    @RequestMapping(value = "/saveflow", method = RequestMethod.POST)
    public AbstractApiResult saveFlow(FormFlowDTO formFlowDTO) {
        String result = formFlowService.saveFlow(formFlowDTO);

        return AbstractApiResult.success(result);
    }

    /**
     * 根据模块ID获取流程信息
     */
    @ApiOperation(value = "根据模块ID获取流程信息", produces = "application/json")
    @RequestMapping(value = "/getflowbymoduleid/{moduleId}", method = RequestMethod.GET)
    public AbstractApiResult getFlowByModuleId(@PathVariable String moduleId){
        //根据模块ID获取流程信息
        List<FormFlowVO> formFlowVOList = formFlowService.getFlowByModuleId(moduleId);

        return AbstractApiResult.success(formFlowVOList);
    }

    /**
     * 根据ID获取流程信息
     */
    @ApiOperation(value = "根据ID获取流程信息", produces = "application/json")
    @RequestMapping(value = "/getflowbyid/{flowId}", method = RequestMethod.GET)
    public AbstractApiResult getFlowById(@PathVariable long flowId){
        //根据ID获取流程信息
         FormFlowVO formFlowVO = formFlowService.getFlowById(flowId);

        return AbstractApiResult.success(formFlowVO);
    }

    /**
     * 删除流程信息
     */
    @ApiOperation(value = "删除流程信息", produces = "application/json")
    @RequestMapping(value = "/delflowbyid/{id}", method = RequestMethod.GET)
    public AbstractApiResult delFlowById(@PathVariable long id) {
        String result = formFlowService.delFlowById(id);

        return AbstractApiResult.success(result);
    }

    /**
     * 修改流程信息
     */
    @ApiOperation(value = "修改流程信息", produces = "application/json")
    @RequestMapping(value = "/updateflowbyid", method = RequestMethod.POST)
    public AbstractApiResult updateFlowById(FormFlowDTO formFlowDTO) {
        String result = formFlowService.updateFlowById(formFlowDTO);

        return AbstractApiResult.success(result);
    }
}
