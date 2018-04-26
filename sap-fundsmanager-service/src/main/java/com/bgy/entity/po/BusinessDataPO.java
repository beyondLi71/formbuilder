package com.bgy.entity.po;

import com.bgy.entity.dto.PaymentOrderHeadDTO;
import com.bgy.entity.dto.PaymentOrderItemDTO;
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
public class BusinessDataPO {
    public List<PaymentOrderItemPO> paymentOrderItem;
    public PaymentOrderHeadPO paymentOrderHead;
}
