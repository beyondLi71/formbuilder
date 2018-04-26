package com.bgy.entity.vo;

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
public class InitBudHeadVO {


    private String xjdh;


    private String fikrs;


    private String gjahr;


    private String tijr;


    private String tjrq;


    private String wbzy;

    private List<InitBudItemVO> item;
}

