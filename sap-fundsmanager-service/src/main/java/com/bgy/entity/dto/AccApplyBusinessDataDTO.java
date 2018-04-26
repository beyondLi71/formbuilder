package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LF--liufang@maxrocky.com
 * @desc  .开户申请提交.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccApplyBusinessDataDTO {

    @JsonProperty(value = "accApplyRecord")
    private AccApplyHeadDTO accApplyHead;

}

