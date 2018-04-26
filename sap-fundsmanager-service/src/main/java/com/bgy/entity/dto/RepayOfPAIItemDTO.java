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

/**
 * @desc TR085 明细表实体PO
 * @author linlangleo
 * @date 2018-04-18 23:46
 **/
@Data
@ApiModel(value = "TR085明细表实体")
@NoArgsConstructor
@AllArgsConstructor
public class RepayOfPAIItemDTO {
//  private String id;
//  private String headId;
  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZDJHBH")
  private String zdjhbh;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZDKHTBH")
  private String zdkhtbh;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZFKDH")
  private String zfkdh;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZXMLX_MS")
  private String zxmlx_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZJE_Y")
  private String zje_y;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZJE_B")
  private String zje_b;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZJE_SJ")
  private String zje_sj;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZJEQSRQ")
  private String zjeqsrq;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZJEZZRQ")
  private String zjezzrq;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZSZXM_MS")
  private String zszxm_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZJFXM_MS")
  private String zjfxm_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZXJLLXM_MS")
  private String zxjllxm_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZHTJE")
  private String zhtje;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZFKJE")
  private String zfkje;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZHTQSRQ")
  private String zhtqsrq;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZHTJSRQ")
  private String zhtjsrq;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZJKDW_MS")
  private String zjkdw_ms;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZDKYH_MS")
  private String zdkyh_ms;
}
