package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/24 15:46
 * @desc AR-IF017售楼抵楼款应收传输接口 主表dto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "AR-IF017售楼抵楼款应收传输接口 主表DTO")
public class FloorDedFundHeadDTO {

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZDJH")
    private String zdjh;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ERNAM")
    private String ernam;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZSHR")
    private String zshr;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZDJRQ")
    private String zdjrq;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZDJZT")
    private String zdjzt;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZSHRQ")
    private String zshrq;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("PRCTR")
    private String prctr;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZPRCTR")
    private String zprctr;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("BUKRS")
    private String bukrs;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZSKDH")
    private String zskdh;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZDJLX")
    private String zdjlx;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("BUDAT")
    private String budat;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("BELNR")
    private String belnr;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("BKTXT")
    private String bktxt;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ERDAT")
    private String erdat;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZSPZT")
    private String zspzt;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZPZZT")
    private String zpzzt;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZDLKLX")
    private String zdlklx;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("item")
    private List<FloorDedFundItemDTO> item;
    @ApiModelProperty(value = "", example = "")
    @JsonProperty("attItem")
    private List<AttItemDTO> attItem;

}
