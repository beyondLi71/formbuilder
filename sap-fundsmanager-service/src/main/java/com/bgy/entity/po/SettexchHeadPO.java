package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;
/**
 * @author yyg
 * @date 2018/4/17 13:25
 * @desc 资金划转及结汇购汇业务（结汇购汇业务) 实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FB_SAP_FM_SETTEXCHHEAD")
public class SettexchHeadPO {

    @Id
    private Long id;

    @Column(name = "HEADID")
    private String headid;

    @Column(name = "ZDJBH")
    private String zdjbh;

    @Column(name = "ZBUKRS")
    private String zbukrs;

    @Column(name = "ZBUTXT")
    private String zbutxt;

    @Column(name = "ZPRCTR")
    private String zprctr;

    @Column(name = "ZLTEXT")
    private String zltext;

    @Column(name = "ZDJLXNUM")
    private String zdjlxnum;

    @Column(name = "ZDJLXMS")
    private String zdjlxms;

    @Column(name = "ZSZXM")
    private String zszxm;

    @Column(name = "ZSZXMN")
    private String zszxmn;

    @Column(name = "ZXJLLBM")
    private String zxjllbm;

    @Column(name = "ZXJLLMC")
    private String zxjllmc;

    @Column(name = "ZYWLX")
    private String zywlx;

    @Column(name = "TWAERS")
    private String twaers;

    @Column(name = "LTEXT")
    private String ltext;

    @Column(name = "BANKN1")
    private String bankn1;

    @Column(name = "BANKN2")
    private String bankn2;

    @Column(name = "ZYWSX1")
    private String zywsx1;

    @Column(name = "ZYWSX2")
    private String zywsx2;

    @Column(name = "ZYWSM")
    private String zywsm;

    @Column(name = "ZZDRQ")
    private Date zzdrq;

    @Column(name = "ZZDR")
    private String zzdr;

    @Column(name = "ZZYXX")
    private String zzyxx;

    @Column(name = "ZDJZT")
    private String zdjzt;

    @Column(name = "CREATE_TIME")
    private LocalDateTime createTime;

    @Column(name = "CREATE_BY")
    private String createBy;

    @Column(name = "UPDATE_TIME")
    private LocalDateTime updateTime;

    @Column(name = "UPDATE_BY")
    private String updateBy;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "ZZJHV")
    private String zzjhv;

    @Column(name = "ZBBJE")
    private String zbbje;

    @Column(name = "ZWBJE")
    private String zwbje;
}
