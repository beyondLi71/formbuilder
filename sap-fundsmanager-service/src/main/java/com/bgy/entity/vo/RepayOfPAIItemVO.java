package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @desc 还本付息付中收 明细表实体VO
 * @author linlangleo
 * @date 2018-04-18 23:46
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepayOfPAIItemVO {
  private Long id;
  private String headId;
  private String zdjhbh;
  private String zdkhtbh;
  private String zfkdh;
  private String zxmlx_ms;
  private String zje_y;
  private String zje_b;
  private String zje_sj;
  private String zjeqsrq;
  private String zjezzrq;
  private String zszxm_ms;
  private String zjfxm_ms;
  private String zxjllxm_ms;
  private String zhtje;
  private String zfkje;
  private String zhtqsrq;
  private String zhtjsrq;
  private String zjkdw_ms;
  private String zdkyh_ms;
}
