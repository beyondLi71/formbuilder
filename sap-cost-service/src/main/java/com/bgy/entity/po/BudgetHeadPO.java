package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author yyg
 * @date 2018/4/18 12:00
 * @desc 一般预算调整实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fb_sap_cs_budgethead")
public class BudgetHeadPO {

    @Id
    private Long id;

    @Column(name = "tzdh")
    private String tzdh;

    @Column(name = "fikrs")
    private String fikrs;

    @Column(name = "djlx")
    private String djlx;

    @Column(name = "gjahr")
    private String gjahr;

    @Column(name = "fund")
    private String fund;

    @Column(name = "tizr")
    private String tizr;

    @Column(name = "tzrq")
    private Date tzrq;

    @Column(name = "wbzy")
    private String wbzy;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Column(name = "remark")
    private String remark;

    @Column(name = "headid")
    private String headid;

}