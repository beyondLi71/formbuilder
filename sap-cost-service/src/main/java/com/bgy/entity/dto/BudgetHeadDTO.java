package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author yyg
 * @date 2018/4/18 12:00
 * @desc 一般预算调整DTo实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetHeadDTO {

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
    private Date tzrq;

    @JsonProperty("wbzy")
    private String wbzy;

    private List<BudgetFileItemDTO> attitem;

    private List<BudgetRowItemDTO> item;

}