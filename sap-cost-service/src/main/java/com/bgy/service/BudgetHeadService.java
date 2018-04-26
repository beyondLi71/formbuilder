package com.bgy.service;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.BudgetDTO;
import com.bgy.entity.vo.BudgetHeadVO;
import org.springframework.stereotype.Service;

/**
* @author yyg
* @date 2018/4/18 13:31
* @desc  一般结算调整接口
*/
@Service
public interface BudgetHeadService {

    /**
     * 数据写入
     * @param budgetDTO
     * @return ResultData
     */
    ResultData addBudget(BudgetDTO budgetDTO);


    /**
     * 根据id查询表单数据
     * @param billsNumber
     * @return
     */
    BudgetHeadVO getBudgetAllInfo(String billsNumber);

}
