package com.bgy.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yyg
 * @date 2018/4/17 13:41
 * @desc 资金划转及结汇购汇业务（结汇购汇业务)附件 VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "资金划转及结汇购汇业务（结汇购汇业务)附件实体")
public class SettexchAtttItemVO {


    @ApiModelProperty(value = "主键", example = "")
    private Long id;

    @ApiModelProperty(value = "关联id", example = "")
    private String headid;

    @ApiModelProperty(value = "附件标识", example = "")
    private String zfileid;

    @ApiModelProperty(value = "附近类型", example = "")
    private String filetype;

    @ApiModelProperty(value = "附件名称", example = "")
    private String filename;

    @ApiModelProperty(value = "附件地址", example = "")
    private String fileurl;

    @ApiModelProperty(value = "图像地址", example = "")
    private String pictureurl;

}
