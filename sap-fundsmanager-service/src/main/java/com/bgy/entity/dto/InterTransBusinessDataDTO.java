package com.bgy.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @desc TR058 数据实体
 * @author linlangleo
 * @date 2018-04-19 15:11
 **/
@Data
@ApiModel(value = "TR058 数据实体")
@NoArgsConstructor
@AllArgsConstructor
public class InterTransBusinessDataDTO {
    @ApiModelProperty(value = "TR058主表实体", example = "")
    private InterTransHeadDTO interTransRecord;
}
