package com.bgy.entity.vo;

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
public class SpecialBudHeadVO {


    private String tzdh;

    private String fikrs;

    private String djlx;

    private String gjahr;

    private String fund;

    private String tizr;

    private String tzrq;

    private String wbzy;

    private List<SpecialBudItemVO> item;



}

