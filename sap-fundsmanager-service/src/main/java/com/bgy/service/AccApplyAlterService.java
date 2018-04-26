package com.bgy.service;


import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.AccApplyAlterAllDTO;
import com.bgy.entity.vo.AccApplyAlterVO;
import org.springframework.stereotype.Service;

/**
* @author yyg
* @date 2018/4/18 18:56
* @desc TR-TR034_2-账户变更 实现类
*/
@Service
public interface AccApplyAlterService {

    ResultData addAccApplyAlter(AccApplyAlterAllDTO dto);

    AccApplyAlterVO getAccApplyAlterAllInfo(String billsNumber);
}
