package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 资金划转业务 主表实体VO
 * @by linlangleo
 * @date 2018/4/18 10:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundTransHeadVO {
  private Long id;
  private String headId;
  private String zuuid;
  private String zdjbh;
  private String zbukrs;
  private String zbutxt;
  private String zprctr;
  private String zltext;
  private String zdjlxnum;
  private String zdjlxms;
  private String zszxm;
  private String zszxmn;
  private String zxjllbm;
  private String zxjllmc;
  private String twaers;
  private String ltext;
  private String bankn1;
  private String bankn2;
  private String zhcywlx;
  private String zhrywlx;
  private String zhzsm;
  private String zhzje;
  private String zzdrq;
  private String zzdr;
  private String zzyxx;
  private String zxjllxm;
  private List<FundTransAttItemVO> fundTransAttItem;
}
