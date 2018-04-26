package com.bgy.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

/**
 * Created by beyondLi
 * Date 2018/4/12 10:52
 * Desc .
 */
@Data
@ApiModel(value = "拉单付款流程的总数据接收实体")
@AllArgsConstructor
@NoArgsConstructor
public class GetSapInfoDTO {
    @Valid
    @ApiModelProperty(value = "表单基础信息", example = "")
    public FormInfoDTO formInfo;

    @Valid
    @ApiModelProperty(value = "表单业务数据", example = "")
    public BusinessDataDTO businessData;
}
