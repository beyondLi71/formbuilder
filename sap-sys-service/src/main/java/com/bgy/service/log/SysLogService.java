package com.bgy.service.log;

import com.bgy.common.utils.page.PageParam;
import com.bgy.common.utils.page.PageResult;
import com.bgy.entity.dto.AddLogInterfaceDTO;
import com.bgy.entity.dto.DelLogInterfaceDTO;
import com.bgy.entity.dto.GetLogInterfaceKeyWordDTO;
import com.bgy.entity.dto.UpdateLogInterfaceDTO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * Created by beyondLi
 * Date 2018/4/11 22:08
 * Desc .
 */
@Validated
public interface SysLogService {
    /**
     * 新增日志所监管的接口
     * @param addLogInterfaceDTO
     */
    void addInterface(@Valid AddLogInterfaceDTO addLogInterfaceDTO);

    /**
     * 根据id集合删除对应接口以及以下对应记录
     * @param delLogInterfaceDTO
     */
    void deleteInterfaceById(DelLogInterfaceDTO delLogInterfaceDTO);

    /**
     * 根据id修改接口信息
     * @param updateLogInterfaceDTO
     */
    void updateInterfaceById(@Valid UpdateLogInterfaceDTO updateLogInterfaceDTO);

    /**
     * 根据条件进行接口列表显示
     * @param getLogInterfaceKeyWordDTO
     * @return
     */
    PageResult getInterfaceList(GetLogInterfaceKeyWordDTO getLogInterfaceKeyWordDTO, PageParam pageParam);
}
