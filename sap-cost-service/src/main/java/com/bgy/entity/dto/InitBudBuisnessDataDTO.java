package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/19 11:38
 * @desc buisnessData.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InitBudBuisnessDataDTO {
    @JsonProperty("initBudRecord")
    private InitBudHeadDTO initBudHead;
}

