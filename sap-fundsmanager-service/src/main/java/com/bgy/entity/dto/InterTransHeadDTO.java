package com.bgy.entity.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @desc TR058 主表实体DTO
 * @author linlangleo
 * @date 2018-04-19 17:04
 **/
@Data
@ApiModel(value = "TR058 主表实体")
@NoArgsConstructor
@AllArgsConstructor
public class InterTransHeadDTO {
//  private Long id;
//  private String headId;

  @ApiModelProperty(value = "", example = "")
  private String zdjbh;

  @ApiModelProperty(value = "", example = "")
  private String zcom;

  @ApiModelProperty(value = "", example = "")
  private String butxt;

  @ApiModelProperty(value = "", example = "")
  private String ktext;

  @ApiModelProperty(value = "", example = "")
  private String zddlyn;

  @ApiModelProperty(value = "", example = "")
  private String zddfxn;

  @ApiModelProperty(value = "", example = "")
  private String erdat;

  @ApiModelProperty(value = "", example = "")
  private String ernam;

  @ApiModelProperty(value = "", example = "")
  private String zpc;

  @ApiModelProperty(value = "", example = "")
  private String zdjlx;

  @ApiModelProperty(value = "", example = "")
  private String zddfx;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("item")
  private List<InterTransItemDTO> interTransItem;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("attItem")
  private List<InterTransAttItemDTO> interTransAttItem;
}
