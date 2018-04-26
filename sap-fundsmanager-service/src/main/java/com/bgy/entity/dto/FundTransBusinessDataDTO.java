package com.bgy.entity.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 资金划转业务的数据实体
 * @by linlangleo
 * @date 2018/4/18 10:35
 */
@Data
@ApiModel(value = "资金划转业务的数据实体")
@NoArgsConstructor
@AllArgsConstructor
public class FundTransBusinessDataDTO {
    private FundTransHeadDTO fundTransRecord;
}
