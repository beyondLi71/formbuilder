package com.bgy.service.impl;

import com.bgy.common.utils.apiresult.ResultData;
import com.bgy.common.utils.exception.ExceptionManager;
import com.bgy.common.utils.mapper.MapperUtils;
import com.bgy.dao.BudgetFileItemPOMapper;
import com.bgy.dao.BudgetHeadPOMapper;
import com.bgy.dao.BudgetRowItemPOMapper;
import com.bgy.entity.dto.BudgetBusinessDataDTO;
import com.bgy.entity.dto.BudgetDTO;
import com.bgy.entity.dto.BudgetHeadDTO;
import com.bgy.entity.po.BudgetFileItemPO;
import com.bgy.entity.po.BudgetHeadPO;
import com.bgy.entity.po.BudgetRowItemPO;
import com.bgy.entity.vo.BudgetFileItemVO;
import com.bgy.entity.vo.BudgetHeadVO;
import com.bgy.entity.vo.BudgetRowItemVO;
import com.bgy.service.BudgetHeadService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yyg
 * @date 2018/4/18 13:31
 * @desc 一般结算调整接口实现类
 */
@Service
public class BudgetHeadServiceImpl implements BudgetHeadService {

    @Resource
    private BudgetHeadPOMapper budgetHeadPOMapper;

    @Resource
    private BudgetRowItemPOMapper budgetRowItemPOMapper;

    @Resource
    private BudgetFileItemPOMapper budgetFileItemPOMapper;

    @Resource
    private ExceptionManager exceptionManager;

    @Value("${ipSapUrl}")
    String ipSapUrl;

    @Value("${port}")
    String port;


    /**
     * 写入sap金划转及结汇购汇业务（结汇购汇业务)相关数据
     *
     * @param budgetDTO
     * @return ResultData
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultData addBudget(BudgetDTO budgetDTO) {
        //数据拷贝
        BudgetBusinessDataDTO businessData = MapperUtils.mapperBean(budgetDTO.getBusinessData(), BudgetBusinessDataDTO.class);
        BudgetHeadDTO headDTO = MapperUtils.mapperBean(businessData.getGeneralBudRecord(), BudgetHeadDTO.class);
        BudgetHeadPO headPO = MapperUtils.mapperBean(headDTO, BudgetHeadPO.class);
        List<BudgetFileItemPO> fileItemPOs = MapperUtils.mapperList(headDTO.getAttitem(), BudgetFileItemPO.class);
        List<BudgetRowItemPO> rowItemPOs = MapperUtils.mapperList(headDTO.getItem(), BudgetRowItemPO.class);
        //获取表单编号
        String docID = budgetDTO.getFormInfo().getDocID();
        //查询数据库并删除符合此id的数据
        BudgetHeadPO countPo = new BudgetHeadPO();
        countPo.setHeadid(docID);
        int count = this.budgetHeadPOMapper.selectCount(countPo);
        if (count > 0) {
            budgetHeadPOMapper.delete(countPo);
            BudgetFileItemPO fileItemDetelePO = new BudgetFileItemPO();
            BudgetRowItemPO rowItemDetelePO = new BudgetRowItemPO();
            fileItemDetelePO.setHeadid(countPo.getHeadid());
            rowItemDetelePO.setHeadid(countPo.getHeadid());
            budgetFileItemPOMapper.delete(fileItemDetelePO);
            budgetRowItemPOMapper.delete(rowItemDetelePO);
        }
        //添加操作
        headPO.setHeadid(docID);
        headPO.setCreateTime(LocalDateTime.now());
        headPO.setUpdateTime(LocalDateTime.now());
        headPO.setCreateBy("1");
        headPO.setUpdateBy("1");
        budgetHeadPOMapper.insertSelective(headPO);
        fileItemPOs.stream().forEach(s -> {
            if (!s.getFilename().equals("")) {
                s.setHeadid(docID);
                budgetFileItemPOMapper.insertSelective(s);
            }
        });
        rowItemPOs.stream().forEach(r -> {
            r.setHeadid(docID);
            budgetRowItemPOMapper.insertSelective(r);
        });
        //封装返回参数
        ResultData resultData = new ResultData();
        resultData.setDocID(docID);
        resultData.setProcessTempID(budgetDTO.getFormInfo().getProcessTempID());
        //拼接url
        String sapurl = "http://" + ipSapUrl + ":" + port + "/sap/cost/costIndex.html?docID=" + docID + "&tempID="
                + budgetDTO.getFormInfo().getProcessTempID() + "&act=";
        resultData.setFormURL(sapurl);
        return resultData;
    }

    @Override
    public BudgetHeadVO getBudgetAllInfo(String billsNumber) {
        //查询主表数据
        BudgetHeadPO selectHeadPO = new BudgetHeadPO();
        selectHeadPO.setHeadid(billsNumber);
        BudgetHeadPO headPO = this.budgetHeadPOMapper.selectOne(selectHeadPO);
        if (headPO == null) {
            throw exceptionManager.createByCode("SAP_CS_BD_001");
        }
        //查询附件数据
        BudgetFileItemPO selecctFilePo = new BudgetFileItemPO();
        selecctFilePo.setHeadid(billsNumber);
        List<BudgetFileItemPO> fileItemPOS = this.budgetFileItemPOMapper.select(selecctFilePo);
        //查询附件行项目数据
        BudgetRowItemPO selecctRowPo = new BudgetRowItemPO();
        selecctRowPo.setHeadid(billsNumber);
        List<BudgetRowItemPO> rowItemPOS = this.budgetRowItemPOMapper.select(selecctRowPo);
        //封装数据
        BudgetHeadVO headVO = MapperUtils.mapperBean(headPO, BudgetHeadVO.class);
        List<BudgetFileItemVO> fileItemVOS = new ArrayList<BudgetFileItemVO>();
        if (fileItemPOS.size() > 0) {
            fileItemVOS = MapperUtils.mapperList(fileItemPOS, BudgetFileItemVO.class);
        }
        List<BudgetRowItemVO> rowItemVOS = MapperUtils.mapperList(rowItemPOS, BudgetRowItemVO.class);
        headVO.setBudgetFileItemVOs(fileItemVOS);
        headVO.setBudgetRowItemDTOs(rowItemVOS);
        return headVO;
    }

}
