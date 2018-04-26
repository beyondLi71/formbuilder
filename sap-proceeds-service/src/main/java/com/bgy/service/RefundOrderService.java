package com.bgy.service;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.entity.dto.RefundOrderBusinessDataDTO;
import com.bgy.entity.vo.RefundOrderHeadVO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author linlangleo
 * @desc
 * @date 2018-04-22 8:44
 **/
@Validated
public interface RefundOrderService {
    /**
     * 向数据库插入，资金划转业务流程的表单数据
     */
    ResultData saveRefundOrder(@Valid RefundOrderBusinessDataDTO businessData, @Valid FormInfoDTO formInfo);

    /**
     * 根据单号和节点id获取资金划转业务 数据
     */
    RefundOrderHeadVO getRefundOrder(String docID);
}
