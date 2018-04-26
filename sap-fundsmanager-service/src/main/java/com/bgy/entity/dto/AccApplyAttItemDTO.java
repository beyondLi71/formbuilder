package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LF--liufang@maxrocky.com
 * @desc  .开户申请提交.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccApplyAttItemDTO {
 
  @JsonProperty("ZFILEID")
  private String zfileid;
  @JsonProperty("FILETYPE")
  private String filetype;
  @JsonProperty("FILENAME")
  private String filename;
  @JsonProperty("FILEURL")
  private String fileurl;
}
