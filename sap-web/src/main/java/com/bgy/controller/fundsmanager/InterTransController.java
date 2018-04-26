package com.bgy.controller.fundsmanager;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.InterTransDTO;
import com.bgy.entity.vo.InterTransHeadVO;
import com.bgy.service.InterTransService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @desc TR058的controller
 * @author linlangleo
 * @date 2018-04-19 15:19
 **/
@RestController
@Api(value = "sap", tags = {"fundsmanager"})
@RequestMapping("/fundsmanager/intertrans")
public class InterTransController {
    @Resource
    private InterTransService interTransService;

    /**
     * SAP 插入数据
     */
    @ApiOperation(value = "保存TR058 (内转单审批 SAP-表单)", produces = "application/json")
    @RequestMapping(value = "/saveintertrans", method = RequestMethod.POST)
    public AbstractApiResult saveInterTrans(@RequestBody InterTransDTO interTransDTO){
        //表单存入到数据库里面
        //获取结果数据实体
        ResultData resultData = interTransService.
                saveInterTrans(interTransDTO.getBusinessData(), interTransDTO.getFormInfo());
        //返回结果数据实体的JSON格式
        return AbstractApiResult.success(resultData);
    }
    /**
     * 前端 获取数据
     */
    @ApiOperation(value = "查看TR058 (内转单审批 SAP-表单)", produces = "application/json")
    @RequestMapping(value = "/getintertrans/{docID}", method = RequestMethod.GET)
    public AbstractApiResult getInterTrans(@PathVariable String docID) {
        //根据单号获取数据
        InterTransHeadVO interTransHeadVO =
                interTransService.getInterTrans(docID);
        //返回查询的数据的JSON格式
        return AbstractApiResult.success(interTransHeadVO);
    }
}
