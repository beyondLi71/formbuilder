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
 * @desc TR058 附件明细表实体DTO
 * @author linlangleo
 * @date 2018-04-19 17:04
 **/
@Data
@ApiModel(value = "TR058 附件明细表实体DTO")
@NoArgsConstructor
@AllArgsConstructor
public class InterTransAttItemDTO {
//  private String id;
//  private String headId;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("ZFILEID")
  private String zfileid;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("FILETYPE")
  private String filetype;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("FILENAME")
  private String filename;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("FILEURL")
  private String fileurl;

  @ApiModelProperty(value = "", example = "")
  @JsonProperty("PICTUREURL")
  private String pictureurl;
}
