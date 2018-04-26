package com.bgy.entity.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Transient;
import java.util.List;

/**
 * @desc TR058 主表实体VO
 * @author linlangleo
 * @date 2018-04-19 17:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterTransHeadVO {
  private Long id;

  private String headId;

  private String zdjbh;

  private String zcom;

  private String butxt;

  private String ktext;

  private String zddlyn;

  private String zddfxn;

  private String erdat;

  private String ernam;

  private String zpc;

  private String zdjlx;

  private String zddfx;

  private List<InterTransItemVO> interTransItem;

  private List<InterTransAttItemVO> interTransAttItem;
}
