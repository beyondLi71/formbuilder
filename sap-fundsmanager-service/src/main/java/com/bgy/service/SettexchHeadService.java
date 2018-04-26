package com.bgy.service;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.SettexchDTO;
import com.bgy.entity.vo.SettexchHeadVO;
import org.springframework.stereotype.Service;

/**
 * @author yyg
 * @date 2018/4/17 14:48
 * @desc 资金划转及结汇购汇业务（结汇购汇业务) 接口
 */
@Service
public interface SettexchHeadService {

    /**
     * 数据写入
     * @param settexchDTO
     * @return ResultData
     */
    ResultData addSettexch(SettexchDTO settexchDTO);


    /**
     * 根据id查询表单数据
     * @param billsNumber
     * @return
     */
    SettexchHeadVO getSettexchAllInfo(String billsNumber);

}
