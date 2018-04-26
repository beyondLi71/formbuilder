package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @desc AR-108 明细表实体VO
 * @author linlangleo
 * @date 2018-04-22 17:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefundOrderItemVO {
  private String id;

  private String headId;

  private String zskdh;

  private String zhxh;

  private String lifnr;

  private String belnr;

  private String budat;

  private String zpzzt;

  private String zsyhz;

  private String zskyhlb;

  private String zskhm;

  private String zskyh;

  private String zzfzt;

  private String zfjdm;

  private String zxm;

  private String zxmdm;

  private String zhdjh;

  private String dmbtr;

  private String zbhsj;

  private String zsfkh;

  private String kunnr;

  private String zkhmc;

  private String zcplx;

  private String zkxmx;

  private String mwskz;

  private String zse;

  private String zzffs;

  private String zzfrq;

  private String zhxzt;

  private String sgtxt;

  private String zywlx;

  private String zch;

  private String zhxmzt;

  private String zfkzh;

  private String zybhs;

  private String zybse;

  private String zybbh;

  private String waers;

  private String kursf;

  private String zszxm;

  private String zzjjh;

  private String zxjll;
}
