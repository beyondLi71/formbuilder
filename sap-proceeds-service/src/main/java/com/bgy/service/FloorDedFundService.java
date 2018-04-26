package com.bgy.service;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.FloorDedFundBusinessDataDTO;
import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.entity.vo.FloorDedFundHeadVO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/24 17:43
 * @desc AR-IF017售楼抵楼款应收传输接口 service
 */
@Validated
public interface FloorDedFundService {
    /**
     * 向数据库插入表单数据
     */
    ResultData saveFloorDedFund(@Valid FloorDedFundBusinessDataDTO businessData, @Valid FormInfoDTO formInfo);

    /**
     * 查询表单
     */
    FloorDedFundHeadVO getFloorDedFund(String docID);
}
