package com.bgy.service.impl;

import com.bgy.common.utils.SysReturnSapUrlConfig;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.exception.ExceptionManager;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.RefundOrderAttItemPOMapper;
import com.bgy.dao.RefundOrderHeadPOMapper;
import com.bgy.dao.RefundOrderItemPOMapper;
import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.entity.dto.RefundOrderBusinessDataDTO;
import com.bgy.entity.po.AttItemPO;
import com.bgy.entity.po.RefundOrderHeadPO;
import com.bgy.entity.po.RefundOrderItemPO;
import com.bgy.entity.vo.RefundOrderHeadVO;
import com.bgy.service.RefundOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @desc AR-108 Service层实现类
 * @author linlangleo
 * @date 2018-04-22 8:44
 **/
@Service
public class RefundOrderServiceImpl implements RefundOrderService {
    @Resource
    private RefundOrderHeadPOMapper refundOrderHeadPOMapper;
    @Resource
    private RefundOrderItemPOMapper refundOrderItemPOMapper;
    @Resource
    private RefundOrderAttItemPOMapper refundOrderAttItemPOMapper;
    @Resource
    private SysReturnSapUrlConfig sysReturnSapUrlConfig;
    @Resource
    private ExceptionManager exceptionManager;

    /**
     * 向数据库插入，资金划转业务流程的表单数据
     */
    @Override
    public ResultData saveRefundOrder(RefundOrderBusinessDataDTO businessData, FormInfoDTO formInfo) {
        //进行数据拷贝
        RefundOrderHeadPO refundOrderHeadPO =
                MapperUtils.mapperBean(businessData.getRefundOrderRecord(), RefundOrderHeadPO.class);
        List<RefundOrderItemPO> refundOrderItemPOList =
                MapperUtils.mapperList(businessData.getRefundOrderRecord().getRefundOrderItem(),
                        RefundOrderItemPO.class);
        List<AttItemPO> attItemPOList =
                MapperUtils.mapperList(businessData.getRefundOrderRecord().getAttItem(),
                        AttItemPO.class);

        //获取单号
        String docID =  formInfo.getDocID();

        //查询数据库并删除符合此id的数据
        RefundOrderHeadPO refundOrderHeadPO_del = new RefundOrderHeadPO();
        refundOrderHeadPO_del.setHeadId(docID);
        RefundOrderItemPO refundOrderItemPO_del = new RefundOrderItemPO();
        refundOrderItemPO_del.setHeadId(docID);
        AttItemPO attItemPO_del = new AttItemPO();
        attItemPO_del.setHeadId(docID);
        refundOrderHeadPOMapper.delete(refundOrderHeadPO_del);
        refundOrderItemPOMapper.delete(refundOrderItemPO_del);
        refundOrderAttItemPOMapper.delete(attItemPO_del);

        //分别插入主表/明细表的数据
        refundOrderHeadPO.setHeadId(docID);
        refundOrderHeadPOMapper.insertSelective(refundOrderHeadPO);
        if(refundOrderItemPOList != null && refundOrderItemPOList.size() > 0){
            refundOrderItemPOList.stream().forEach(refundItem -> {
                refundItem.setHeadId(docID);
                refundOrderItemPOMapper.insertSelective(refundItem);
            });
        }
        if(attItemPOList != null && attItemPOList.size() > 0){
            attItemPOList.stream().forEach(refundItem -> {
                refundItem.setHeadId(docID);
                refundItem.setCreate_time(LocalDateTime.now());
                refundItem.setCreate_by("admin");
                refundItem.setUpdate_time(LocalDateTime.now());
                refundItem.setUpdate_by("admin");
                refundOrderAttItemPOMapper.insertSelective(refundItem);
            });
        }

        //封装返回参数
        ResultData resultData = new ResultData();
        resultData.setDocID(formInfo.getDocID());//单号
        resultData.setProcessTempID(formInfo.getProcessTempID());//流程模板ID
        //拼接url
        resultData.setFormURL(sysReturnSapUrlConfig.
                returnUrl(formInfo.getDocID(), formInfo.getProcessTempID(), "proceeds"));//给SAP对应的地址
        return resultData;
    }

    /**
     * 根据单号和节点id获取资金划转业务 数据
     */
    @Override
    public RefundOrderHeadVO getRefundOrder(String docID) {
        //根据docID，获取主表的数据
        RefundOrderHeadPO refundOrderHeadPO = new RefundOrderHeadPO();
        refundOrderHeadPO.setHeadId(docID);
        refundOrderHeadPO = refundOrderHeadPOMapper.selectOne(refundOrderHeadPO);
        //根据docID，获取明细表的数据
        List<RefundOrderItemPO> refundOrderItemPOList = null;
        RefundOrderItemPO refundOrderItemPO = new RefundOrderItemPO();
        refundOrderItemPO.setHeadId(docID);
        refundOrderItemPOList = refundOrderItemPOMapper.select(refundOrderItemPO);
        //根据docID，获取附件明细表的数据
        List<AttItemPO> attItemPOList = null;
        AttItemPO attItemPO = new AttItemPO();
        attItemPO.setHeadId(docID);
        attItemPOList = refundOrderAttItemPOMapper.select(attItemPO);
        //明细表放入主表
        if(refundOrderHeadPO == null){//非空判断
            throw exceptionManager.createByCode("SAP_FM_ROP_001");
        }
        refundOrderHeadPO.setRefundOrderItem(refundOrderItemPOList);
        refundOrderHeadPO.setAttItem(attItemPOList);

        //进行数据拷贝
        RefundOrderHeadVO refundOrderHeadVO = MapperUtils.mapperBean(refundOrderHeadPO, RefundOrderHeadVO.class);
        //把获取的主表/明细表 的数据放入到 表单数据DTO中
        return refundOrderHeadVO;
    }
}
