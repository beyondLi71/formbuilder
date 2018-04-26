package com.bgy.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/24 15:48
 * @desc AR-IF017售楼抵楼款应收传输接口 businessData
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FloorDedFundBusinessDataDTO {

    @ApiModelProperty(value = "AR-IF017主表实体", example = "")
    private  FloorDedFundHeadDTO floorDedFundRecord;
}
