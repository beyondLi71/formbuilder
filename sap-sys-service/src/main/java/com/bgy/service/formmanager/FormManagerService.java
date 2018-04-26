package com.bgy.service.formmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 表单的service 接口
 */
@Validated
public interface FormManagerService {
    /**
     * 根据传进来的 流程Id，节点Id 获取对应的页面名称
     */
    String getPageOfNode(String processId, String nodeId);
}
