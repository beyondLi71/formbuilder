package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/19 11:14
 * @desc 一般预算出使化附件.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InitBudAttItemDTO {
    
    @JsonProperty("ZFILEID")
    private String zfileid;

    @JsonProperty("FILETYPE")
    private String filetype;

    @JsonProperty("FILENAME")
    private String filename;

    @JsonProperty("FILEURL")
    private String fileurl;

}

