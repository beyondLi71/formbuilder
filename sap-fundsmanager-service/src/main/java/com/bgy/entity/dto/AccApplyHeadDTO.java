package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Transient;
import java.util.List;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/19 14:59
 * @desc 开户申请提交.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccApplyHeadDTO {


    @JsonProperty("ZSEQ_NO")
    private String zseqNo;

    @JsonProperty("BUKRS")
    private String bukrs;

    @JsonProperty("BUTXT")
    private String butxt;

    @JsonProperty("PRCTR")
    private String prctr;

    @JsonProperty("LTEXT")
    private String ltext;

    @JsonProperty("ZSSBK")
    private String zssbk;

    @JsonProperty("ZSSQY")
    private String zssqy;

    @JsonProperty("ZSFHZGS")
    private String zsfhzgs;

    @JsonProperty("ZSFHZGSMS")
    private String zsfhzgsms;

    @JsonProperty("ZKHYHFH")
    private String zkhyhfh;

    @JsonProperty("BANKL")
    private String bankl;

    @JsonProperty("BANKN")
    private String bankn;

    @JsonProperty("ZXMMC")
    private String zxmmc;

    @JsonProperty("ZSFNRZJGK")
    private String zsfnrzjgk;

    @JsonProperty("ZSFNRZJGKMS")
    private String zsfnrzjgkms;

    @JsonProperty("ZKHLHMC")
    private String zkhlhmc;

    @JsonProperty("ZKHLHH")
    private String zkhlhh;

    @JsonProperty("ZZHMC")
    private String zzhmc;

    @JsonProperty("YHJC")
    private String yhjc;

    @JsonProperty("ZKHRQ")
    private String zkhrq;

    @JsonProperty("ZSFZZH")
    private String zsfzzh;

    @JsonProperty("ZSFZZHMS")
    private String zsfzzhms;

    @JsonProperty("ZSJMZH")
    private String zsjmzh;

    @JsonProperty("ZKHGJ")
    private String zkhgj;

    @JsonProperty("ZKHGJMS")
    private String zkhgjms;

    @JsonProperty("ZKHSF")
    private String zkhsf;

    @JsonProperty("ZKHSFMS")
    private String zkhsfms;

    @JsonProperty("ZKHCS")
    private String zkhcs;

    @JsonProperty("ZKHCSMS")
    private String zkhcsms;

    @JsonProperty("WAERS")
    private String waers;

    @JsonProperty("WAERSMS")
    private String waersms;

    @JsonProperty("ZZHSX")
    private String zzhsx;

    @JsonProperty("ZZHSXMS")
    private String zzhsxms;

    @JsonProperty("ZZHGN")
    private String zzhgn;

    @JsonProperty("ZZHGNMS")
    private String zzhgnms;
    @JsonProperty("ZSFSX")
    private String zsfsx;
    @JsonProperty("ZSFSXMS")
    private String zsfsxms;
    @JsonProperty("ZJGLX")
    private String zjglx;
    @JsonProperty("ZJGLXMS")
    private String zjglxms;
    @JsonProperty("ZSFGXZH")
    private String zsfgxzh;
    @JsonProperty("ZSFGXZHMS")
    private String zsfgxzhms;
    @JsonProperty("ZFSX")
    private String zfsx;
    @JsonProperty("ZFSXMS")
    private String zfsxms;
    @JsonProperty("DYZZF")
    private String dyzzf;
    @JsonProperty("SFMRBDZZH")
    private String sfmrbdzzh;
    @JsonProperty("SFMRBDZZHMS")
    private String sfmrbdzzhms;
    @JsonProperty("SFFYMRHKZH")
    private String sffymrhkzh;
    @JsonProperty("SFFYMRHKZHMS")
    private String sffymrhkzhms;
    @JsonProperty("SFTYZKMRBDZZH")
    private String sftyzkmrbdzzh;
    @JsonProperty("SFTYZKMRBDZZHMS")
    private String sftyzkmrbdzzhms;
    @JsonProperty("ZSFAJZH")
    private String zsfajzh;
    @JsonProperty("ZSFAJZHMS")
    private String zsfajzhms;
    @JsonProperty("ZAJJZSJ")
    private String zajjzsj;
    @JsonProperty("ZYHLB")
    private String zyhlb;
    @JsonProperty("ZYHLBMS")
    private String zyhlbms;
    @JsonProperty("ZZHLX")
    private String zzhlx;
    @JsonProperty("ZZHLXMS")
    private String zzhlxms;
    @JsonProperty("ZXDJE")
    private String zxdje;
    @JsonProperty("ZBNBLXDYY")
    private String zbnblxdyy;
    @JsonProperty("ZSFKTYQZL")
    private String zsfktyqzl;
    @JsonProperty("ZSFKTYQZLMS")
    private String zsfktyqzlms;
    @JsonProperty("ZYQZLKTYY")
    private String zyqzlktyy;
    @JsonProperty("ZSFJTGL")
    private String zsfjtgl;
    @JsonProperty("ZSFJTGLMS")
    private String zsfjtglms;
    @JsonProperty("ZJTGLY")
    private String zjtgly;
    @JsonProperty("ZSFKYKTZJC")
    private String zsfkyktzjc;
    @JsonProperty("ZSFKYKTZJCMS")
    private String zsfkyktzjcms;
    @JsonProperty("ZBJRZJCYY")
    private String zbjrzjcyy;
    @JsonProperty("ZSFKTQYWY")
    private String zsfktqywy;
    @JsonProperty("ZSFKTQYWYMS")
    private String zsfktqywyms;

    @JsonProperty("ZUKEYCZY")
    private String zukeyczy;
    @JsonProperty("ZUKEYSHY")
    private String zukeyshy;
    @JsonProperty("ZUKEYGLY")
    private String zukeygly;
    @JsonProperty("ZYLYJCWZ")
    private String zylyjcwz;
    @JsonProperty("ZYLYJSZ")
    private String zylyjsz;
    @JsonProperty("ZYLYJQTSZ")
    private String zylyjqtsz;
    @JsonProperty("HKONT")
    private String hkont;
    @JsonProperty("ZYYLXR")
    private String zyylxr;
    @JsonProperty("ZYHDH")
    private String zyhdh;
    @JsonProperty("ZYHDZ")
    private String zyhdz;
    @JsonProperty("ZJBR")
    private String zjbr;
    @JsonProperty("ZZHBLYY")
    private String zzhblyy;
    @JsonProperty("ZBLZHKL")
    private String zblzhkl;
    @JsonProperty("ZZT")
    private String zzt;
    @JsonProperty("ZTYPE")
    private String ztype;
    @JsonProperty("ZXHRQ")
    private String zxhrq;
    @JsonProperty("ZYQZLBLQK")
    private String zyqzlblqk;
    @JsonProperty("ZZJCSQSP")
    private String zzjcsqsp;
    @JsonProperty("ZJBRLXDH")
    private String zjbrlxdh;
    @JsonProperty("ZXMGSDZ")
    private String zxmgsdz;
    @JsonProperty("ZYQZLZJCZT")
    private String zyqzlzjczt;
    @JsonProperty("ERDAT")
    private String erdat;
    @JsonProperty("ERTIM")
    private String ertim;
    @JsonProperty("ERNAM")
    private String ernam;
    @JsonProperty("AEDAT")
    private String aedat;
    @JsonProperty("AETIM")
    private String aetim;
    @JsonProperty("AENAM")
    private String aenam;

    @Transient
    private List<AccApplyAttItemDTO> attItem;
}

