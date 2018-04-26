package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
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
public class AccApplyDTO {

    //表单基础信息
    @ApiModelProperty(value = "表单基础信息", example = "")
    private FormInfoDTO formInfo;


    @JsonProperty(value = "businessData")
    private AccApplyBusinessDataDTO accApplyBusinessData;
}

