package com.bgy.service;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.entity.dto.SpecTransrBusinessDataDTO;
import com.bgy.entity.vo.SpecTransrHeadVO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/23 23:40
 * @desc TR-096表单服务
 */
@Validated
public interface SpecTransrService {
    /**
     * 向数据库插入表单数据
     */
    ResultData saveSpecTransr(@Valid SpecTransrBusinessDataDTO businessData, @Valid FormInfoDTO formInfo);

    /**
     * 查询表单数据
     */
    SpecTransrHeadVO getSpecTransr(String docID);
}
