package com.bgy.service;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.entity.dto.RepayOfPAIBusinessDataDTO;
import com.bgy.entity.vo.RepayOfPAIHeadVO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @desc TR085 Service层接口
 * @author linlangleo
 * @date 2018-04-19 11:08
 **/
@Validated
public interface RepayOfPAIService {

    /**
     * 向数据库插入，资金划转业务流程的表单数据
     */
    ResultData saveRepayOfPAI(@Valid RepayOfPAIBusinessDataDTO businessData, @Valid FormInfoDTO formInfo);

    /**
     * 根据单号和节点id获取资金划转业务 数据
     */
    RepayOfPAIHeadVO getRepayOfPAI(String docID);
}
