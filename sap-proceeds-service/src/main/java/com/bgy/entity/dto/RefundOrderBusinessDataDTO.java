package com.bgy.entity.dto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

/**
 * @desc AR-108 数据实体
 * @author linlangleo
 * @date 2018-04-22 8:37
 **/
@Data
@ApiModel(value = "AR-108 数据实体")
@NoArgsConstructor
@AllArgsConstructor
public class RefundOrderBusinessDataDTO {
    @Valid
    @ApiModelProperty(value = "AR-108主表实体", example = "")
    private  RefundOrderHeadDTO refundOrderRecord;
}
