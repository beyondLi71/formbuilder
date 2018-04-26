package com.bgy.controller.fundsmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.SettexchDTO;
import com.bgy.entity.vo.SettexchHeadVO;
import com.bgy.service.SettexchHeadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* @author yyg
* @date 2018/4/17 17:19
* @desc  资金划转及结汇购汇业务（结汇购汇业务)
*/
@RestController
@Api(value = "sap", tags = {"fundsmanager"})
@RequestMapping(value = "/fundsmanager/settexch")
public class SettexchController {

    @Resource
    SettexchHeadService  settexchHeadService;

    /**
     *  资金划转及结汇购汇业务（结汇购汇业务)sap写入数据
     * @param settexchDTO
     * @return
     */
    @RequestMapping(value = "/saveSettexch", method = RequestMethod.POST)
    @ApiOperation(value = "保存FS-S4-TR020-02资金划转及结汇购汇业务（结汇购汇业务生成接口", produces = "application/json")
    public AbstractApiResult savePaymentAll(@RequestBody SettexchDTO settexchDTO) {
        ResultData resultData = settexchHeadService.addSettexch(settexchDTO);
        return AbstractApiResult.success(resultData);
    }

    /***
     *  k2调用显示接口
     * @param billsNumber
     * @return
     */
    @RequestMapping(value = "/getSettexch/{billsNumber}", method = RequestMethod.GET)
    @ApiOperation(value = "FS-S4-TR020-02资金划转及结汇购汇业务（结汇购汇业务生成接口", produces = "application/json")
    public AbstractApiResult getPaymentAll(@PathVariable String billsNumber) {
        SettexchHeadVO result = settexchHeadService.getSettexchAllInfo(billsNumber);
        return AbstractApiResult.success(result);
    }

}
