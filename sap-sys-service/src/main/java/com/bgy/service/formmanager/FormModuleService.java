package com.bgy.service.formmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.entity.dto.FormModuleDTO;
import com.bgy.entity.vo.FormModuleVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @desc 模块的service接口
 * @author linlangleo
 * @date 2018-04-22 20:31
 **/
@Validated
public interface FormModuleService {
    /**
     * 新增模块
     */
    String saveModule(FormModuleDTO formModule);

    /**
     * 获取所有的模块信息
     */
    List<FormModuleVO> getAllModule();

    /**
     * 根据id获取模信息
     */
    FormModuleVO getModuleById(long id);

    /**
     * 根据id删除模块
     */
    String delModuleById(long id);

    /**
     * 修改模块信息
     */
     String updateModuleById(FormModuleDTO formModuleDTO);
}
