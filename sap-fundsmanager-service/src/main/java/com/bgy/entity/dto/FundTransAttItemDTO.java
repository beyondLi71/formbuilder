package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 资金划转业务 附件明细表实体PO
 * @by linlangleo
 * @date 2018/4/18 10:24
 */
@Data
@ApiModel(value = "资金划转业务明细表实体")
@NoArgsConstructor
@AllArgsConstructor
public class FundTransAttItemDTO {
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
