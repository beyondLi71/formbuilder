package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 20:19
 * @desc 执行预算结果.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsBudBusinessDataDTO {

    @JsonProperty("ConsBudget_Record")
    private ConsBudHeadDTO consBudRecord;
}

