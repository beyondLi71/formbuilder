package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @desc AR-108 明细表实体PO
 * @author linlangleo
 * @date 2018-04-22 17:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_PC_REFUNDORDERITEM")
public class RefundOrderItemPO {
  @Id
  private String id;

  @Column(name = "HEADID")
  private String headId;

  @Column(name = "ZSKDH")
  private String zskdh;

  @Column(name = "ZHXH")
  private String zhxh;

  @Column(name = "LIFNR")
  private String lifnr;

  @Column(name = "BELNR")
  private String belnr;

  @Column(name = "BUDAT")
  private String budat;

  @Column(name = "ZPZZT")
  private String zpzzt;

  @Column(name = "ZSYHZ")
  private String zsyhz;

  @Column(name = "ZSKYHLB")
  private String zskyhlb;

  @Column(name = "ZSKHM")
  private String zskhm;

  @Column(name = "ZSKYH")
  private String zskyh;

  @Column(name = "ZZFZT")
  private String zzfzt;

  @Column(name = "ZFJDM")
  private String zfjdm;

  @Column(name = "ZXM")
  private String zxm;

  @Column(name = "ZXMDM")
  private String zxmdm;

  @Column(name = "ZHDJH")
  private String zhdjh;

  @Column(name = "DMBTR")
  private String dmbtr;

  @Column(name = "ZBHSJ")
  private String zbhsj;

  @Column(name = "ZSFKH")
  private String zsfkh;

  @Column(name = "KUNNR")
  private String kunnr;

  @Column(name = "ZKHMC")
  private String zkhmc;

  @Column(name = "ZCPLX")
  private String zcplx;

  @Column(name = "ZKXMX")
  private String zkxmx;

  @Column(name = "MWSKZ")
  private String mwskz;

  @Column(name = "ZSE")
  private String zse;

  @Column(name = "ZZFFS")
  private String zzffs;

  @Column(name = "ZZFRQ")
  private String zzfrq;

  @Column(name = "ZHXZT")
  private String zhxzt;

  @Column(name = "SGTXT")
  private String sgtxt;

  @Column(name = "ZYWLX")
  private String zywlx;

  @Column(name = "ZCH")
  private String zch;

  @Column(name = "ZHXMZT")
  private String zhxmzt;

  @Column(name = "ZFKZH")
  private String zfkzh;

  @Column(name = "ZYBHS")
  private String zybhs;

  @Column(name = "ZYBSE")
  private String zybse;

  @Column(name = "ZYBBH")
  private String zybbh;

  @Column(name = "WAERS")
  private String waers;

  @Column(name = "KURSF")
  private String kursf;

  @Column(name = "ZSZXM")
  private String zszxm;

  @Column(name = "ZZJJH")
  private String zzjjh;

  @Column(name = "ZXJLL")
  private String zxjll;

  @Column(name = "CREATE_TIME")
  private LocalDateTime create_time;

  @Column(name = "CREATE_BY")
  private String create_by;

  @Column(name = "UPDATE_TIME")
  private LocalDateTime update_time;

  @Column(name = "UPDATE_BY")
  private String update_by;

  @Column(name = "REMARK")
  private String remark;
}
