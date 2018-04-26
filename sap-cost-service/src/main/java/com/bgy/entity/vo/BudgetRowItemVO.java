package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yyg
 * @date 2018/4/18 12:00
 * @desc 一般预算调整行项目实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetRowItemVO {

    private Long id;

    private String tzdh;

    private String djhh;

    private String fictr;

    private String ysqj;

    private String adjst;

    private String bzxx;

    private String headid;

}