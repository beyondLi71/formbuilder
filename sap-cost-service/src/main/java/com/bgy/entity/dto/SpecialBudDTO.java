package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 10:43
 * @desc 专项预算.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecialBudDTO {
    //头信息
    private FormInfoDTO formInfo;

    //表单信息
    @JsonProperty("businessData")
    private SpecialBudBusinessDataDTO specialBudBusinessData;
}

