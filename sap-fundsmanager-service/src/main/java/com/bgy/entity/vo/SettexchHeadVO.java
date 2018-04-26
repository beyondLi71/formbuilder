package com.bgy.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author yyg
 * @date 2018/4/17 13:25
 * @desc 资金划转及结汇购汇业务（结汇购汇业务) VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "资金划转及结汇购汇业务（结汇购汇业务) 实体")
public class SettexchHeadVO {

    @ApiModelProperty(value = "主键", example = "")
    private Long id;

    @ApiModelProperty(value = "流程id", example = "")
    private String headid;

    @ApiModelProperty(value = "单据编号", example = "")
    private String zdjbh;

    @ApiModelProperty(value = "公司代码", example = "")
    private String zbukrs;

    @ApiModelProperty(value = "公司名称", example = "")
    private String zbutxt;

    @ApiModelProperty(value = "利润中心", example = "")
    private String zprctr;

    @ApiModelProperty(value = "利润中心文本", example = "")
    private String zltext;

    @ApiModelProperty(value = "单据类型", example = "")
    private String zdjlxnum;

    @ApiModelProperty(value = "单据类型文本", example = "")

    private String zdjlxms;

    @ApiModelProperty(value = "收支项目编码", example = "")
    private String zszxm;

    @ApiModelProperty(value = "收支项目名称", example = "")
    private String zszxmn;

    @ApiModelProperty(value = "现金流量编码", example = "")
    private String zxjllbm;

    @ApiModelProperty(value = "现金流量名称", example = "")
    private String zxjllmc;

    @ApiModelProperty(value = "业务类型", example = "")
    private String zywlx;

    @ApiModelProperty(value = "货币编码", example = "")
    private String twaers;

    @ApiModelProperty(value = "货币名称", example = "")
    private String ltext;

    @ApiModelProperty(value = "本币账号", example = "")
    private String bankn1;

    @ApiModelProperty(value = "外币账号", example = "")
    private String bankn2;

    @ApiModelProperty(value = "本币业务事项", example = "")
    private String zywsx1;

    @ApiModelProperty(value = "外币业务事项", example = "")
    private String zywsx2;

    @ApiModelProperty(value = "业务说明", example = "")
    private String zywsm;

    @ApiModelProperty(value = "制单日期", example = "")
    private Date zzdrq;

    @ApiModelProperty(value = "制单人", example = "")
    private String zzdr;

    @ApiModelProperty(value = "摘要信息", example = "")
    private String zzyxx;

    @ApiModelProperty(value = "单据状态", example = "")
    private String zdjzt;

    @ApiModelProperty(value = "直接汇率", example = "")
    private String zzjhv;

    @ApiModelProperty(value = "本币金额", example = "")
    private String zbbje;

    @ApiModelProperty(value = "外币金额", example = "")
    private String zwbje;

    @ApiModelProperty(value = "资金划转及结汇购汇业务（结汇购汇业务)附件实体", example = "")
    private List<SettexchAtttItemVO> settexchAtttItemVO;


}
