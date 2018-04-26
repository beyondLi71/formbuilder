package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @desc TR085 主表实体DTO
 * @author linlangleo
 * @date 2018-04-18 17:04
 **/
@Data
@ApiModel(value = "TR085主表")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_FM_REPAYOFPAIHEAD")
public class RepayOfPAIHeadDTO {
//  private String id;
//  private String headId;
  @ApiModelProperty(value = "", example = "")
  @JsonProperty("BUKRS")
  private String bukrs;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZDJBH")
  private String zdjbh;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZDJLX")
  private String zdjlx;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZDJLX_MS")
  private String zdjlx_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("PRCTR")
  private String prctr;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("PRCTR_MS")
  private String prctr_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("KOSTL")
  private String kostl;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("KOSTL_MS")
  private String kostl_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSHZK_MS")
  private String zshzk_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZLCBT")
  private String zlcbt;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZJFDATE")
  private String zjfdate;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("WAERS")
  private String waers;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("KURSF")
  private String kursf;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZZBSCZFQ_MS")
  private String zzbsczfq_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZXYXQXY_MS")
  private String zxyxqxy_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSH9XQY")
  private String zsh9xqy;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSH9XQY_MS")
  private String zsh9xqy_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSHDRJH")
  private String zshdrjh;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSHDRJH_MS")
  private String zshdrjh_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSHXYQD")
  private String zshxyqd;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSHXYQD_MS")
  private String zshxyqd_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSHYNN")
  private String zshynn;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSHYNN_MS")
  private String zshynn_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZYLJZFJE")
  private String zyljzfje;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZLJZFJZRQ")
  private String zljzfjzrq;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZBCZJE1")
  private String zbczje1;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZBCZJE2")
  private String zbczje2;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ACC_NUM")
  private String acc_num;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("BENEFICIAL")
  private String beneficial;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("BANKL")
  private String bankl;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("DESCRIPTION")
  private String description;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("PARTNER_MS")
  private String partner_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZBANKN")
  private String zbankn;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZKOINH")
  private String zkoinh;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZBANKL")
  private String zbankl;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZBANKA")
  private String zbanka;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("GSBER_MS")
  private String gsber_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSSQY_MS")
  private String zssqy_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZRZFB_MS")
  private String zrzfb_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZXGSM")
  private String zxgsm;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZFKDNO")
  private String zfkdno;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZZKDNO")
  private String zzkdno;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZJSZT_MS")
  private String zjszt_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSPZT_MS")
  private String zspzt_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZDJZT_MS")
  private String zdjzt_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZCREDATE")
  private String zcredate;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZCREBY")
  private String zcreby;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("TEL_NUMBER")
  private String tel_number;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("item")
  private List<RepayOfPAIItemDTO> repayOfPAIItemList;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("attItem")
  private List<AttItemDTO> repayOfPAIAttItemList;
}
