package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 20:16
 * @desc 预算执行结果管理.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsBudDTO {
    //头信息
    private FormInfoDTO formInfo;

    //表单信息
    @JsonProperty("buisnessData")
    private ConsBudBusinessDataDTO consBudBusinessData;
}

