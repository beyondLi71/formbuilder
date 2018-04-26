package com.bgy.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TR058 数据总接收实体
 * @by linlangleo
 * @date 2018/4/19 15:10
 */
@Data
@ApiModel(value = "TR058数据总接收实体")
@NoArgsConstructor
@AllArgsConstructor
public class InterTransDTO {
    //表单基础信息
    @ApiModelProperty(value = "表单基础信息", example = "")
    private FormInfoDTO formInfo;

    //表单数据
    @ApiModelProperty(value = "表单业务数据", example = "")
    private InterTransBusinessDataDTO businessData;
}
