package com.bgy.service;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.entity.dto.FundTransBusinessDataDTO;
import com.bgy.entity.vo.FundTransHeadVO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * 资金划转及结汇购汇业务（资金划转业务) Service层接口
 * @by linlangleo
 * @date 2018/4/18 10:43
 */
@Validated
public interface FundTransService {

    /**
     * 向数据库插入，资金划转业务流程的表单数据
     */
    ResultData saveFundTrans(@Valid FundTransBusinessDataDTO businessData, @Valid FormInfoDTO formInfo);

    /**
     * 根据单号和节点id获取资金划转业务 数据
     */
    FundTransHeadVO getFundTrans(String docID);
}
