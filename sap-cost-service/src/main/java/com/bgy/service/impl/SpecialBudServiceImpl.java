package com.bgy.service.impl;

import com.bgy.common.utils.SysReturnSapUrlConfig;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.SpecialBudAttItemMapper;
import com.bgy.dao.SpecialBudHeadMapper;
import com.bgy.dao.SpecialBudItemMapper;
import com.bgy.entity.dto.SpecialBudDTO;
import com.bgy.entity.po.SpecialBudAttItemPO;
import com.bgy.entity.po.SpecialBudHeadPO;
import com.bgy.entity.po.SpecialBudItemPO;
import com.bgy.entity.vo.SpecialBudHeadVO;
import com.bgy.entity.vo.SpecialBudItemVO;
import com.bgy.service.SpecialBudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 10:56
 * @desc 预算服务.
 */
@Service
public class SpecialBudServiceImpl implements SpecialBudService {

    @Resource
    SpecialBudHeadMapper specialBudHeadMapper;
    @Resource
    SpecialBudItemMapper specialBudItemMapper;
    @Resource
    SpecialBudAttItemMapper specialBudAttItemMapper;
    @Resource
    SysReturnSapUrlConfig sysReturnSapUrlConfig;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData saveSpecialBudAll(SpecialBudDTO specialBud) {
        //获取表单编号
        String docID = specialBud.getFormInfo().getDocID();
        //封装返回参数
        ResultData resultData = new ResultData();
        resultData.setDocID(docID);
        resultData.setProcessTempID(specialBud.getFormInfo().getProcessTempID());
        resultData.setFormURL(sysReturnSapUrlConfig.returnUrl(docID, specialBud.getFormInfo().getProcessTempID(), "cost"));
        //删除数据
        SpecialBudHeadPO specialBudHead = new SpecialBudHeadPO();
        specialBudHead.setHeadId(docID);
        specialBudHeadMapper.delete(specialBudHead);
        SpecialBudItemPO specialBudItemPO = new SpecialBudItemPO();
        specialBudItemPO.setHeadId(docID);
        specialBudItemMapper.delete(specialBudItemPO);
        SpecialBudAttItemPO specialBudAttItemPO = new SpecialBudAttItemPO();
        specialBudAttItemPO.setHeadId(docID);
        specialBudAttItemMapper.delete(specialBudAttItemPO);
        //数据校验
        if (specialBud.getSpecialBudBusinessData().getSpecialBudRecord() == null) {
            return resultData;
        }
        //数据拷贝
        SpecialBudHeadPO specialBudHeadPO = MapperUtils.mapperBean(specialBud.getSpecialBudBusinessData().getSpecialBudRecord(),
                SpecialBudHeadPO.class);
        //数据填充
        specialBudHeadPO.setHeadId(docID);
        specialBudHeadPO.setCreateBy("admin");
        specialBudHeadPO.setUpdateBy("admin");
        specialBudHeadPO.setCreateTime(LocalDateTime.now());
        specialBudHeadPO.setUpdateTime(specialBudHeadPO.getCreateTime());
        //保存数据
        specialBudHeadMapper.insert(specialBudHeadPO);
        if (specialBudHeadPO.getItem() != null && !specialBudHeadPO.getItem().isEmpty()) {
            specialBudHeadPO.getItem().stream().forEach(s -> {
                s.setHeadId(docID);
                specialBudItemMapper.insert(s);
            });
        }
        if (specialBudHeadPO.getAttItem() != null && !specialBudHeadPO.getAttItem().isEmpty()) {
            specialBudHeadPO.getAttItem().stream().forEach(s -> {
                s.setHeadId(docID);
                specialBudAttItemMapper.insert(s);
            });
        }
        return resultData;
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public SpecialBudHeadVO getSpecialBudAll(String headId) {
        //根据headid获取数据
        SpecialBudHeadPO specialBudHead = new SpecialBudHeadPO();
        specialBudHead.setHeadId(headId);
        SpecialBudHeadPO specialBudHeadPO = specialBudHeadMapper.selectOne(specialBudHead);
        SpecialBudItemPO specialBudItemPO = new SpecialBudItemPO();
        specialBudItemPO.setHeadId(headId);
        List<SpecialBudItemPO> select = specialBudItemMapper.select(specialBudItemPO);
        //组合数据
        if (specialBudHeadPO == null && select.size() != 0) {
            SpecialBudHeadPO specialBudHeads = new SpecialBudHeadPO();
            specialBudHeads.setItem(select);
            return  MapperUtils.mapperBean(specialBudHeads, SpecialBudHeadVO.class);
        }
         if (specialBudHeadPO == null && select.size() == 0) {
             SpecialBudHeadVO specialBudHeadVO = new SpecialBudHeadVO();
             List<SpecialBudItemVO> item = new ArrayList<SpecialBudItemVO>();
             specialBudHeadVO.setItem(item);
             return specialBudHeadVO;
        }
        specialBudHeadPO.setItem(select);
        //数据转化
        SpecialBudHeadVO specialBudHeadVO = MapperUtils.mapperBean(specialBudHeadPO, SpecialBudHeadVO.class);
        return specialBudHeadVO;
    }
}

