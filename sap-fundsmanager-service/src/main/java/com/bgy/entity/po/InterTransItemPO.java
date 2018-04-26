package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @desc TR058 明细表实体PO
 * @author linlangleo
 * @date 2018-04-18 17:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_FM_INTERTRANSITEM")
public class InterTransItemPO {
  @Id
  private String id;

  @Column(name = "HEADID")
  private String headId;

  @Column(name = "ZNUM")
  private String znum;

  @Column(name = "ZDJRQ")
  private String zdjrq;

  @Column(name = "ZSCOM")
  private String zscom;

  @Column(name = "ZSPC")
  private String zspc;

  @Column(name = "ZSKQY")
  private String zskqy;

  @Column(name = "ZSKBK")
  private String zskbk;

  @Column(name = "ZCDXZ")
  private String zcdxz;

  @Column(name = "ZNBZH")
  private String znbzh;

  @Column(name = "ZSSFFZ")
  private String zssffz;

  @Column(name = "ZSBB")
  private String zsbb;

  @Column(name = "ZSZXM")
  private String zszxm;

  @Column(name = "ZZJJH")
  private String zzjjh;

  @Column(name = "ZXJL")
  private String zxjl;

  @Column(name = "ZSZJYT")
  private String zszjyt;

  @Column(name = "ZFKGS")
  private String zfkgs;

  @Column(name = "ZFKLRZX")
  private String zfklrzx;

  @Column(name = "ZFKQY")
  private String zfkqy;

  @Column(name = "ZFKBK")
  private String zfkbk;

  @Column(name = "ZFFCDXZ")
  private String zffcdxz;

  @Column(name = "ZFFNBZH")
  private String zffnbzh;

  @Column(name = "ZFSFFZ")
  private String zfsffz;

  @Column(name = "ZFBB")
  private String zfbb;

  @Column(name = "ZFSZXM")
  private String zfszxm;

  @Column(name = "ZFZJJH")
  private String zfzjjh;

  @Column(name = "ZFXJLL")
  private String zfxjll;

  @Column(name = "ZZJYT")
  private String zzjyt;

  @Column(name = "ZZJLX")
  private String zzjlx;

  @Column(name = "ZJE")
  private String zje;

  @Column(name = "ZBZ")
  private String zbz;

  @Column(name = "ZSCOM_T")
  private String zscom_t;

  @Column(name = "ZSPC_T")
  private String zspc_t;

  @Column(name = "ZSKBK_T")
  private String zskbk_t;

  @Column(name = "ZCDXZ_T")
  private String zcdxz_t;

  @Column(name = "ZNBZH_T")
  private String znbzh_t;

  @Column(name = "ZSBB_T")
  private String zsbb_t;

  @Column(name = "ZSZXM_T")
  private String zszxm_t;

  @Column(name = "ZSZJYT_T")
  private String zszjyt_t;

  @Column(name = "ZFKGS_T")
  private String zfkgs_t;

  @Column(name = "ZFKLRZX_T")
  private String zfklrzx_t;

  @Column(name = "ZFKBK_T")
  private String zfkbk_t;

  @Column(name = "ZFFCDXZ_T")
  private String zffcdxz_t;

  @Column(name = "ZFFNBZH_T")
  private String zffnbzh_t;

  @Column(name = "ZFBB_T")
  private String zfbb_t;

  @Column(name = "ZFSZXM_T")
  private String zfszxm_t;

  @Column(name = "ZZJYT_T")
  private String zzjyt_t;

  @Column(name = "ZZJLX_T")
  private String zzjlx_t;
}
