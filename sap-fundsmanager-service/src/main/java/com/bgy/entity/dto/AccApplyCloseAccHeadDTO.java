package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author yyg
 * @date 2018/4/19 17:20
 * @desc TR-TR034_3-账户销户 DTO实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccApplyCloseAccHeadDTO {

    @JsonProperty("BUKRS")
    private String bukrs;
    @JsonProperty("PRCTR")
    private String prctr;
    @JsonProperty("ZSSBK")
    private String zssbk;
    @JsonProperty("ZSSQY")
    private String zssqy;
    @JsonProperty("ZSFHZGS")
    private String zsfhzgs;
    @JsonProperty("zKHYHFH")
    private String zkhyhfh;
    @JsonProperty("BANKL")
    private String bankl;
    @JsonProperty("BANKN")
    private String bankn;
    @JsonProperty("ZXMMC")
    private String zxmmc;
    @JsonProperty("ZSFNRZJGK")
    private String zsfnrzjgk;
    @JsonProperty("ZKHLHMC")
    private String zkhlhmc;
    @JsonProperty("ZKHLHH")
    private String zkhlhh;
    @JsonProperty("ZZHMC")
    private String zzhmc;
    @JsonProperty("ZKHRQ")
    private String zkhrq;
    @JsonProperty("ZSJMZH")
    private String zsjmzh;
    @JsonProperty("ZKHGJ")
    private String zkhgj;
    @JsonProperty("ZKHSF")
    private String zkhsf;
    @JsonProperty("ZKHCS")
    private String zkhcs;
    @JsonProperty("WAERS")
    private String waers;
    @JsonProperty("ZZHSX")
    private String zzhsx;
    @JsonProperty("ZZHGN")
    private String zzhgn;
    @JsonProperty("ZSFSX")
    private String zsfsx;
    @JsonProperty("ZJGLX")
    private String zjglx;
    @JsonProperty("ZSFGXZH")
    private String zsfgxzh;
    @JsonProperty("ZFSX")
    private String zfsx;
    @JsonProperty("DYZZF")
    private String dyzzf;
    @JsonProperty("SFMRBDZZH")
    private String sfmrbdzzh;
    @JsonProperty("SFFYMRHKZH")
    private String sffymrhkzh;
    @JsonProperty("SFTYZKMRBDZZH")
    private String sftyzkmrbdzzh;
    @JsonProperty("ZSFAJZH")
    private String zsfajzh;
    @JsonProperty("ZAJJZSJ")
    private String zajjzsj;
    @JsonProperty("ZYHLB")
    private String zyhlb;
    @JsonProperty("ZZHLX")
    private String zzhlx;
    @JsonProperty("ZXDJE")
    private String zxdje;
    @JsonProperty("ZBNBLXDYY")
    private String zbnblxdyy;
    @JsonProperty("ZSFKTYQZL")
    private String zsfktyqzl;
    @JsonProperty("ZYQZLKTYY")
    private String zyqzlktyy;
    @JsonProperty("ZSFJTGL")
    private String zsfjtgl;
    @JsonProperty("ZJTGLY")
    private String zjtgly;
    @JsonProperty("ZSFKYKTZJC")
    private String zsfkyktzjc;
    @JsonProperty("ZBJRZJCYY")
    private String zbjrzjcyy;
    @JsonProperty("ZSFKTQYWY")
    private String zsfktqywy;
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
    @JsonProperty("BUTXT")
    private String butxt;
    @JsonProperty("LTEXT")
    private String ltext;
    @JsonProperty("ZSFHZGSMS")
    private String zsfhzgsms;
    @JsonProperty("ZSFNRZJGKMS")
    private String zsfnrzjgkms;
    @JsonProperty("YHJC")
    private String yhjc;
    @JsonProperty("ZSFZZHMS")
    private String zsfzzhms;
    @JsonProperty("ZKHGJMS")
    private String zkhgjms;
    @JsonProperty("ZKHSFMS")
    private String zkhsfms;
    @JsonProperty("ZKHCSMS")
    private String zkhcsms;
    @JsonProperty("WAERSMS")
    private String waersms;
    @JsonProperty("ZZHSXMS")
    private String zzhsxms;
    @JsonProperty("ZZHGNMS")
    private String zzhgnms;
    @JsonProperty("ZSFSXMS")
    private String zsfsxms;
    @JsonProperty("ZJGLXMS")
    private String zjglxms;
    @JsonProperty("ZSFGXZHMS")
    private String zsfgxzhms;
    @JsonProperty("ZFSXMS")
    private String zfsxms;
    @JsonProperty("SFMRBDZZHMS")
    private String sfmrbdzzhms;
    @JsonProperty("SFFYMRHKZHMS")
    private String sffymrhkzhms;
    @JsonProperty("SFTYZKMRBDZZHMS")
    private String sftyzkmrbdzzhms;
    @JsonProperty("ZSFAJZHMS")
    private String zsfajzhms;
    @JsonProperty("ZYHLBMS")
    private String zyhlbms;
    @JsonProperty("ZZHLXMS")
    private String zzhlxms;
    @JsonProperty("ZSFKTYQZLMS")
    private String zsfktyqzlms;
    @JsonProperty("ZSFJTGLMS")
    private String zsfjtglms;
    @JsonProperty("ZSFKYKTZJCMS")
    private String zsfkyktzjcms;
    @JsonProperty("ZSFKTQYWYMS")
    private String zsfktqywyms;

    private List<AccApplyCloseAccItemDTO> accApplyAttItem;
}

