package com.bgy.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by beyondLi
 * Date 2018/4/12 10:55
 * Desc .
 */
@Data
@ApiModel(value = "拉单付款流程 数据实体")
@AllArgsConstructor
@NoArgsConstructor
public class BusinessDataDTO {
    @ApiModelProperty(value = "明细表", example = "")
    public List<PaymentOrderItemDTO> paymentOrderItem;

    @ApiModelProperty(value = "主表", example = "")
    public PaymentOrderHeadDTO paymentOrderHead;
}
