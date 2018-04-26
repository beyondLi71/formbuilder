package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/23 22:42
 * @desc TR096明细表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "TR096明细表")
public class SpecTransrItemDTO {

    @JsonProperty("ZNUM")
    @ApiModelProperty(value = "", example = "")
    private String znum;

    @JsonProperty("ZDJRQ")
    @ApiModelProperty(value = "", example = "")
    private String zdjrq;

    @JsonProperty("ZSCOM")
    @ApiModelProperty(value = "", example = "")
    private String zscom;

    @JsonProperty("ZSCOM_T")
    @ApiModelProperty(value = "", example = "")
    private String zscom_t;

    @JsonProperty("ZSPC")
    @ApiModelProperty(value = "", example = "")
    private String zspc;

    @JsonProperty("ZSPC_T")
    @ApiModelProperty(value = "", example = "")
    private String zspc_t;

    @JsonProperty("ZSKQY")
    @ApiModelProperty(value = "", example = "")
    private String zskqy;

    @JsonProperty("ZSKBK")
    @ApiModelProperty(value = "", example = "")
    private String zskbk;

    @JsonProperty("ZSKBK_T")
    @ApiModelProperty(value = "", example = "")
    private String zskbk_t;

    @JsonProperty("ZCDXZ")
    @ApiModelProperty(value = "", example = "")
    private String zcdxz;

    @JsonProperty("ZCDXZ_T")
    @ApiModelProperty(value = "", example = "")
    private String zcdxz_t;

    @JsonProperty("ZNBZH")
    @ApiModelProperty(value = "", example = "")
    private String znbzh;

    @JsonProperty("ZNBZH_T")
    @ApiModelProperty(value = "", example = "")
    private String znbzh_t;

    @JsonProperty("ZSSFFZ")
    @ApiModelProperty(value = "", example = "")
    private String zssffz;

    @JsonProperty("ZSBB")
    @ApiModelProperty(value = "", example = "")
    private String zsbb;

    @JsonProperty("ZSBB_T")
    @ApiModelProperty(value = "", example = "")
    private String zsbb_t;

    @JsonProperty("ZSZJYT")
    @ApiModelProperty(value = "", example = "")
    private String zszjyt;

    @JsonProperty("ZSZJYT_T")
    @ApiModelProperty(value = "", example = "")
    private String zszjyt_t;

    @JsonProperty("ZFKGS")
    @ApiModelProperty(value = "", example = "")
    private String zfkgs;

    @JsonProperty("ZFKGS_T")
    @ApiModelProperty(value = "", example = "")
    private String zfkgs_t;

    @JsonProperty("ZFKLRZX")
    @ApiModelProperty(value = "", example = "")
    private String zfklrzx;

    @JsonProperty("ZFKLRZX_T")
    @ApiModelProperty(value = "", example = "")
    private String zfklrzx_t;

    @JsonProperty("ZFKQY")
    @ApiModelProperty(value = "", example = "")
    private String zfkqy;

    @JsonProperty("ZFKBK")
    @ApiModelProperty(value = "", example = "")
    private String zfkbk;

    @JsonProperty("ZFKBK_T")
    @ApiModelProperty(value = "", example = "")
    private String zfkbk_t;

    @JsonProperty("ZFFCDXZ")
    @ApiModelProperty(value = "", example = "")
    private String zffcdxz;

    @JsonProperty("ZFFCDXZ_T")
    @ApiModelProperty(value = "", example = "")
    private String zffcdxz_t;

    @JsonProperty("ZFFNBZH")
    @ApiModelProperty(value = "", example = "")
    private String zffnbzh;

    @JsonProperty("ZFFNBZH_T")
    @ApiModelProperty(value = "", example = "")
    private String zffnbzh_t;

    @JsonProperty("ZFSFFZ")
    @ApiModelProperty(value = "", example = "")
    private String zfsffz;

    @JsonProperty("ZFBB")
    @ApiModelProperty(value = "", example = "")
    private String zfbb;

    @JsonProperty("ZFBB_T")
    @ApiModelProperty(value = "", example = "")
    private String zfbb_t;

    @JsonProperty("ZZJYT")
    @ApiModelProperty(value = "", example = "")
    private String zzjyt;

    @JsonProperty("ZZJYT_T")
    @ApiModelProperty(value = "", example = "")
    private String zzjyt_t;

    @JsonProperty("ZZJLX")
    @ApiModelProperty(value = "", example = "")
    private String zzjlx;

    @JsonProperty("ZZJLX_T")
    @ApiModelProperty(value = "", example = "")
    private String zzjlx_t;

    @JsonProperty("ZJE")
    @ApiModelProperty(value = "", example = "")
    private String zje;

    @JsonProperty("ZBZ")
    @ApiModelProperty(value = "", example = "")
    private String zbz;

    @JsonProperty("ERDAT")
    @ApiModelProperty(value = "", example = "")
    private String erdat;

    @JsonProperty("ERNAM")
    @ApiModelProperty(value = "", example = "")
    private String ernam;

    @JsonProperty("AEDAT")
    @ApiModelProperty(value = "", example = "")
    private String aedat;

    @JsonProperty("AENAM")
    @ApiModelProperty(value = "", example = "")
    private String aenam;
}
