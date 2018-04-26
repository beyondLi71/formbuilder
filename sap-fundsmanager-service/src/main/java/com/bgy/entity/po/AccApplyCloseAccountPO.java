package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author yyg
 * @date 2018/4/19 13:38
 * @desc TR-TR034_3-账户销户 实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FB_SAP_FM_ACCCLOSEACCOUNTHEAD")
public class AccApplyCloseAccountPO {

    @Id
    private Long id;

    @Column(name = "BUKRS")
    private String bukrs;
    @Column(name = "PRCTR")
    private String prctr;
    @Column(name = "ZSSBK")
    private String zssbk;
    @Column(name = "ZSSQY")
    private String zssqy;
    @Column(name = "ZSFHZGS")
    private String zsfhzgs;
    @Column(name = "zKHYHFH")
    private String zkhyhfh;
    @Column(name = "BANKL")
    private String bankl;
    @Column(name = "BANKN")
    private String bankn;
    @Column(name = "ZXMMC")
    private String zxmmc;
    @Column(name = "ZSFNRZJGK")
    private String zsfnrzjgk;
    @Column(name = "ZKHLHMC")
    private String zkhlhmc;
    @Column(name = "ZKHLHH")
    private String zkhlhh;
    @Column(name = "ZZHMC")
    private String zzhmc;
    @Column(name = "ZKHRQ")
    private String zkhrq;
    @Column(name = "ZSJMZH")
    private String zsjmzh;
    @Column(name = "ZKHGJ")
    private String zkhgj;
    @Column(name = "ZKHSF")
    private String zkhsf;
    @Column(name = "ZKHCS")
    private String zkhcs;
    @Column(name = "WAERS")
    private String waers;
    @Column(name = "ZZHSX")
    private String zzhsx;
    @Column(name = "ZZHGN")
    private String zzhgn;
    @Column(name = "ZSFSX")
    private String zsfsx;
    @Column(name = "ZJGLX")
    private String zjglx;
    @Column(name = "ZSFGXZH")
    private String zsfgxzh;
    @Column(name = "ZFSX")
    private String zfsx;
    @Column(name = "DYZZF")
    private String dyzzf;
    @Column(name = "SFMRBDZZH")
    private String sfmrbdzzh;
    @Column(name = "SFFYMRHKZH")
    private String sffymrhkzh;
    @Column(name = "SFTYZKMRBDZZH")
    private String sftyzkmrbdzzh;
    @Column(name = "ZSFAJZH")
    private String zsfajzh;
    @Column(name = "ZAJJZSJ")
    private String zajjzsj;
    @Column(name = "ZYHLB")
    private String zyhlb;
    @Column(name = "ZZHLX")
    private String zzhlx;
    @Column(name = "ZXDJE")
    private String zxdje;
    @Column(name = "ZBNBLXDYY")
    private String zbnblxdyy;
    @Column(name = "ZSFKTYQZL")
    private String zsfktyqzl;
    @Column(name = "ZYQZLKTYY")
    private String zyqzlktyy;
    @Column(name = "ZSFJTGL")
    private String zsfjtgl;
    @Column(name = "ZJTGLY")
    private String zjtgly;
    @Column(name = "ZSFKYKTZJC")
    private String zsfkyktzjc;
    @Column(name = "ZBJRZJCYY")
    private String zbjrzjcyy;
    @Column(name = "ZSFKTQYWY")
    private String zsfktqywy;
    @Column(name = "ZUKEYCZY")
    private String zukeyczy;
    @Column(name = "ZUKEYSHY")
    private String zukeyshy;
    @Column(name = "ZUKEYGLY")
    private String zukeygly;
    @Column(name = "ZYLYJCWZ")
    private String zylyjcwz;
    @Column(name = "ZYLYJSZ")
    private String zylyjsz;
    @Column(name = "ZYLYJQTSZ")
    private String zylyjqtsz;
    @Column(name = "HKONT")
    private String hkont;
    @Column(name = "ZYYLXR")
    private String zyylxr;
    @Column(name = "ZYHDH")
    private String zyhdh;
    @Column(name = "ZYHDZ")
    private String zyhdz;
    @Column(name = "ZJBR")
    private String zjbr;
    @Column(name = "ZZHBLYY")
    private String zzhblyy;
    @Column(name = "ZBLZHKL")
    private String zblzhkl;
    @Column(name = "ZZT")
    private String zzt;
    @Column(name = "ZTYPE")
    private String ztype;
    @Column(name = "ZXHRQ")
    private String zxhrq;
    @Column(name = "ZYQZLBLQK")
    private String zyqzlblqk;
    @Column(name = "ZZJCSQSP")
    private String zzjcsqsp;
    @Column(name = "ZJBRLXDH")
    private String zjbrlxdh;
    @Column(name = "ZXMGSDZ")
    private String zxmgsdz;
    @Column(name = "ZYQZLZJCZT")
    private String zyqzlzjczt;
    @Column(name = "ERDAT")
    private String erdat;
    @Column(name = "ERTIM")
    private String ertim;
    @Column(name = "ERNAM")
    private String ernam;
    @Column(name = "AEDAT")
    private String aedat;
    @Column(name = "AETIM")
    private String aetim;
    @Column(name = "AENAM")
    private String aenam;
    @Column(name = "BUTXT")
    private String butxt;
    @Column(name = "LTEXT")
    private String ltext;
    @Column(name = "ZSFHZGSMS")
    private String zsfhzgsms;
    @Column(name = "ZSFNRZJGKMS")
    private String zsfnrzjgkms;
    @Column(name = "YHJC")
    private String yhjc;
    @Column(name = "ZSFZZHMS")
    private String zsfzzhms;
    @Column(name = "ZKHGJMS")
    private String zkhgjms;
    @Column(name = "ZKHSFMS")
    private String zkhsfms;
    @Column(name = "ZKHCSMS")
    private String zkhcsms;
    @Column(name = "WAERSMS")
    private String waersms;
    @Column(name = "ZZHSXMS")
    private String zzhsxms;
    @Column(name = "ZZHGNMS")
    private String zzhgnms;
    @Column(name = "ZSFSXMS")
    private String zsfsxms;
    @Column(name = "ZJGLXMS")
    private String zjglxms;
    @Column(name = "ZSFGXZHMS")
    private String zsfgxzhms;
    @Column(name = "ZFSXMS")
    private String zfsxms;
    @Column(name = "SFMRBDZZHMS")
    private String sfmrbdzzhms;
    @Column(name = "SFFYMRHKZHMS")
    private String sffymrhkzhms;
    @Column(name = "SFTYZKMRBDZZHMS")
    private String sftyzkmrbdzzhms;
    @Column(name = "ZSFAJZHMS")
    private String zsfajzhms;
    @Column(name = "ZYHLBMS")
    private String zyhlbms;
    @Column(name = "ZZHLXMS")
    private String zzhlxms;
    @Column(name = "ZSFKTYQZLMS")
    private String zsfktyqzlms;
    @Column(name = "ZSFJTGLMS")
    private String zsfjtglms;
    @Column(name = "ZSFKYKTZJCMS")
    private String zsfkyktzjcms;
    @Column(name = "ZSFKTQYWYMS")
    private String zsfktqywyms;

    @Column(name = "CREATE_TIME")
    private LocalDateTime createTime;

    @Column(name = "CREATE_BY")
    private String createBy;

    @Column(name = "UPDATE_TIME")
    private LocalDateTime updateTime;

    @Column(name = "UPDATE_BY")
    private String updateBy;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "HEADID")
    private String headid;
}

