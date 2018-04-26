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
 * @date 2018/4/19 10:50
 * @desc 一般预算初始化.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fb_sap_cs_initbudhead")
public class InitBudHeadPO {
    @Id
    private BigDecimal id;

    @Column(name = "xjdh")
    private String xjdh;

    @Column(name = "fikrs")
    private String fikrs;

    @Column(name = "gjahr")
    private String gjahr;

    @Column(name = "tijr")
    private String tijr;

    @Column(name = "tjrq")
    private String tjrq;

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
    private List<InitBudAttItemPO> attItem;

    @Transient
    private List<InitBudItemPO> item;
}

