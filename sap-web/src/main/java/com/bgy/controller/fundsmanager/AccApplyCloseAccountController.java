package com.bgy.controller.fundsmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.AccApplyCloseAccountDTO;
import com.bgy.entity.vo.AccApplyCloseAccountVO;
import com.bgy.service.AccApplyCloseAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yyg
 * @date 2018/4/19 14:42
 * @desc TR-TR034_3-账户销户 控制层
 */
@RestController
@Api(value = "sap", tags = {"fundsmanager"})
@RequestMapping(value = "/fundsmanager/accapplyCloseAcc")
public class AccApplyCloseAccountController {

    @Resource
    AccApplyCloseAccountService accApplyCloseAccountService;

    /**
     * 保存sap写入数据
     *
     * @param dto
     * @return AbstractApiResult
     */
    @RequestMapping(value = "/saveCloseAcc", method = RequestMethod.POST)
    @ApiOperation(value = "保存TR-TR034_3-账户注销生成接口", produces = "application/json")
    public AbstractApiResult saveCloseAcc(@RequestBody AccApplyCloseAccountDTO dto) {
        ResultData resultData = accApplyCloseAccountService.addAccApplyCloseAcc(dto);
        return AbstractApiResult.success(resultData);
    }

    /***
     *  k2调用显示接口
     * @param billsNumber
     * @return AbstractApiResult
     */
    @RequestMapping(value = "/getCloseAcc/{billsNumber}", method = RequestMethod.GET)
    @ApiOperation(value = "TR-TR034_3-账户注销生成表单", produces = "application/json")
    public AbstractApiResult getCloseAcc(@PathVariable String billsNumber) {
        AccApplyCloseAccountVO result = accApplyCloseAccountService.getAccApplyCloseAccAllInfo(billsNumber);
        return AbstractApiResult.success(result);
    }

}
