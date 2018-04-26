package com.bgy.service.impl;

import com.bgy.common.utils.SysReturnSapUrlConfig;
import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.exception.ExceptionManager;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.FloorDedFundAttItemPOMapper;
import com.bgy.dao.FloorDedFundHeadPOMapper;
import com.bgy.dao.FloorDedFundItemPOMapper;
import com.bgy.entity.dto.FloorDedFundBusinessDataDTO;
import com.bgy.entity.dto.FormInfoDTO;
import com.bgy.entity.po.AttItemPO;
import com.bgy.entity.po.FloorDedFundHeadPO;
import com.bgy.entity.po.FloorDedFundItemPO;
import com.bgy.entity.vo.FloorDedFundHeadVO;
import com.bgy.service.FloorDedFundService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/24 17:47
 * @desc AR-IF017售楼抵楼款应收传输接口 服务实现
 */
@Service
public class FloorDedFundServiceImpl implements FloorDedFundService{

    @Resource
    FloorDedFundHeadPOMapper floorDedFundHeadPOMapper;
    @Resource
    FloorDedFundItemPOMapper floorDedFundItemPOMapper;
    @Resource
    FloorDedFundAttItemPOMapper floorDedFundAttItemPOMapper;
    @Resource
    private SysReturnSapUrlConfig sysReturnSapUrlConfig;
    @Resource
    private ExceptionManager exceptionManager;
    /**
     * 向数据库插入表单数据
     *
     * @param businessData
     * @param formInfo
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData saveFloorDedFund(@Valid FloorDedFundBusinessDataDTO businessData, @Valid FormInfoDTO formInfo) {
        //进行数据拷贝
        FloorDedFundHeadPO floorDedFundHeadPO=
                MapperUtils.mapperBean(businessData.getFloorDedFundRecord(), FloorDedFundHeadPO.class);
        List<FloorDedFundItemPO> floorDedFundItemPOS =
                MapperUtils.mapperList(businessData.getFloorDedFundRecord().getItem(), FloorDedFundItemPO.class);
        List<AttItemPO> attItemPOList =
                MapperUtils.mapperList(businessData.getFloorDedFundRecord().getAttItem(), AttItemPO.class);

        //获取单号
        String docID =  formInfo.getDocID();

        //查询数据库并删除符合此id的数据
        FloorDedFundHeadPO floorDedFundHeadPO_del = new FloorDedFundHeadPO();
        FloorDedFundItemPO floorDedFundItemPO_del = new FloorDedFundItemPO();
        AttItemPO attItemPO_del = new AttItemPO();
        floorDedFundHeadPO_del.setHeadId(docID);
        floorDedFundItemPO_del.setHeadId(docID);
        attItemPO_del.setHeadId(docID);
        floorDedFundHeadPOMapper.delete(floorDedFundHeadPO_del);
        floorDedFundItemPOMapper.delete(floorDedFundItemPO_del);
        floorDedFundAttItemPOMapper.delete(attItemPO_del);

        //分别插入主表/明细表的数据
        floorDedFundHeadPO.setHeadId(docID);
        floorDedFundHeadPOMapper.insertSelective(floorDedFundHeadPO);
        if(floorDedFundItemPOS != null && floorDedFundItemPOS.size() > 0){
            floorDedFundItemPOS.stream().forEach(item -> {
                item.setHeadId(docID);
                item.setCreate_time(LocalDateTime.now());
                item.setCreate_by("admin");
                floorDedFundItemPOMapper.insertSelective(item);
            });
        }
        if(attItemPOList != null && attItemPOList.size() > 0){
            attItemPOList.stream().forEach(attItem -> {
                attItem.setHeadId(docID);
                attItem.setCreate_by("admin");
                attItem.setCreate_time(LocalDateTime.now());
                floorDedFundAttItemPOMapper.insertSelective(attItem);
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
     * 查询表单
     *
     * @param docID
     */
    @Override
    public FloorDedFundHeadVO getFloorDedFund(String docID) {
        //根据docID，获取主表的数据
        FloorDedFundHeadPO floorDedFundHeadPO= new FloorDedFundHeadPO();
        floorDedFundHeadPO.setHeadId(docID);
        floorDedFundHeadPO = floorDedFundHeadPOMapper.selectOne(floorDedFundHeadPO);
        //根据docID，获取明细表的数据
        List<FloorDedFundItemPO> floorDedFundItemPOS= null;
        FloorDedFundItemPO floorDedFundItemPO = new FloorDedFundItemPO();
        floorDedFundItemPO.setHeadId(docID);
        floorDedFundItemPOS = floorDedFundItemPOMapper.select(floorDedFundItemPO);
        //根据docID，获取附件明细表的数据
        List<AttItemPO> attItemPOList = null;
        AttItemPO attItemPO = new AttItemPO();
        attItemPO.setHeadId(docID);
        attItemPOList = floorDedFundAttItemPOMapper.select(attItemPO);
        //明细表放入主表
        if(floorDedFundHeadPO == null){//非空判断
            throw exceptionManager.createByCode("SAP_AR_FDF_001");
        }
        floorDedFundHeadPO.setItem(floorDedFundItemPOS);
        floorDedFundHeadPO.setAttItem(attItemPOList);

        //进行数据拷贝refundOrder
        FloorDedFundHeadVO floorDedFundHeadVO = MapperUtils.mapperBean(floorDedFundHeadPO, FloorDedFundHeadVO.class);
        //把获取的主表/明细表 的数据放入到 表单数据DTO中
        return floorDedFundHeadVO;
    }
}
