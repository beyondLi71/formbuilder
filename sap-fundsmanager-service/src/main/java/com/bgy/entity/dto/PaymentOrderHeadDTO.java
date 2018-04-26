package com.bgy.entity.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by beyondLi
 * Date 2018/4/12 10:58
 * Desc .
 */
@Data
@ApiModel(value = "拉单付款 主表实体")
@AllArgsConstructor
@NoArgsConstructor
public class PaymentOrderHeadDTO {
    @JsonProperty("ZQZSJ")
    public String zqzsj;
    @JsonProperty("YQFKSJ")
    public String yqfksj;
    @JsonProperty("YWLX")
    public String ywlx;
    @JsonProperty("ZDJSPZT")
    public String zdjspzt;
    @JsonProperty("ZBLGS")
    public String zblgs;
    @JsonProperty("ZUUID")
    public String zuuid;
    @JsonProperty("ZFKYHZHM")
    public String zfkyhzhm;
    @JsonProperty("ZFKDNO")
    public String zfkdno;
    @JsonProperty("ZTXT")
    public String ztxt;
    @JsonProperty("ZZFNAM")
    public String zzfnam;
    @JsonProperty("ZBWTXT")
    public String zbwtxt;
    @JsonProperty("ZQZNAM")
    public String zqznam;
    @JsonProperty("ZJSFS")
    public String zjsfs;
    @JsonProperty("ZSPZT")
    public String zspzt;
    @JsonProperty("YBJE")
    public String ybje;
    @JsonProperty("ZTJSPRQ")
    public String ztjsprq;
    @JsonProperty("ZSPRQ")
    public String zsprq;
    @JsonProperty("PRCTR")
    public String prctr;
    @JsonProperty("FLG_JJFK")
    public String flgJjfk;
    @JsonProperty("ZFKYHZH")
    public String zfkyhzh;
    @JsonProperty("KURSF")
    public String kursf;
    @JsonProperty("ZFLG_ZFTFZT")
    public String zflgZftfzt;
    @JsonProperty("SKYHZH")
    public String skyhzh;
    @JsonProperty("ZKLDJE")
    public String zkldje;
    @JsonProperty("HTH")
    public String hth;
    @JsonProperty("ZFKDLX")
    public String zfkdlx;
    @JsonProperty("ZFFKDNUM")
    public String zffkdnum;
    @JsonProperty("DFLRZX")
    public String dflrzx;
    @JsonProperty("ZZFSJ")
    public String zzfsj;
    @JsonProperty("DFYFD")
    public String dfyfd;
    @JsonProperty("SKDW")
    public String skdw;
    @JsonProperty("BUKRS")
    @NotBlank(message = "SAP_VALIDATE_001")
    public String bukrs;
    @JsonProperty("ZDZBSM")
    public String zdzbsm;
    @JsonProperty("SKDWHM")
    public String skdwhm;
    @JsonProperty("ZSJZFRQ")
    public String zsjzfrq;
    @JsonProperty("WAERS")
    public String waers;
    @JsonProperty("ERDAT")
    public String erdat;
    @JsonProperty("SKBANKL")
    public String skbankl;
    @JsonProperty("ZYJZFRQ")
    public String zyjzfrq;
    @JsonProperty("FKBANKL")
    public String fkbankl;
    @JsonProperty("ZSPH")
    public String zsph;
    @JsonProperty("ZZFZT")
    public String zzfzt;
    @JsonProperty("DJZT")
    public String djzt;
    @JsonProperty("KOSTL")
    public String kostl;
    @JsonProperty("FLG_BDFGSYCL")
    public String flgBdfgsycl;
    @JsonProperty("BBJE")
    public String bbje;
    @JsonProperty("ZBTBL")
    public String zbtbl;
    @JsonProperty("SY")
    public String sy;
    @JsonProperty("ZBCZFJE")
    public String zbczfje;
    @JsonProperty("ZDR")
    public String zdr;
    @JsonProperty("LYXT")
    public String lyxt;
    @JsonProperty("BDFLRZX")
    public String bdflrzx;
    @JsonProperty("FLG_GX")
    public String flgGx;
    @JsonProperty("BDFYFD")
    public String bdfyfd;
    @JsonProperty("ZSYLDJE")
    public String zsyldje;
    @JsonProperty("DFGS")
    public String dfgs;
    @JsonProperty("BDFGS")
    public String bdfgs;
    @JsonProperty("YFDH")
    public String yfdh;
    @JsonProperty("CJRQ")
    public String cjrq;
    private String headId;
}
