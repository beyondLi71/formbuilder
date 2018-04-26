package com.bgy.service;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.InitBudDTO;
import com.bgy.entity.vo.InitBudHeadVO;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/19 11:43
 * @desc ${DESCRIPTION}.
 */

public interface InitBudService {
    ResultData saveConsBudAll(InitBudDTO initBud);


    InitBudHeadVO getInitBudAll(String headId);
}
