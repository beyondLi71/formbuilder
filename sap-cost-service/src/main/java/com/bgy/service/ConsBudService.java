package com.bgy.service;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.ConsBudDTO;
import com.bgy.entity.vo.ConsBudHeadVO;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 20:13
 * @desc ${DESCRIPTION}.
 */

public interface ConsBudService {
    ResultData saveConsBudAll(ConsBudDTO consBud);

    ConsBudHeadVO getConsBudAll(String headId);
}
