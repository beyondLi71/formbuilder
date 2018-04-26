package com.bgy.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 资金管理:理财登记流程
 * 包含 表单基础信息实体和表单数据实体
 */
@Data
@ApiModel(value = "理财登记流程的总数据接收实体")
@AllArgsConstructor
@NoArgsConstructor
public class FinancialRegistrationDTO {
    //表单基础信息
    @ApiModelProperty(value = "表单基础信息", example = "")
    private FormInfoDTO formInfo;
    
    //表单数据
    @ApiModelProperty(value = "表单业务数据", example = "")
    private FinancialRegistrationBusinessDataDTO businessData;
}
