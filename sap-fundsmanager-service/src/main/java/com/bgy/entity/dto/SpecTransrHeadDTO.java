package com.bgy.entity.dto;

import com.bgy.entity.vo.SpecTransrItemVO;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/23 20:29
 * @desc TR-096特转单审批表实体vo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "TR096主表")
public class SpecTransrHeadDTO {

    @ApiModelProperty(value = "", example = "")
    @JsonProperty("ZDJBH")
    private String zdjbh;

    @JsonProperty("ZCOM")
    @ApiModelProperty(value = "", example = "")
    private String zcom;

    @JsonProperty("BUTXT")
    @ApiModelProperty(value = "", example = "")
    private String butxt;

    @JsonProperty("ZPC")
    @ApiModelProperty(value = "", example = "")
    private String zpc;

    @JsonProperty("KTEXT")
    @ApiModelProperty(value = "", example = "")
    private String ktext;

    @JsonProperty("ZDDFX")
    @ApiModelProperty(value = "", example = "")
    private String zddfx;

    @JsonProperty("ZDDFXN")
    @ApiModelProperty(value = "", example = "")
    private String zddfxn;

    @JsonProperty("ZDJLX")
    @ApiModelProperty(value = "", example = "")
    private String zdjlx;

    @JsonProperty("ZDDLYN")
    @ApiModelProperty(value = "", example = "")
    private String zddlyn;

    @JsonProperty("ERDAT")
    @ApiModelProperty(value = "", example = "")
    private String erdat;

    @JsonProperty("ERNAM")
    @ApiModelProperty(value = "", example = "")
    private String ernam;

    @JsonProperty("item")
    @ApiModelProperty(value = "", example = "")
    private List<SpecTransrItemDTO> item;

    @JsonProperty("attItem")
    @ApiModelProperty(value = "", example = "")
    private List<SpecTransrItemDTO> attItem;
}
