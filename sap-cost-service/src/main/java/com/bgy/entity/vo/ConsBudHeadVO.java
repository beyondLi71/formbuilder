package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Transient;
import java.util.List;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 19:36
 * @desc 消耗预算调整.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsBudHeadVO {


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

    @Transient
    private List<ConsBudItemVO> item;
}

