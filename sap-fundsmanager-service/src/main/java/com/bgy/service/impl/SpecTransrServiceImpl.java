package com.bgy.service.impl;

import com.bgy.common.utils.SysReturnSapUrlConfig;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.exception.ExceptionManager;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.SpecTransrAttItemPOMapper;
import com.bgy.dao.SpecTransrHeadPOMapper;
import com.bgy.dao.SpecTransrItemPOMapper;
import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.entity.dto.SpecTransrBusinessDataDTO;
import com.bgy.entity.po.*;
import com.bgy.entity.vo.SpecTransrHeadVO;
import com.bgy.service.SpecTransrService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Ren ZhiQiang
 * @date 2018/4/23 23:44
 * @desc TR-096表单服务实现类
 */
@Service
public class SpecTransrServiceImpl implements SpecTransrService {

    @Resource
    private SysReturnSapUrlConfig sysReturnSapUrlConfig;
    @Resource
    private ExceptionManager exceptionManager;
    @Resource
    private SpecTransrHeadPOMapper specTransrHeadPOMapper;
    @Resource
    private SpecTransrItemPOMapper specTransrItemPOMapper;
    @Resource
    private SpecTransrAttItemPOMapper specTransrAttItemPOMapper;
    /**
     * 向数据库插入表单数据
     *
     * @param businessData
     * @param formInfo
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData saveSpecTransr(@Valid SpecTransrBusinessDataDTO businessData, @Valid FormInfoDTO formInfo) {
        //进行数据拷贝
        SpecTransrHeadPO specTransrHeadPO = MapperUtils.mapperBean(businessData.getSpecTransrRecord(), SpecTransrHeadPO.class);
        List<SpecTransrItemPO> specTransrItemPOs = MapperUtils.mapperList(businessData.getSpecTransrRecord().getItem(), SpecTransrItemPO.class);
        List<AttItemPO> specTransrAttItemPOs = MapperUtils.mapperList(businessData.getSpecTransrRecord().getAttItem(), AttItemPO.class);

        //获取单号
        String docID =  formInfo.getDocID();

        //查询数据库并删除符合此id的数据
        SpecTransrHeadPO specTransrHead_del = new SpecTransrHeadPO();
        SpecTransrItemPO specTransrItem_del = new SpecTransrItemPO();
        AttItemPO  attItemPO_del = new AttItemPO();
        specTransrHead_del.setHeadId(docID);
        specTransrItem_del.setHeadId(docID);
        attItemPO_del.setHeadId(docID);
        specTransrHeadPOMapper.delete(specTransrHead_del);
        specTransrItemPOMapper.delete(specTransrItem_del);
        specTransrAttItemPOMapper.delete(attItemPO_del);

        //分别插入主表/明细表的数据
        specTransrHeadPO.setHeadId(docID);
        specTransrHeadPO.setCreateBy("admin");
        specTransrHeadPO.setCreateTime(LocalDateTime.now());
        specTransrHeadPOMapper.insertSelective(specTransrHeadPO);
        if(specTransrItemPOs != null && specTransrItemPOs.size() > 0){
            specTransrItemPOs.stream().forEach(item -> {
                item.setHeadId(docID);
                item.setCreate_by("admin");
                item.setCreate_time(LocalDateTime.now());
                specTransrItemPOMapper.insertSelective(item);
            });
        }
        if(specTransrAttItemPOs != null && specTransrAttItemPOs.size() > 0){
            specTransrAttItemPOs.stream().forEach(attItem -> {
                attItem.setCreate_by("admin");
                attItem.setHeadId(docID);
                attItem.setCreate_time(LocalDateTime.now());
                specTransrAttItemPOMapper.insertSelective(attItem);
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
     * 查询表单数据
     *
     * @param docID
     */
    @Override
    public SpecTransrHeadVO getSpecTransr(String docID) {
        //根据docID，获取主表的数据
        SpecTransrHeadPO specTransrHeadPO = new SpecTransrHeadPO();
        specTransrHeadPO.setHeadId(docID);
        specTransrHeadPO = specTransrHeadPOMapper.selectOne(specTransrHeadPO);
        //根据docID，获取明细表的数据
        SpecTransrItemPO specTransrItemPO = new SpecTransrItemPO();
        specTransrItemPO.setHeadId(docID);
        List<SpecTransrItemPO> specTransrItemPOS = specTransrItemPOMapper.select(specTransrItemPO);
        //根据docID，获取附件明细表的数据
        AttItemPO attItemPO = new AttItemPO();
        attItemPO.setHeadId(docID);
        List<AttItemPO> attItemPOS = specTransrAttItemPOMapper.select(attItemPO);

        //明细表放入主表
        if(specTransrHeadPO == null){//非空判断
            throw exceptionManager.createByCode("SAP_FM_SPT_001");
        }
        specTransrHeadPO.setItem(specTransrItemPOS);
        specTransrHeadPO.setAttItem(attItemPOS);

        //进行数据拷贝
        SpecTransrHeadVO specTransrHeadVO = MapperUtils.mapperBean(specTransrHeadPO, SpecTransrHeadVO.class);
        //把获取的主表/明细表 的数据放入到 表单数据DTO中
        return specTransrHeadVO;
    }
}
