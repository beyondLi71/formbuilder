package com.bgy.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yyg
 * @date 2018/4/17 13:25
 * @desc 资金划转及结汇购汇业务（结汇购汇业务) 接受Sap传输数据 DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ApiModel(value = "资金划转及结汇购汇业务（结汇购汇业务) 接受Sap传输数据实体")
public class SettexchDTO {

    //表单基础信息
    @ApiModelProperty(value = "表单基础信息", example = "")
    private FormInfoDTO formInfo;

    //表单数据
    @ApiModelProperty(value = "表单业务数据", example = "")
    private SettexchBusinessDataDTO businessData;

}
