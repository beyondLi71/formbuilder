package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/19 11:40
 * @desc InitBud主体.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InitBudDTO {
    //头信息
    private FormInfoDTO formInfo;

    //表单信息
    @JsonProperty("businessData")
    private InitBudBuisnessDataDTO initBudBuisnessData;
}

