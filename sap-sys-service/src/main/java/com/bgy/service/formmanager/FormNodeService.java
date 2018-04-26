package com.bgy.service.formmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.entity.dto.FormNodeDTO;
import com.bgy.entity.vo.FormNodeVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @desc 节点的service接口
 * @author linlangleo
 * @date 2018-04-22 20:31
 **/
@Validated
public interface FormNodeService {
    /**
     * 新增节点
     */
    String saveNode(FormNodeDTO formNodeDTO);

    /**
     * 获取所有的节点信息
     */
    List<FormNodeVO> queryAllNode();

    /**
     * 根据流程ID，获取节点信息
     */
    List<FormNodeVO> getNodeByFlowId(String flowId);

    /**
     * 根据id删除节点
     */
    String delNodeById(long id);

    /**
     * 修改节点信息
     */
    String updateNodeById(FormNodeDTO formNodeDTO);
}
