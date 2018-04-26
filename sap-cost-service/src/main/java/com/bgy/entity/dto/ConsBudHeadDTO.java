package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 19:36
 * @desc 消耗预算调整.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsBudHeadDTO {


    private String tzdh;


    private String fikrs;


    private String djlx;


    private String gjahr;


    private String tizr;


    private String tzrq;


    private String ysly;


    //private String zxlb;
    private String fund;


    private String wbzy;

    @JsonProperty("attitem")
    private List<ConsBudAttItemDTO> attItem;

    private List<ConsBudItemDTO> item;


}

