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
 * @date 2018/4/19 10:55
 * @desc 一般预算初始化从表.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fb_sap_cs_initbuditem")
public class InitBudItemPO {

    @Id
    private BigDecimal id;

    @Column(name = "xjdh")
    private String xjdh;

    @Column(name = "djhh")
    private String djhh;

    @Column(name = "fictr")
    private String fictr;

    @Column(name = "beschr")
    private String beschr;

    @Column(name = "fund")
    private String fund;

    @Column(name = "bezeich")
    private String bezeich;

    //@Column(name = "FIPEX")
    //private String fipex;

    //@Column(name = "BEZEI")
    //private String bezei;

    @Column(name = "tval01")
    private String tval01;

    @Column(name = "tval02")
    private String tval02;

    @Column(name = "tval03")
    private String tval03;

    @Column(name = "tval04")
    private String tval04;

    @Column(name = "tval05")
    private String tval05;

    @Column(name = "tval06")
    private String tval06;

    @Column(name = "tval07")
    private String tval07;

    @Column(name = "tval08")
    private String tval08;

    @Column(name = "tval09")
    private String tval09;

    @Column(name = "tval10")
    private String tval10;

    @Column(name = "tval11")
    private String tval11;

    @Column(name = "tval12")
    private String tval12;

    @Column(name = "tval99")
    private String tval99;

    @Column(name = "bzxx")
    private String bzxx;

    @Column(name = "headid")
    private String headId;
}

