package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 9:28
 * @desc .
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_CS_SPECIALBUDHEAD")
public class SpecialBudHeadPO {

    @Id
    private String id;

    @Column(name = "TZDH")
    private String tzdh;

    @Column(name = "FIKRS")
    private String fikrs;

    @Column(name = "DJLX")
    private String djlx;

    @Column(name = "GJAHR")
    private String gjahr;

    @Column(name = "FUND")
    private String fund;

    @Column(name = "TIZR")
    private String tizr;

    @Column(name = "TZRQ")
    private String tzrq;

    @Column(name = "WBZY")
    private String wbzy;

    @Column(name = "HEADID")
    private String headId;

    @Column(name = "CREATE_BY")
    private String createBy;

    @Column(name = "UPDATE_BY")
    private String updateBy;

    @Column(name = "CREATE_TIME")
    private LocalDateTime createTime;

    @Column(name = "UPDATE_TIME")
    private LocalDateTime updateTime;

    @Column(name = "REMARK")
    private String remark;

    @Transient
    private List<SpecialBudAttItemPO> attItem;

    @Transient
    private List<SpecialBudItemPO> item;

}

