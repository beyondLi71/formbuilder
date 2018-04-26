package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yyg
 * @date 2018/4/18 12:00
 * @desc 一般预算调整行项目实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fb_sap_cs_budgetrowitem")
public class BudgetRowItemPO {

    @Id
    private Long id;

    @Column(name="tzdh")
    private String tzdh;

    @Column(name="djhh")
    private String djhh;

    @Column(name="fictr")
    private String fictr;

    @Column(name="ysqj")
    private String ysqj;

    @Column(name="adjst")
    private String adjst;

    @Column(name="bzxx")
    private String bzxx;

    @Column(name="headid")
    private String headid;

}