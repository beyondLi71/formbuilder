package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 10:11
 * @desc .预算详情
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecialBudItemDTO {
   

   @JsonProperty("tzdh")
    private String tzdh;

   @JsonProperty("djhh")
    private String djhh;

   @JsonProperty("fictr")
    private String fictr;

   @JsonProperty("ysqj")
    private String ysqj;

   @JsonProperty("adjst")
    private String adjst;

   @JsonProperty("bzxx")
    private String bzxx;

}

