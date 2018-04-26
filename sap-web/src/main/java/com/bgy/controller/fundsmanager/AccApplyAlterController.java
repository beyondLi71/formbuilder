package com.bgy.controller.fundsmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.AccApplyAlterAllDTO;
import com.bgy.entity.vo.AccApplyAlterVO;
import com.bgy.service.AccApplyAlterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* @author yyg
* @date 2018/4/18 19:49
* @desc TR-TR034_2-账户变更
*/
@RestController
@Api(value = "sap", tags = {"fundsmanager"})
@RequestMapping(value = "/fundsmanager/accapplyAlter")
public class AccApplyAlterController {

    @Resource
    AccApplyAlterService accapplyAlterService;

    /**
     * 保存sap写入数据
     *
     * @param dto
     * @return AbstractApiResult
     */
    @RequestMapping(value = "/saveAccApplyAlter", method = RequestMethod.POST)
    @ApiOperation(value = "保存TR-TR034_2-账户变更生成接口", produces = "application/json")
    public AbstractApiResult saveAccApplyAltert(@RequestBody AccApplyAlterAllDTO dto) {
        ResultData resultData = accapplyAlterService.addAccApplyAlter(dto);
        return AbstractApiResult.success(resultData);
    }

    /***
     *  k2调用显示接口
     * @param billsNumber
     * @return AbstractApiResult
     */
    @RequestMapping(value = "/getAccApplyAlter/{billsNumber}", method = RequestMethod.GET)
    @ApiOperation(value = "TR-TR034_2-账户变更生成表单", produces = "application/json")
    public AbstractApiResult getAccApplyAlter(@PathVariable String billsNumber) {
        AccApplyAlterVO  result = accapplyAlterService.getAccApplyAlterAllInfo(billsNumber);
        return AbstractApiResult.success(result);
    }

}
