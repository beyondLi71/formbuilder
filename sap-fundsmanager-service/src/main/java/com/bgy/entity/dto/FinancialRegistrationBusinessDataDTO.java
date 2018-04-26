package com.bgy.entity.dto;

import java.util.ArrayList;
import java.util.List;

import com.bgy.entity.po.FinancialRegisterItemPO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表单的数据实体
 * 主表(xxxHead)用对象存储，明细表(xxxItem)用list存储
 */
@Data
@ApiModel(value = "理财登记流程 数据实体")
@AllArgsConstructor
@NoArgsConstructor
public class FinancialRegistrationBusinessDataDTO {
	
    //FinancialRegisterItem明细表
    @ApiModelProperty(value = "明细表", example = "")
    private List<FinancialRegisterItemDTO> financialRegisterItem;
}
