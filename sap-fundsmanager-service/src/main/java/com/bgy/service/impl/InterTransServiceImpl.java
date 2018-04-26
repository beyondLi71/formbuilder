package com.bgy.service.impl;

import com.bgy.common.utils.SysReturnSapUrlConfig;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.exception.ExceptionManager;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.InterTransAttItemPOMapper;
import com.bgy.dao.InterTransHeadPOMapper;
import com.bgy.dao.InterTransItemPOMapper;
import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.entity.dto.InterTransBusinessDataDTO;
import com.bgy.entity.po.InterTransAttItemPO;
import com.bgy.entity.po.InterTransHeadPO;
import com.bgy.entity.po.InterTransItemPO;
import com.bgy.entity.vo.InterTransHeadVO;
import com.bgy.service.InterTransService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @desc TR058 Service层实现类
 * @author linlangleo
 * @date 2018-04-19 11:08
 **/
@Service
public class InterTransServiceImpl implements InterTransService {
    @Resource
    private InterTransHeadPOMapper interTransHeadPOMapper;
    @Resource
    private InterTransItemPOMapper interTransItemPOMapper;
    @Resource
    private InterTransAttItemPOMapper interTransAttItemPOMapper;
    @Resource
    private SysReturnSapUrlConfig sysReturnSapUrlConfig;
    @Resource
    private ExceptionManager exceptionManager;

    /**
     * 向数据库插入，TR058的表单数据
     */
    @Override
    public ResultData saveInterTrans(InterTransBusinessDataDTO businessData, FormInfoDTO formInfo) {
        //进行数据拷贝
        InterTransHeadPO interTransHeadPO =
                MapperUtils.mapperBean(businessData.getInterTransRecord(), InterTransHeadPO.class);
        List<InterTransItemPO> interTransItemPOList =
                MapperUtils.mapperList(businessData.getInterTransRecord().getInterTransItem(),
                        InterTransItemPO.class);
        List<InterTransAttItemPO> interTransAttItemPOList =
                MapperUtils.mapperList(businessData.getInterTransRecord().getInterTransAttItem(),
                        InterTransAttItemPO.class);

        //获取单号
        String docID =  formInfo.getDocID();

        //查询数据库并删除符合此id的数据
        InterTransHeadPO interTransHeadPO_del = new InterTransHeadPO();
        interTransHeadPO_del.setHeadId(docID);
        InterTransItemPO interTransItemPO_del = new InterTransItemPO();
        interTransItemPO_del.setHeadId(docID);
        InterTransAttItemPO interTransAttItemPO_del = new InterTransAttItemPO();
        interTransAttItemPO_del.setHeadId(docID);
        interTransHeadPOMapper.delete(interTransHeadPO_del);
        interTransItemPOMapper.delete(interTransItemPO_del);
        interTransAttItemPOMapper.delete(interTransAttItemPO_del);

        //分别插入主表/明细表的数据
        interTransHeadPO.setHeadId(docID);
        interTransHeadPOMapper.insertSelective(interTransHeadPO);
        if(interTransItemPOList != null && interTransItemPOList.size() > 0){
            interTransItemPOList.stream().forEach(interItem -> {
                interItem.setHeadId(docID);
                interTransItemPOMapper.insertSelective(interItem);
            });
        }
        if(interTransAttItemPOList != null && interTransAttItemPOList.size() > 0){
            interTransAttItemPOList.stream().forEach(interItem -> {
                interItem.setHeadId(docID);
                interTransAttItemPOMapper.insertSelective(interItem);
            });
        }

        //封装返回参数
        ResultData resultData = new ResultData();
        resultData.setDocID(formInfo.getDocID());//单号
        resultData.setProcessTempID(formInfo.getProcessTempID());//流程模板ID
        //拼接url
        resultData.setFormURL(sysReturnSapUrlConfig.
                returnUrl(formInfo.getDocID(), formInfo.getProcessTempID(), "fundsmanager"));//给SAP对应的地址
        return resultData;
    }

    /**
     * 根据单号获取TR058业务 数据
     */
    @Override
    public InterTransHeadVO getInterTrans(String docID) {
        //根据docID，获取主表的数据
        InterTransHeadPO interTransHeadPO = new InterTransHeadPO();
        interTransHeadPO.setHeadId(docID);
        interTransHeadPO = interTransHeadPOMapper.selectOne(interTransHeadPO);
        //根据docID，获取明细表的数据
        List<InterTransItemPO> interTransItemPOList = null;
        InterTransItemPO interTransItemPO = new InterTransItemPO();
        interTransItemPO.setHeadId(docID);
        interTransItemPOList = interTransItemPOMapper.select(interTransItemPO);
        //根据docID，获取附件明细表的数据
        List<InterTransAttItemPO> interTransAttItemPOList = null;
        InterTransAttItemPO interTransAttItemPO = new InterTransAttItemPO();
        interTransAttItemPO.setHeadId(docID);
        interTransAttItemPOList = interTransAttItemPOMapper.select(interTransAttItemPO);
        //明细表放入主表
        if(interTransHeadPO == null){//非空判断
            throw exceptionManager.createByCode("SAP_FM_IT_001");
        }
        interTransHeadPO.setInterTransItem(interTransItemPOList);
        interTransHeadPO.setInterTransAttItem(interTransAttItemPOList);

        //进行数据拷贝
        InterTransHeadVO interTransHeadVO = MapperUtils.mapperBean(interTransHeadPO, InterTransHeadVO.class);
        //把获取的主表/明细表 的数据放入到 表单数据DTO中
        return interTransHeadVO;
    }
}
