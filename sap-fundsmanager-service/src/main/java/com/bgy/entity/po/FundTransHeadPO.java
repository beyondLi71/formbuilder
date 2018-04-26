package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * 资金划转业务 主表实体PO
 * @by linlangleo
 * @date 2018/4/18 10:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_FM_FUNDTRANSHEAD")
public class FundTransHeadPO {
  @Id
  private Long id;

  @Column(name = "HEADID")
  private String headId;

  @Column(name = "ZUUID")
  private String zuuid;

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

  @Column(name = "TWAERS")
  private String twaers;

  @Column(name = "LTEXT")
  private String ltext;

  @Column(name = "BANKN1")
  private String bankn1;

  @Column(name = "BANKN2")
  private String bankn2;

  @Column(name = "ZHCYWLX")
  private String zhcywlx;

  @Column(name = "ZHRYWLX")
  private String zhrywlx;

  @Column(name = "ZHZSM")
  private String zhzsm;

  @Column(name = "ZHZJE")
  private String zhzje;

  @Column(name = "ZZDRQ")
  private String zzdrq;

  @Column(name = "ZZDR")
  private String zzdr;

  @Column(name = "ZZYXX")
  private String zzyxx;

  @Column(name = "ZXJLLXM")
  private String zxjllxm;

  @Transient
  private List<FundTransAttItemPO> fundTransAttItem;
}
