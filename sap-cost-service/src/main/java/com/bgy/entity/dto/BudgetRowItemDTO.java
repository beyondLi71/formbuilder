package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yyg
 * @date 2018/4/18 12:00
 * @desc 一般预算调整行项目DTO实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetRowItemDTO {

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