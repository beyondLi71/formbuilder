package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/19 10:50
 * @desc 一般预算初始化.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InitBudHeadDTO {


    private String xjdh;


    private String fikrs;


    private String gjahr;


    private String tijr;


    private String tjrq;


    private String wbzy;

    @JsonProperty("attitem")
    private List<InitBudAttItemDTO> attItem;


    private List<InitBudItemDTO> item;
}

