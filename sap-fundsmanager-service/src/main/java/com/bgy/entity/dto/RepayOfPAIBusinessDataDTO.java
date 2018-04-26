package com.bgy.entity.dto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @desc TR085 数据实体
 * @author linlangleo
 * @date 2018-04-19 8:37
 **/
@Data
@ApiModel(value = "TR085 数据实体")
@NoArgsConstructor
@AllArgsConstructor
public class RepayOfPAIBusinessDataDTO {
    @ApiModelProperty(value = "TR085主表实体", example = "")
    private  RepayOfPAIHeadDTO repayOfPAIRecord;
}
