package com.bgy.service.impl;

import com.bgy.common.utils.SysReturnSapUrlConfig;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.InitBudAttItemMapper;
import com.bgy.dao.InitBudHeadMapper;
import com.bgy.dao.InitBudItemMapper;
import com.bgy.entity.dto.InitBudDTO;
import com.bgy.entity.po.InitBudAttItemPO;
import com.bgy.entity.po.InitBudHeadPO;
import com.bgy.entity.po.InitBudItemPO;
import com.bgy.entity.vo.InitBudHeadVO;
import com.bgy.entity.vo.InitBudItemVO;
import com.bgy.service.InitBudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/19 11:42
 * @desc 预算初始化导入服务.
 */
@Service
public class InitBudServiceImpl implements InitBudService {

    @Resource
    InitBudHeadMapper initBudHeadMapper;
    @Resource
    InitBudItemMapper initBudItemMapper;
    @Resource
    InitBudAttItemMapper initBudAttItemMapper;
    @Resource
    SysReturnSapUrlConfig sysReturnSapUrlConfig;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData saveConsBudAll(InitBudDTO initBud) {
        //获取表单编号
        String docID = initBud.getFormInfo().getDocID();
        //封装返回参数
        ResultData resultData = new ResultData();
        resultData.setDocID(docID);
        resultData.setProcessTempID(initBud.getFormInfo().getProcessTempID());
        //拼接url
        resultData.setFormURL(sysReturnSapUrlConfig.returnUrl(docID, initBud.getFormInfo().getProcessTempID(), "cost"));
        //删除数据
        InitBudHeadPO initBudHead = new InitBudHeadPO();
        initBudHead.setHeadId(docID);
        initBudHeadMapper.delete(initBudHead);
        InitBudItemPO initBudItem = new InitBudItemPO();
        initBudItem.setHeadId(docID);
        initBudItemMapper.delete(initBudItem);
        InitBudAttItemPO initBudAttItem = new InitBudAttItemPO();
        initBudAttItem.setHeadId(docID);
        initBudAttItemMapper.delete(initBudAttItem);
        //数据校验
        if (initBud.getInitBudBuisnessData().getInitBudHead() == null) {
            return resultData;
        }
        //数据拷贝
        InitBudHeadPO initBudHeadPO = MapperUtils.mapperBean(initBud.getInitBudBuisnessData().getInitBudHead(),
                InitBudHeadPO.class);
        //数据填充
        initBudHeadPO.setHeadId(docID);
        initBudHeadPO.setCreateBy("admin");
        initBudHeadPO.setUpdateBy("admin");
        initBudHeadPO.setCreateTime(LocalDateTime.now());
        initBudHeadPO.setUpdateTime(initBudHeadPO.getCreateTime());
        //保存数据
        initBudHeadMapper.insert(initBudHeadPO);
        if (initBudHeadPO.getItem() != null && !initBudHeadPO.getItem().isEmpty()) {
            initBudHeadPO.getItem().stream().forEach(s -> {
                s.setHeadId(docID);
                initBudItemMapper.insert(s);
            });
        }
        if (initBudHeadPO.getAttItem() != null && !initBudHeadPO.getAttItem().isEmpty()) {
            initBudHeadPO.getAttItem().stream().forEach(s -> {
                s.setHeadId(docID);
                initBudAttItemMapper.insert(s);
            });
        }
        return resultData;
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public InitBudHeadVO getInitBudAll(String headId) {
        //根据headid获取数据
        InitBudHeadPO initBudHead = new InitBudHeadPO();
        initBudHead.setHeadId(headId);
        InitBudHeadPO initBudHeadPO = initBudHeadMapper.selectOne(initBudHead);
        InitBudItemPO initBudItem = new InitBudItemPO();
        initBudItem.setHeadId(headId);
        List<InitBudItemPO> select = initBudItemMapper.select(initBudItem);
        //组合数据
        if (initBudHeadPO == null && select.size() != 0) {
            InitBudHeadPO initBudHeads = new InitBudHeadPO();
            initBudHeads.setItem(select);
            return  MapperUtils.mapperBean(initBudHeads, InitBudHeadVO.class);
        }
        if (initBudHeadPO == null && select.size() == 0) {
            InitBudHeadVO initBudHeadv = new InitBudHeadVO();
            List<InitBudItemVO> item = new ArrayList<InitBudItemVO>();
            initBudHeadv.setItem(item);
            return initBudHeadv;
        }
        initBudHeadPO.setItem(select);
        //数据转化
        InitBudHeadVO initBudHeadVO = MapperUtils.mapperBean(initBudHeadPO, InitBudHeadVO.class);
        return initBudHeadVO;
    }

}

