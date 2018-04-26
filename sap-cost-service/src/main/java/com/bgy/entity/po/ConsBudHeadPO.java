package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 19:36
 * @desc 消耗预算调整.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fb_sap_cs_consbudgethead")
public class ConsBudHeadPO {

    @Id
    private BigDecimal id;

    @Column(name = "tzdh")
    private String tzdh;

    @Column(name = "fikrs")
    private String fikrs;

    @Column(name = "djlx")
    private String djlx;

    @Column(name = "gjahr")
    private String gjahr;

    @Column(name = "tizr")
    private String tizr;

    @Column(name = "tzrq")
    private String tzrq;

    @Column(name = "ysly")
    private String ysly;

    //@Column(name = "ZXLB")
    //private String zxlb;
    @Column(name = "fund")
    private String fund;

    @Column(name = "wbzy")
    private String wbzy;

    @Column(name = "headid")
    private String headId;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Column(name = "remark")
    private String remark;

    @Transient
    private List<ConsBudAttItemPO> attItem;

    @Transient
    private List<ConsBudItemPO> item;
}

