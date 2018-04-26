package com.bgy.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

/**
 * AR-108 数据总接收实体
 * @by linlangleo
 * @date 2018/4/22 10:33
 */
@Data
@ApiModel(value = "AR-108数据总接收实体")
@NoArgsConstructor
@AllArgsConstructor
public class RefundOrderDTO {
    //表单基础信息
    @ApiModelProperty(value = "表单基础信息", example = "")
    private FormInfoDTO formInfo;

    //表单数据
    @Valid
    @ApiModelProperty(value = "表单业务数据", example = "")
    private RefundOrderBusinessDataDTO businessData;
}
