package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 19:55
 * @desc 消耗附件.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsBudAttItemDTO {

    @JsonProperty("ZFILEID")
    private String zfileid;

    @JsonProperty("FILETYPE")
    private String filetype;

    @JsonProperty("FILENAME")
    private String filename;

    @JsonProperty("FILEURL")
    private String fileurl;
}

