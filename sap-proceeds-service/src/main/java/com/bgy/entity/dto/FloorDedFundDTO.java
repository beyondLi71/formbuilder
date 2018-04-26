package com.bgy.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Ren ZhiQiang
 * @date 2018/4/24 15:53
 * @desc AR-IF017售楼抵楼款应收传输接口 DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "AR-IF017售楼抵楼款应收传输接口 DTO")
public class FloorDedFundDTO {
    //表单基础信息
    @ApiModelProperty(value = "表单基础信息", example = "")
    private FormInfoDTO formInfo;

    //表单数据
    @ApiModelProperty(value = "表单业务数据", example = "")
    private FloorDedFundBusinessDataDTO businessData;
}
