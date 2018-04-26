package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author yyg
 * @date 2018/4/18 12:00
 * @desc 一般预算调整实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BudgetHeadVO {


    private Long id;

    private String tzdh;

    private String fikrs;

    private String djlx;

    private String gjahr;

    private String fund;

    private String tizr;

    private Date tzrq;

    private String wbzy;

//    private String createBy;
//
//    private Date createTime;
//
//    private String updateBy;
//
//    private Date updateTime;
//
//    private String remark;

    private String headid;

    List<BudgetRowItemVO> budgetRowItemDTOs;

    List<BudgetFileItemVO> budgetFileItemVOs;

}