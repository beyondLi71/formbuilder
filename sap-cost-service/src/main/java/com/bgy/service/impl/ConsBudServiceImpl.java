package com.bgy.service.impl;

import com.bgy.common.utils.SysReturnSapUrlConfig;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.ConsBudAttItemMapper;
import com.bgy.dao.ConsBudHeadMapper;
import com.bgy.dao.ConsBudItemMapper;
import com.bgy.entity.dto.ConsBudDTO;
import com.bgy.entity.po.ConsBudAttItemPO;
import com.bgy.entity.po.ConsBudHeadPO;
import com.bgy.entity.po.ConsBudItemPO;
import com.bgy.entity.vo.ConsBudHeadVO;
import com.bgy.entity.vo.ConsBudItemVO;
import com.bgy.service.ConsBudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 20:14
 * @desc 预算结果处理.
 */
@Service
public class ConsBudServiceImpl implements ConsBudService {
    @Resource
    ConsBudHeadMapper consBudHeadMapper;
    @Resource
    ConsBudItemMapper consBudItemMapper;
    @Resource
    ConsBudAttItemMapper consBudAttItemMapper;
    @Resource
    SysReturnSapUrlConfig sysReturnSapUrlConfig;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData saveConsBudAll(ConsBudDTO consBud) {
        //获取表单编号
        String docID = consBud.getFormInfo().getDocID();
        //封装返回参数
        ResultData resultData = new ResultData();
        resultData.setDocID(docID);
        resultData.setProcessTempID(consBud.getFormInfo().getProcessTempID());
        resultData.setFormURL(sysReturnSapUrlConfig.returnUrl(docID, consBud.getFormInfo().getProcessTempID(), "cost"));
        //删除数据
        ConsBudHeadPO consBudHead = new ConsBudHeadPO();
        consBudHead.setHeadId(docID);
        consBudHeadMapper.delete(consBudHead);
        ConsBudItemPO consBudItem = new ConsBudItemPO();
        consBudItem.setHeadId(docID);
        consBudItemMapper.delete(consBudItem);
        ConsBudAttItemPO consBudAttItem = new ConsBudAttItemPO();
        consBudAttItem.setHeadId(docID);
        consBudAttItemMapper.delete(consBudAttItem);
        //数据校验
        if (consBud.getConsBudBusinessData().getConsBudRecord() == null) {
            return resultData;
        }
        //数据拷贝
        ConsBudHeadPO consBudHeadPO = MapperUtils.mapperBean(consBud.getConsBudBusinessData().getConsBudRecord(),
                ConsBudHeadPO.class);
        //数据填充
        consBudHeadPO.setHeadId(docID);
        consBudHeadPO.setCreateBy("admin");
        consBudHeadPO.setUpdateBy("admin");
        consBudHeadPO.setCreateTime(LocalDateTime.now());
        consBudHeadPO.setUpdateTime(consBudHeadPO.getCreateTime());
        //保存数据
        consBudHeadMapper.insert(consBudHeadPO);
        if (consBudHeadPO.getItem() != null && !consBudHeadPO.getItem().isEmpty()) {
            consBudHeadPO.getItem().stream().forEach(s -> {
                s.setHeadId(docID);
                consBudItemMapper.insert(s);
            });
        }
        if (consBudHeadPO.getAttItem() != null && !consBudHeadPO.getAttItem().isEmpty()) {
            consBudHeadPO.getAttItem().stream().forEach(s -> {
                s.setHeadId(docID);
                consBudAttItemMapper.insert(s);
            });
        }
        return resultData;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ConsBudHeadVO getConsBudAll(String headId) {
        //根据headid获取数据
        ConsBudHeadPO consBudHead = new ConsBudHeadPO();
        consBudHead.setHeadId(headId);
        ConsBudHeadPO consBudHeadPO = consBudHeadMapper.selectOne(consBudHead);
        ConsBudItemPO consBudItem = new ConsBudItemPO();
        consBudItem.setHeadId(headId);
        List<ConsBudItemPO> select = consBudItemMapper.select(consBudItem);
        //组合数据
        if (consBudHeadPO == null && select.size() != 0) {
            ConsBudHeadPO consBudHeads = new ConsBudHeadPO();
            consBudHeads.setItem(select);
            return  MapperUtils.mapperBean(consBudHeads, ConsBudHeadVO.class);
        }
        if (consBudHeadPO == null && select.size() == 0) {
            ConsBudHeadVO consBudHeadv = new ConsBudHeadVO();
            List<ConsBudItemVO> item = new ArrayList<ConsBudItemVO>();
            consBudHeadv.setItem(item);
            return consBudHeadv;
        }
        consBudHeadPO.setItem(select);
        //数据转化
        ConsBudHeadVO consBudHeadVO = MapperUtils.mapperBean(consBudHeadPO, ConsBudHeadVO.class);
        return consBudHeadVO;
    }
}

