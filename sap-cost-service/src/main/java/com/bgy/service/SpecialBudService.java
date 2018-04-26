package com.bgy.service;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.SpecialBudDTO;
import com.bgy.entity.vo.SpecialBudHeadVO;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 10:55
 * @desc ${DESCRIPTION}.
 */

public interface SpecialBudService {

    ResultData saveSpecialBudAll(SpecialBudDTO specialBud);

    SpecialBudHeadVO getSpecialBudAll(String headId);
}
