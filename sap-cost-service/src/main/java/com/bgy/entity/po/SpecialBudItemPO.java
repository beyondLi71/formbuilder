package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 10:11
 * @desc .预算详情
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_CS_SPECIALBUDITEM")
public class SpecialBudItemPO {
    @Id
    private String id;

    @Column(name = "TZDH")
    private String tzdh;

    @Column(name = "DJHH")
    private String djhh;

    @Column(name = "FICTR")
    private String fictr;

    @Column(name = "YSQJ")
    private String ysqj;

    @Column(name = "ADJST")
    private String adjst;

    @Column(name = "BZXX")
    private String bzxx;

    @Column(name = "HEADID")
    private String headId;
}

