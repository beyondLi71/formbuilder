package com.bgy.entity.po;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.List;


/**
 * @desc AR-108 主表实体PO
 * @date 2018-04-2 17:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_PC_REFUNDORDERHEAD")
public class RefundOrderHeadPO {
  @Id
  private String id;

  @Column(name = "HEADID")
  private String headId;

  @Column(name = "ZSKDH")
  private String zskdh;

  @Column(name = "PRCTR")
  private String prctr;

  @Column(name = "BELNR")
  private String belnr;

  @Column(name = "BUDAT")
  private String budat;

  @Column(name = "ZPZZT")
  private String zpzzt;

  @Column(name = "ZDJLX")
  private String zdjlx;

  @Column(name = "ZLCBH")
  private String zlcbh;

  @Column(name = "ZSHR")
  private String zshr;

  @Column(name = "ZDJH")
  private String zdjh;

  @Column(name = "ZDJRQ")
  private String zdjrq;

  @Column(name = "ZSHRQ")
  private String zshrq;

  @Column(name = "ZDJZT")
  private String zdjzt;

  @Column(name = "ZSFLD")
  private String zsfld;

  @Column(name = "ZSPZT")
  private String zspzt;

  @Column(name = "BKTXT")
  private String bktxt;

  @Column(name = "ZSMRQ")
  private String zsmrq;

  @Column(name = "ZSMR")
  private String zsmr;

  @Column(name = "ERDAT")
  private String erdat;

  @Column(name = "ERTIM")
  private String ertim;

  @Column(name = "ERNAM")
  private String ernam;

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

  @Column(name = "ZGUID")
  private String zguid;

  @Column(name = "K2ID")
  private String k2id;

  @Column(name = "PROCESS_CODE")
  private String process_code;

  @Column(name = "FORM_URL")
  private String form_url;

  @Transient
  private List<RefundOrderItemPO> refundOrderItem;

  @Transient
  private List<AttItemPO> attItem;
}
