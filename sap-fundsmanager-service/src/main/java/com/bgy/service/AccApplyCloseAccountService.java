package com.bgy.service;


import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.AccApplyCloseAccountDTO;
import com.bgy.entity.vo.AccApplyCloseAccountVO;
import org.springframework.stereotype.Service;

/**
 * @author yyg
 * @date 2018/4/18 13:53
 * @desc TR-TR034_3-账户变更 实现类
 */
@Service
public interface AccApplyCloseAccountService {

    ResultData addAccApplyCloseAcc(AccApplyCloseAccountDTO dto);

    AccApplyCloseAccountVO getAccApplyCloseAccAllInfo(String billsNumber);
}
