package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/24 15:43
 * @desc 售楼抵楼款应收传输接口 明细表DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "AR-IF017售楼抵楼款应收传输接口 明细表DTO")
public class FloorDedFundItemDTO {

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZSKDH")
    private String zskdh;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZHXH")
    private String zhxh;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZFJDM")
    private String zfjdm;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("DMBTR")
    private String dmbtr;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZBHSJ")
    private String zbhsj;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZYFDH")
    private String zyfdh;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("BUZEI")
    private String buzei;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("KUNNR")
    private String kunnr;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZKXMX")
    private String zkxmx;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("MWSKZ")
    private String mwskz;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("BUKRS")
    private String bukrs;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZXM")
    private String zxm;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZHDJH")
    private String zhdjh;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZCPLX")
    private String zcplx;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZSE")
    private String zse;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZHXZT")
    private String zhxzt;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("SGTXT")
    private String sgtxt;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZHXMZT")
    private String zhxmzt;

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZXMDM")
    private String zxmdm;
}
