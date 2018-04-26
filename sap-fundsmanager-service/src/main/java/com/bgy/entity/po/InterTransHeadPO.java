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
 * @desc TR058 主表实体PO
 * @author linlangleo
 * @date 2018-04-19 17:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_FM_INTERTRANSHEAD")
public class InterTransHeadPO {
  @Id
  private Long id;

  @Column(name = "HEADID")
  private String headId;

  @Column(name = "ZDJBH")
  private String zdjbh;

  @Column(name = "ZCOM")
  private String zcom;

  @Column(name = "BUTXT")
  private String butxt;

  @Column(name = "KTEXT")
  private String ktext;

  @Column(name = "ZDDLYN")
  private String zddlyn;

  @Column(name = "ZDDFXN")
  private String zddfxn;

  @Column(name = "ERDAT")
  private String erdat;

  @Column(name = "ERNAM")
  private String ernam;

  @Column(name = "ZPC")
  private String zpc;

  @Column(name = "ZDJLX")
  private String zdjlx;

  @Column(name = "ZDDFX")
  private String zddfx;

  @Transient
  private List<InterTransItemPO> interTransItem;

  @Transient
  private List<InterTransAttItemPO> interTransAttItem;
}
