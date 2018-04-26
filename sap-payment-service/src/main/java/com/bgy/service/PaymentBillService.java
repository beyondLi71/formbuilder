package com.bgy.service;


import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.PayMentDTO;
import com.bgy.entity.vo.AccountPayDocHeadVO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * 应付单的业务层接口
 */
@Validated
public interface PaymentBillService {

    /**
     * 新增应付单
     */
    ResultData addPaymentBill(@Valid PayMentDTO payMentDTO);

    /**
     * 根据id查询表单数据
     */
    AccountPayDocHeadVO getPayAll(String billsNumber);

}
