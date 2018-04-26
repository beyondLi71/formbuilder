package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 资金划转业务 主表实体DTO
 */
@Data
@ApiModel(value = "资金划转业务主表实体")
@NoArgsConstructor
@AllArgsConstructor
public class FundTransHeadDTO {
//  private String id;
//  private String headId;
  @ApiModelProperty(value = "唯一标识", example = "")
  @JsonProperty("ZUUID")
  private String zuuid;

  @ApiModelProperty(value = "单据编号", example = "")
  @JsonProperty("ZDJBH")
  private String zdjbh;

  @ApiModelProperty(value = "公司代码", example = "")
  @JsonProperty("ZBUKRS")
  private String zbukrs;

  @ApiModelProperty(value = "公司名称", example = "")
  @JsonProperty("ZBUTXT")
  private String zbutxt;

  @ApiModelProperty(value = "利润中心", example = "")
  @JsonProperty("ZPRCTR")
  private String zprctr;

  @ApiModelProperty(value = "利润中心文本", example = "")
  @JsonProperty("ZLTEXT")
  private String zltext;

  @ApiModelProperty(value = "单据类型", example = "")
  @JsonProperty("ZDJLXNUM")
  private String zdjlxnum;

  @ApiModelProperty(value = "单据类型描述", example = "")
  @JsonProperty("ZDJLXMS")
  private String zdjlxms;

  @ApiModelProperty(value = "收支项目编码", example = "")
  @JsonProperty("ZSZXM")
  private String zszxm;

  @ApiModelProperty(value = "收支项目名称", example = "")
  @JsonProperty("ZSZXMN")
  private String zszxmn;

  @ApiModelProperty(value = "现金流量编码", example = "")
  @JsonProperty("ZXJLLBM")
  private String zxjllbm;

  @ApiModelProperty(value = "现金流量名称", example = "")
  @JsonProperty("ZXJLLMC")
  private String zxjllmc;

  @ApiModelProperty(value = "货币编码", example = "")
  @JsonProperty("TWAERS")
  private String twaers;

  @ApiModelProperty(value = "货币名称", example = "")
  @JsonProperty("LTEXT")
  private String ltext;

  @ApiModelProperty(value = "划出银行账号", example = "")
  @JsonProperty("BANKN1")
  private String bankn1;

  @ApiModelProperty(value = "划入银行账号", example = "")
  @JsonProperty("BANKN2")
  private String bankn2;

  @ApiModelProperty(value = "划出业务类型", example = "")
  @JsonProperty("ZHCYWLX")
  private String zhcywlx;

  @ApiModelProperty(value = "划入业务类型", example = "")
  @JsonProperty("ZHRYWLX")
  private String zhrywlx;

  @ApiModelProperty(value = "划转说明", example = "")
  @JsonProperty("ZHZSM")
  private String zhzsm;

  @ApiModelProperty(value = "划转金额", example = "")
  @JsonProperty("ZHZJE")
  private String zhzje;

  @ApiModelProperty(value = "制单日期", example = "")
  @JsonProperty("ZZDRQ")
  private String zzdrq;

  @ApiModelProperty(value = "制单人", example = "")
  @JsonProperty("ZZDR")
  private String zzdr;

  @ApiModelProperty(value = "摘要信息", example = "")
  @JsonProperty("ZZYXX")
  private String zzyxx;

  @ApiModelProperty(value = "现金流量项目", example = "")
  @JsonProperty("ZXJLLXM")
  private String zxjllxm;

  @ApiModelProperty(value = "附件明细表", example = "")
  @JsonProperty("fundTransAttItem")
  private List<FundTransAttItemDTO> fundTransAttItem;
}
