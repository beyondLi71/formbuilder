package com.bgy.controller.proceeds;

import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.FloorDedFundDTO;
import com.bgy.entity.vo.FloorDedFundHeadVO;
import com.bgy.service.FloorDedFundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/24 17:49
 * @desc AR-IF017售楼抵楼款应收传输接口 controller
 */
@RestController
@Api(value = "sap", tags = {"proceeds"})
@RequestMapping("/proceeds/floordedfund")
public class FloorDedFundController {
    @Resource
    FloorDedFundService floorDedFundService;

    /**
     * SAP 插入数据
     */
    @ApiOperation(value = "保存 AR-IF017售楼抵楼款应收传输接口", produces = "application/json")
    @PostMapping(value = "/savefloordedfund")
    public AbstractApiResult savefloordedfund(@RequestBody FloorDedFundDTO floorDedFundDTO){
        //表单存入到数据库里面
        //获取结果数据实体
        ResultData resultData = floorDedFundService.
                saveFloorDedFund(floorDedFundDTO.getBusinessData(), floorDedFundDTO.getFormInfo());
        //返回结果数据实体的JSON格式
        return AbstractApiResult.success(resultData);
    }
    /**
     * 前端 获取数据
     */
    @ApiOperation(value = "查看 AR-IF017售楼抵楼款应收传输接口", produces = "application/json")
    @GetMapping(value = "/getfloordedfund/{docID}")
    public AbstractApiResult getfloordedfund(@PathVariable String docID) {
        //根据单号获取数据
        FloorDedFundHeadVO floorDedFundHeadVO =
                floorDedFundService.getFloorDedFund(docID);
        //返回查询的数据的JSON格式
        return AbstractApiResult.success(floorDedFundHeadVO);

    }
}
