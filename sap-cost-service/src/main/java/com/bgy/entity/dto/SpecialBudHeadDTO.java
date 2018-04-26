package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 9:28
 * @desc .
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecialBudHeadDTO {
    
    @JsonProperty("tzdh")
    private String tzdh;

    @JsonProperty("fikrs")
    private String fikrs;

    @JsonProperty("djlx")
    private String djlx;

    @JsonProperty("gjahr")
    private String gjahr;

    @JsonProperty("fund")
    private String fund;

    @JsonProperty("tizr")
    private String tizr;

    @JsonProperty("tzrq")
    private String tzrq;

    @JsonProperty("wbzy")
    private String wbzy;

    @JsonProperty("attitem")
    private List<SpecialBudAttItemDTO> attItem;

    private List<SpecialBudItemDTO> item;
}

