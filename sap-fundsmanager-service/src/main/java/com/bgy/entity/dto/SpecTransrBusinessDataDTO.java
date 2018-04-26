package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/23 23:22
 * @desc SpecTransrBusinessDataDTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "tr-096实体")
public class SpecTransrBusinessDataDTO {

    @ApiModelProperty(value = "", example = "")
    @JsonProperty(value = "specTransrRecord")
    SpecTransrHeadDTO specTransrRecord;
}
