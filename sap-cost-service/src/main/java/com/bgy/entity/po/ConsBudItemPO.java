package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 19:52
 * @desc 消耗从表.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fb_sap_cs_consbudgetitem")
public class ConsBudItemPO {
    @Id
    private BigDecimal id;

    @Column(name = "tzdh")
    private String tzdh;

    @Column(name = "djhh")
    private String djhh;

    @Column(name = "fictr")
    private String fictr;

    @Column(name = "bezeich")
    private String bezeich;

    @Column(name = "fylx")
    private String fylx;

    @Column(name = "fyms")
    private String fyms;

    @Column(name = "ysqj")
    private String ysqj;

    @Column(name = "adjst")
    private String adjst;

    @Column(name = "bzxx")
    private String bzxx;

    @Column(name = "headid")
    private String headId;

}

