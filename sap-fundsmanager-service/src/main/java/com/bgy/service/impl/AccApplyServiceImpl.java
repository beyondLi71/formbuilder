package com.bgy.service.impl;

import com.bgy.common.utils.SysReturnSapUrlConfig;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.AccApplyAttItemMapper;
import com.bgy.dao.AccApplyHeadMapper;
import com.bgy.entity.dto.AccApplyDTO;
import com.bgy.entity.po.AccApplyAttItemPO;
import com.bgy.entity.po.AccApplyHeadPO;
import com.bgy.entity.vo.AccApplyHeadVO;
import com.bgy.service.AccApplyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/19 15:37
 * @desc 开户申请表.
 */
@Service
public class AccApplyServiceImpl implements AccApplyService {

    @Resource
    AccApplyHeadMapper accApplyHeadMapper;
    @Resource
    AccApplyAttItemMapper accApplyAttItemMapper;
    @Resource
    SysReturnSapUrlConfig sysReturnSapUrlConfig;

    @Override
    public ResultData saveAccApplyAll(AccApplyDTO accApply) {
        //获取表单编号
        String docID = accApply.getFormInfo().getDocID();
        //封装返回参数
        ResultData resultData = new ResultData();
        resultData.setDocID(docID);
        resultData.setProcessTempID(accApply.getFormInfo().getProcessTempID());
        resultData.setFormURL(sysReturnSapUrlConfig.returnUrl(docID, accApply.getFormInfo().getProcessTempID(), "fundsmanager"));
        //删除数据
        AccApplyHeadPO accApplyHead = new AccApplyHeadPO();
        accApplyHead.setHeadId(docID);
        accApplyHeadMapper.delete(accApplyHead);
        AccApplyAttItemPO accApplyAttItem = new AccApplyAttItemPO();
        accApplyAttItem.setHeadId(docID);
        accApplyAttItemMapper.delete(accApplyAttItem);
        //数据校验
        if (accApply.getAccApplyBusinessData().getAccApplyHead() == null) {
            return resultData;
        }
        //数据拷贝
        AccApplyHeadPO accApplyHeadPO = MapperUtils.mapperBean(accApply.getAccApplyBusinessData().getAccApplyHead(),
                AccApplyHeadPO.class);
        //数据填充
        accApplyHeadPO.setHeadId(docID);
        accApplyHeadPO.setCreateBy("admin");
        accApplyHeadPO.setUpdateBy("admin");
        accApplyHeadPO.setCreateTime(LocalDateTime.now());
        accApplyHeadPO.setUpdateTime(accApplyHeadPO.getCreateTime());
        //保存数据
        accApplyHeadMapper.insert(accApplyHeadPO);
        if (accApplyHeadPO.getAttItem() != null && !accApplyHeadPO.getAttItem().isEmpty()) {
            accApplyHeadPO.getAttItem().stream().forEach(s -> {
                s.setHeadId(docID);
                accApplyAttItemMapper.insert(s);
            });
        }
        return resultData;
    }


    @Override
    public AccApplyHeadVO getAccApplyAll(String headId) {
        //根据headid获取数据
        AccApplyHeadPO accApplyHead = new AccApplyHeadPO();
        accApplyHead.setHeadId(headId);
        AccApplyHeadPO accApplyHeadPO = accApplyHeadMapper.selectOne(accApplyHead);
        if (accApplyHeadPO == null) {
            AccApplyHeadVO accApplyHeadV = new AccApplyHeadVO();
            return accApplyHeadV;
        }
        //数据转化
        AccApplyHeadVO accApplyHeadVO = MapperUtils.mapperBean(accApplyHeadPO, AccApplyHeadVO.class);
        return accApplyHeadVO;
    }
}

