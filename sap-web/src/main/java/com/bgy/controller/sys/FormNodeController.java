package com.bgy.controller.sys;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.entity.dto.FormFlowDTO;
import com.bgy.entity.dto.FormNodeDTO;
import com.bgy.entity.vo.FormNodeVO;
import com.bgy.service.formmanager.FormNodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @desc 表单节点Controller
 * @author linlangleo
 * @date 2018-04-22 20:29
 **/
@RestController
@Api(value = "sap", tags = {"sys"})
@RequestMapping("/formmanager/node")
public class FormNodeController {
    @Resource
    private FormNodeService formNodeService;

    /**
     * 保存节点信息
     */
    @ApiOperation(value = "保存节点信息", produces = "application/json")
    @RequestMapping(value = "/savenode", method = RequestMethod.POST)
    public AbstractApiResult saveNode(FormNodeDTO formNodeDTO) {
        String result = formNodeService.saveNode(formNodeDTO);

        return AbstractApiResult.success(result);
    }

    /**
     * 根据流程ID，获取节点信息
     */
    @ApiOperation(value = "根据流程ID，获取节点信息", produces = "application/json")
    @RequestMapping(value = "/getnodebyflowid/{flowId}", method = RequestMethod.GET)
    public AbstractApiResult getNodeByFlowId(@PathVariable String flowId){
        List<FormNodeVO> formNodeVOList = formNodeService.getNodeByFlowId(flowId);

        return AbstractApiResult.success(formNodeVOList);
    }

    /**
     * 删除节点信息
     */
    @ApiOperation(value = "删除节点信息", produces = "application/json")
    @RequestMapping(value = "/delnodebyid/{id}", method = RequestMethod.GET)
    public AbstractApiResult delNodeById(@PathVariable long id) {
        String result = formNodeService.delNodeById(id);

        return AbstractApiResult.success(result);
    }

    /**
     * 修改节点信息
     */
    @ApiOperation(value = "修改节点信息", produces = "application/json")
    @RequestMapping(value = "/updatenodebyid", method = RequestMethod.POST)
    public AbstractApiResult updateNodeById(FormNodeDTO formNodeDTO) {
        String result = formNodeService.updateNodeById(formNodeDTO);

        return AbstractApiResult.success(result);
    }
}
