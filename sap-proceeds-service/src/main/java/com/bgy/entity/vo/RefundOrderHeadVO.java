package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.List;


/**
 * @desc AR-108 主表实体VO
 * @author linlangleo
 * @date 2018-04-22 17:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefundOrderHeadVO {
  private String id;

  private String headId;

  private String zskdh;

  private String prctr;

  private String belnr;

  private String budat;

  private String zpzzt;

  private String zdjlx;

  private String zlcbh;

  private String zshr;

  private String zdjh;

  private String zdjrq;

  private String zshrq;

  private String zdjzt;

  private String zsfld;

  private String zspzt;

  private String bktxt;

  private String zsmrq;

  private String zsmr;

  private String erdat;

  private String ertim;

  private String ernam;

  private String zguid;

  private String k2id;

  private String process_code;

  private String form_url;

  private List<RefundOrderItemVO> refundOrderItem;

  private List<AttItemVO> attItem;
}
