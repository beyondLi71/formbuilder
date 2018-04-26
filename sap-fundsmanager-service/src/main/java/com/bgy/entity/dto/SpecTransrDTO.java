package com.bgy.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/23 23:19
 * @desc TR-096特转审批单实体 接收DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "TR-096特转审批单实体接收dto")
public class SpecTransrDTO {
    //表单基础信息
    @ApiModelProperty(value = "表单基础信息", example = "")
    private FormInfoDTO formInfo;

    //表单数据
    @ApiModelProperty(value = "表单业务数据", example = "")
    private SpecTransrBusinessDataDTO businessData;
}
