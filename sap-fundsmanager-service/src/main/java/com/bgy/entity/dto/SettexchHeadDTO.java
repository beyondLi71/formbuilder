package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author yyg
 * @date 2018/4/17 13:25
 * @desc 资金划转及结汇购汇业务（结汇购汇业务) DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ApiModel(value = "资金划转及结汇购汇业务（结汇购汇业务) 实体")
public class SettexchHeadDTO {

    @ApiModelProperty(value = "单据编号", example = "")
    @JsonProperty("ZDJBH")
    private String zdjbh;

    @ApiModelProperty(value = "公司代码", example = "")
    @JsonProperty("ZBUKRS")
    private String zbukrs;

    @ApiModelProperty(value = "公司名称", example = "")
    @JsonProperty("ZBUTXT")
    private String zbutxt;

    @ApiModelProperty(value = "利润中心", example = "")
    @JsonProperty("ZPRCTR")
    private String zprctr;

    @ApiModelProperty(value = "利润中心文本", example = "")
    @JsonProperty("ZLTEXT")
    private String zltext;

    @ApiModelProperty(value = "单据类型", example = "")
    @JsonProperty("ZDJLXNUM")
    private String zdjlxnum;

    @ApiModelProperty(value = "单据类型文本", example = "")
    @JsonProperty("ZDJLXMS")
    private String zdjlxms;

    @ApiModelProperty(value = "收支项目编码", example = "")
    @JsonProperty("ZSZXM")
    private String zszxm;

    @ApiModelProperty(value = "收支项目名称", example = "")
    @JsonProperty("ZSZXMN")
    private String zszxmn;

    @ApiModelProperty(value = "现金流量编码", example = "")
    @JsonProperty("ZXJLLBM")
    private String zxjllbm;

    @ApiModelProperty(value = "现金流量名称", example = "")
    @JsonProperty("ZXJLLMC")
    private String zxjllmc;

    @ApiModelProperty(value = "业务类型", example = "")
    @JsonProperty("ZYWLX")
    private String zywlx;

    @ApiModelProperty(value = "货币编码", example = "")
    @JsonProperty("TWAERS")
    private String twaers;

    @ApiModelProperty(value = "货币名称", example = "")
    @JsonProperty("LTEXT")
    private String ltext;

    @ApiModelProperty(value = "本币账号", example = "")
    @JsonProperty("BANKN1")
    private String bankn1;

    @ApiModelProperty(value = "外币账号", example = "")
    @JsonProperty("BANKN2")
    private String bankn2;

    @ApiModelProperty(value = "本币业务事项", example = "")
    @JsonProperty("ZYWSX1")
    private String zywsx1;

    @ApiModelProperty(value = "外币业务事项", example = "")
    @JsonProperty("ZYWSX2")
    private String zywsx2;

    @ApiModelProperty(value = "业务说明", example = "")
    @JsonProperty("ZYWSM")
    private String zywsm;

    @ApiModelProperty(value = "制单日期", example = "")
    @JsonProperty("ZZDRQ")
    private Date zzdrq;

    @ApiModelProperty(value = "制单人", example = "")
    @JsonProperty("ZZDR")
    private String zzdr;

    @ApiModelProperty(value = "摘要信息", example = "")
    @JsonProperty("ZZYXX")
    private String zzyxx;

    @ApiModelProperty(value = "单据状态", example = "")
    @JsonProperty("ZDJZT")
    private String zdjzt;

    @ApiModelProperty(value = "直接汇率", example = "")
    @JsonProperty("ZZJHV")
    private String zzjhv;

    @ApiModelProperty(value = "本币金额", example = "")
    @JsonProperty("ZBBJE")
    private String zbbje;

    @ApiModelProperty(value = "外币金额", example = "")
    @JsonProperty("ZWBJE")
    private String zwbje;

    //表单数据
    @ApiModelProperty(value = "表单业务附件数据", example = "")
    private List<SettexchAtttItemDTO> settExchAtttItem;


}

