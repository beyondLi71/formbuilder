package com.bgy.entity.vo;

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
@AllArgsConstructor
@NoArgsConstructor
public class BusinessDataVO {
    public List<PaymentOrderItemVO> paymentOrderItem;
    public PaymentOrderHeadVO paymentOrderHead;
}
