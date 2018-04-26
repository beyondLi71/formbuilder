package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/23 17:17
 * @desc TR-096特转审批单 明细表实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fb_sap_fm_spectransrattitem")
public class SpecTransrItemPO {

    @Id
    private Long id;

    @Column(name = "headid")
    private String headId;

    @Column(name = "znum")
    private String znum;

    @Column(name = "zdjrq")
    private String zdjrq;

    @Column(name = "zscom")
    private String zscom;

    @Column(name = "zscom_t")
    private String zscom_t;

    @Column(name = "zspc")
    private String zspc;

    @Column(name = "zspc_t")
    private String zspc_t;

    @Column(name = "zskqy")
    private String zskqy;

    @Column(name = "zskbk")
    private String zskbk;

    @Column(name = "zskbk_t")
    private String zskbk_t;

    @Column(name = "zcdxz")
    private String zcdxz;

    @Column(name = "zcdxz_t")
    private String zcdxz_t;

    @Column(name = "znbzh")
    private String znbzh;

    @Column(name = "znbzh_t")
    private String znbzh_t;

    @Column(name = "zssffz")
    private String zssffz;

    @Column(name = "zsbb")
    private String zsbb;

    @Column(name = "zsbb_t")
    private String zsbb_t;

    @Column(name = "zszjyt")
    private String zszjyt;

    @Column(name = "zszjyt_t")
    private String zszjyt_t;

    @Column(name = "zfkgs")
    private String zfkgs;

    @Column(name = "zfkgs_t")
    private String zfkgs_t;

    @Column(name = "zfklrzx")
    private String zfklrzx;

    @Column(name = "zfklrzx_t")
    private String zfklrzx_t;

    @Column(name = "zfkqy")
    private String zfkqy;

    @Column(name = "zfkbk")
    private String zfkbk;

    @Column(name = "zfkbk_t")
    private String zfkbk_t;

    @Column(name = "zffcdxz")
    private String zffcdxz;

    @Column(name = "zffcdxz_t")
    private String zffcdxz_t;

    @Column(name = "zffnbzh")
    private String zffnbzh;

    @Column(name = "zffnbzh_t")
    private String zffnbzh_t;

    @Column(name = "zfsffz")
    private String zfsffz;

    @Column(name = "zfbb")
    private String zfbb;

    @Column(name = "zfbb_t")
    private String zfbb_t;

    @Column(name = "zzjyt")
    private String zzjyt;

    @Column(name = "zzjyt_t")
    private String zzjyt_t;

    @Column(name = "zzjlx")
    private String zzjlx;

    @Column(name = "zzjlx_t")
    private String zzjlx_t;

    @Column(name = "zje")
    private String zje;

    @Column(name = "zbz")
    private String zbz;

    @Column(name = "erdat")
    private String erdat;

    @Column(name = "ernam")
    private String ernam;

    @Column(name = "aedat")
    private String aedat;

    @Column(name = "aenam")
    private String aenam;

    @Column(name = "create_by")
    private String create_by;

    @Column(name = "update_by")
    private String update_by;

    @Column(name = "create_time")
    private LocalDateTime create_time;

    @Column(name = "update_time")
    private LocalDateTime update_time;

    @Column(name = "remark")
    private String remark;
}
