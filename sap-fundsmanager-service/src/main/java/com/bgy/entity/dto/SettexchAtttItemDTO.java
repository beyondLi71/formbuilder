package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yyg
 * @date 2018/4/17 13:41
 * @desc 资金划转及结汇购汇业务（结汇购汇业务)附件 DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ApiModel(value = "资金划转及结汇购汇业务（结汇购汇业务)附件实体")
public class SettexchAtttItemDTO {


    @ApiModelProperty(value = "附件标识", example = "")
    @JsonProperty("ZFILEID")
    private String zfileid;

    @ApiModelProperty(value = "附近啊类型", example = "")
    @JsonProperty("FILETYPE")
    private String filetype;

    @ApiModelProperty(value = "附件名称", example = "")
    @JsonProperty("FILENAME")
    private String filename;

    @ApiModelProperty(value = "附件地址", example = "")
    @JsonProperty("FILEURL")
    private String fileurl;

    @ApiModelProperty(value = "图像地址", example = "")
    @JsonProperty("PICTUREURL")
    private String pictureurl;


}
