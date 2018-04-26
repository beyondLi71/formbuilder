package com.bgy.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yyg
 * @date 2018/4/17 13:25
 * @desc TR-TR034_2-账户变更 封装实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccApplyAlterAllDTO {

    //表单基础信息
    @ApiModelProperty(value = "表单基础信息", example = "")
    private FormInfoDTO formInfo;

    //表单数据
    @ApiModelProperty(value = "表单业务数据", example = "")
    private AccApplyAlterBusinessDataDTO businessData;

}
