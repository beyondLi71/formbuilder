package com.bgy.service;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.AccApplyDTO;
import com.bgy.entity.vo.AccApplyHeadVO;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/19 15:37
 * @desc ${DESCRIPTION}.
 */

public interface AccApplyService {
    ResultData saveAccApplyAll(AccApplyDTO accApply);

    AccApplyHeadVO getAccApplyAll(String headId);
}
