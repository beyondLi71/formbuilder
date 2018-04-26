package com.bgy.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 资金划转业务流程 数据总接收实体
 * @by linlangleo
 * @date 2018/4/18 10:33
 */
@Data
@ApiModel(value = "资金划转业务流程的数据总接收实体")
@NoArgsConstructor
@AllArgsConstructor
public class FundTransDTO {
    //表单基础信息
    @ApiModelProperty(value = "表单基础信息", example = "")
    private FormInfoDTO formInfo;

    //表单数据
    @ApiModelProperty(value = "表单业务数据", example = "")
    private FundTransBusinessDataDTO businessData;
}
