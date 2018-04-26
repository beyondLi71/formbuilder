package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @desc 还本付息付中收 明细表实体PO
 * @author linlangleo
 * @date 2018-04-18 23:46
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_FM_REPAYOFPAIITEM")
public class RepayOfPAIItemPO {
  @Id
  private Long id;
  @Column(name = "HEADID")
  private String headId;
  @Column(name = "ZDJHBH")
  private String zdjhbh;
  @Column(name = "ZDKHTBH")
  private String zdkhtbh;
  @Column(name = "ZFKDH")
  private String zfkdh;
  @Column(name = "ZXMLX_MS")
  private String zxmlx_ms;
  @Column(name = "ZJE_Y")
  private String zje_y;
  @Column(name = "ZJE_B")
  private String zje_b;
  @Column(name = "ZJE_SJ")
  private String zje_sj;
  @Column(name = "ZJEQSRQ")
  private String zjeqsrq;
  @Column(name = "ZJEZZRQ")
  private String zjezzrq;
  @Column(name = "ZSZXM_MS")
  private String zszxm_ms;
  @Column(name = "ZJFXM_MS")
  private String zjfxm_ms;
  @Column(name = "ZXJLLXM_MS")
  private String zxjllxm_ms;
  @Column(name = "ZHTJE")
  private String zhtje;
  @Column(name = "ZFKJE")
  private String zfkje;
  @Column(name = "ZHTQSRQ")
  private String zhtqsrq;
  @Column(name = "ZHTJSRQ")
  private String zhtjsrq;
  @Column(name = "ZJKDW_MS")
  private String zjkdw_ms;
  @Column(name = "ZDKYH_MS")
  private String zdkyh_ms;
}
