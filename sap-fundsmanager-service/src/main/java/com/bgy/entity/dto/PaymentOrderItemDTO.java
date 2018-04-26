package com.bgy.entity.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by beyondLi
 * Date 2018/4/12 10:56
 * Desc .
 */
@Data
@ApiModel(value = "拉单付款流程 明细表实体")
@AllArgsConstructor
@NoArgsConstructor
public class PaymentOrderItemDTO {
    @JsonProperty("BBJE")
    public String bbje;
    @JsonProperty("SY")
    public String sy;
    @JsonProperty("GZDW")
    public String gzdw;
    @JsonProperty("ZBCZFJE")
    public String zbczfje;
    @JsonProperty("YFDHNO")
    public String yfdhno;
    @JsonProperty("HSRZBM")
    public String hsrzbm;
    @JsonProperty("HKONT")
    public String hkont;
    @JsonProperty("YBJE")
    public String ybje;
    @JsonProperty("ZSZXM")
    public String zszxm;
    @JsonProperty("ZSYLDJE")
    public String zsyldje;
    @JsonProperty("TZKXLX")
    public String tzkxlx;
    @JsonProperty("ZXJLL")
    public String zxjll;
    @JsonProperty("KURSF")
    public String kursf;
    @JsonProperty("WAERS")
    public String waers;
    @JsonProperty("ZZJJH")
    public String zzjjh;
    @JsonProperty("ZFKDNO")
    public String zfkdno;
    @JsonProperty("YSZYDW")
    public String yszydw;
    @JsonProperty("YFDH")
    public String yfdh;
    @JsonProperty("XMQQ")
    public String xmqq;
    @JsonProperty("ZKLDJE")
    public String zkldje;
    @JsonProperty("ZFKDJHNO")
    public String zfkdjhno;
    @JsonProperty("FYLX")
    public String fylx;
    @JsonProperty("YSZYBM")
    public String yszybm;
    private String headId;
}
