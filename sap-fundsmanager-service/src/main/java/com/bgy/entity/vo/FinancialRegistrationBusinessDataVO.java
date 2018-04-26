package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 表单的数据实体
 * 主表(xxxHead)用对象存储，明细表(xxxItem)用list存储
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinancialRegistrationBusinessDataVO {
	
    //FinancialRegisterItem明细表
    private List<FinancialRegisterItemVO> financialRegisterItem;
}
