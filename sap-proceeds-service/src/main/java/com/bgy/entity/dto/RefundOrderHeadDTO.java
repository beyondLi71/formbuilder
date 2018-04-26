package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import java.util.List;


/**
 * @desc AR-108 主表实体DTO
 * @author linlangleo
 * @date 2018-04-22 17:04
 **/
@Data
@ApiModel(value = "AR-108主表实体")
@NoArgsConstructor
@AllArgsConstructor
public class RefundOrderHeadDTO {
  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSKDH")
  private String zskdh;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("PRCTR")
  private String prctr;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("BELNR")
  private String belnr;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("BUDAT")
  private String budat;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZPZZT")
  private String zpzzt;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZDJLX")
  private String zdjlx;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZLCBH")
  private String zlcbh;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSHR")
  private String zshr;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZDJH")
  private String zdjh;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZDJRQ")
  private String zdjrq;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSHRQ")
  private String zshrq;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZDJZT")
  private String zdjzt;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSFLD")
  private String zsfld;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSPZT")
  private String zspzt;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("BKTXT")
  private String bktxt;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSMRQ")
  private String zsmrq;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSMR")
  private String zsmr;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ERDAT")
  private String erdat;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ERTIM")
  private String ertim;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ERNAM")
  private String ernam;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZGUID")
  private String zguid;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("K2ID")
  private String k2id;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("PROCESS_CODE")
  private String process_code;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("FORM_URL")
  private String form_url;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("item")
  private List<RefundOrderItemDTO> refundOrderItem;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("attItem")
  private List<AttItemDTO> attItem;
}
