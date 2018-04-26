package com.bgy.controller.proceeds;

import com.bgy.common.tools.annotation.SapApiLog;
import com.bgy.common.utils.apiresult.AbstractApiResult;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.entity.dto.RefundOrderDTO;
import com.bgy.entity.vo.RefundOrderHeadVO;
import com.bgy.service.RefundOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @desc AR-108的controller
 * @author linlangleo
 * @date 2018-04-22 10:52
 **/
@RestController
@Api(value = "sap", tags = {"proceeds"})
@RequestMapping("/proceeds/refundorder")
public class RefundOrderController {
    @Resource
    private RefundOrderService refundOrderService;

    /**
     * SAP 插入数据
     */
    @ApiOperation(value = "保存AR-054-租赁退款单传输接口（商管系统）", produces = "application/json")
    @RequestMapping(value = "/saverefundorder", method = RequestMethod.POST)
    public AbstractApiResult saveRefundOrder(@RequestBody RefundOrderDTO refundOrderDTO){
        //表单存入到数据库里面
        //获取结果数据实体
        ResultData resultData = refundOrderService.
                saveRefundOrder(refundOrderDTO.getBusinessData(), refundOrderDTO.getFormInfo());
        //返回结果数据实体的JSON格式
        return AbstractApiResult.success(resultData);
    }
    /**
     * 前端 获取数据
     */
    @ApiOperation(value = "查看AR-054-租赁退款单传输接口（商管系统）", produces = "application/json")
    @RequestMapping(value = "/getrefundorder/{docID}", method = RequestMethod.GET)
    @SapApiLog
    public AbstractApiResult getRefundOrder(@PathVariable String docID) {
        //根据单号获取数据
        RefundOrderHeadVO refundOrderHeadVO =
                refundOrderService.getRefundOrder(docID);
        //返回查询的数据的JSON格式
        return AbstractApiResult.success(refundOrderHeadVO);

    }
}
