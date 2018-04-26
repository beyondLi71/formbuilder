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
 * @desc 还本付息付中收 主表实体PO
 * @author linlangleo
 * @date 2018-04-18 17:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_FM_REPAYOFPAIHEAD")
public class RepayOfPAIHeadPO {
  @Id
  private Long id;
  @Column(name = "HEADID")
  private String headId;
  @Column(name = "BUKRS")
  private String bukrs;
  @Column(name = "ZDJBH")
  private String zdjbh;
  @Column(name = "ZDJLX")
  private String zdjlx;
  @Column(name = "ZDJLX_MS")
  private String zdjlx_ms;
  @Column(name = "PRCTR")
  private String prctr;
  @Column(name = "PRCTR_MS")
  private String prctr_ms;
  @Column(name = "KOSTL")
  private String kostl;
  @Column(name = "KOSTL_MS")
  private String kostl_ms;
  @Column(name = "ZSHZK_MS")
  private String zshzk_ms;
  @Column(name = "ZLCBT")
  private String zlcbt;
  @Column(name = "ZJFDATE")
  private String zjfdate;
  @Column(name = "WAERS")
  private String waers;
  @Column(name = "KURSF")
  private String kursf;
  @Column(name = "ZZBSCZFQ_MS")
  private String zzbsczfq_ms;
  @Column(name = "ZXYXQXY_MS")
  private String zxyxqxy_ms;
  @Column(name = "ZSH9XQY")
  private String zsh9xqy;
  @Column(name = "ZSH9XQY_MS")
  private String zsh9xqy_ms;
  @Column(name = "ZSHDRJH")
  private String zshdrjh;
  @Column(name = "ZSHDRJH_MS")
  private String zshdrjh_ms;
  @Column(name = "ZSHXYQD")
  private String zshxyqd;
  @Column(name = "ZSHXYQD_MS")
  private String zshxyqd_ms;
  @Column(name = "ZSHYNN")
  private String zshynn;
  @Column(name = "ZSHYNN_MS")
  private String zshynn_ms;
  @Column(name = "ZYLJZFJE")
  private String zyljzfje;
  @Column(name = "ZLJZFJZRQ")
  private String zljzfjzrq;
  @Column(name = "ZBCZJE1")
  private String zbczje1;
  @Column(name = "ZBCZJE2")
  private String zbczje2;
  @Column(name = "ACC_NUM")
  private String acc_num;
  @Column(name = "BENEFICIAL")
  private String beneficial;
  @Column(name = "BANKL")
  private String bankl;
  @Column(name = "DESCRIPTION")
  private String description;
  @Column(name = "PARTNER_MS")
  private String partner_ms;
  @Column(name = "ZBANKN")
  private String zbankn;
  @Column(name = "ZKOINH")
  private String zkoinh;
  @Column(name = "ZBANKL")
  private String zbankl;
  @Column(name = "ZBANKA")
  private String zbanka;
  @Column(name = "GSBER_MS")
  private String gsber_ms;
  @Column(name = "ZSSQY_MS")
  private String zssqy_ms;
  @Column(name = "ZRZFB_MS")
  private String zrzfb_ms;
  @Column(name = "ZXGSM")
  private String zxgsm;
  @Column(name = "ZFKDNO")
  private String zfkdno;
  @Column(name = "ZZKDNO")
  private String zzkdno;
  @Column(name = "ZJSZT_MS")
  private String zjszt_ms;
  @Column(name = "ZSPZT_MS")
  private String zspzt_ms;
  @Column(name = "ZDJZT_MS")
  private String zdjzt_ms;
  @Column(name = "ZCREDATE")
  private String zcredate;
  @Column(name = "ZCREBY")
  private String zcreby;
  @Column(name = "TEL_NUMBER")
  private String tel_number;
  @Transient
  private List<RepayOfPAIItemPO> repayOfPAIItem;
  @Transient
  private List<AttItemPO> repayOfPAIAttItem;
}
