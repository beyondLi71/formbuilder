package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/19 14:59
 * @desc 开户申请提交.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FB_SAP_FM_ACCAPPLYHEAD")
public class AccApplyHeadPO {
    @Id
    private BigDecimal id;

    @Column(name = "ZSEQ_NO")
    private String zseqNo;

    @Column(name = "BUKRS")
    private String bukrs;

    @Column(name = "BUTXT")
    private String butxt;

    @Column(name = "PRCTR")
    private String prctr;

    @Column(name = "LTEXT")
    private String ltext;

    @Column(name = "ZSSBK")
    private String zssbk;

    @Column(name = "ZSSQY")
    private String zssqy;

    @Column(name = "ZSFHZGS")
    private String zsfhzgs;

    @Column(name = "ZSFHZGSMS")
    private String zsfhzgsms;

    @Column(name = "ZKHYHFH")
    private String zkhyhfh;

    @Column(name = "BANKL")
    private String bankl;

    @Column(name = "BANKN")
    private String bankn;

    @Column(name = "ZXMMC")
    private String zxmmc;

    @Column(name = "ZSFNRZJGK")
    private String zsfnrzjgk;

    @Column(name = "ZSFNRZJGKMS")
    private String zsfnrzjgkms;

    @Column(name = "ZKHLHMC")
    private String zkhlhmc;

    @Column(name = "ZKHLHH")
    private String zkhlhh;

    @Column(name = "ZZHMC")
    private String zzhmc;

    @Column(name = "YHJC")
    private String yhjc;

    @Column(name = "ZKHRQ")
    private String zkhrq;

    @Column(name = "ZSFZZH")
    private String zsfzzh;

    @Column(name = "ZSFZZHMS")
    private String zsfzzhms;

    @Column(name = "ZSJMZH")
    private String zsjmzh;

    @Column(name = "ZKHGJ")
    private String zkhgj;

    @Column(name = "ZKHGJMS")
    private String zkhgjms;

    @Column(name = "ZKHSF")
    private String zkhsf;

    @Column(name = "ZKHSFMS")
    private String zkhsfms;

    @Column(name = "ZKHCS")
    private String zkhcs;

    @Column(name = "ZKHCSMS")
    private String zkhcsms;

    @Column(name = "WAERS")
    private String waers;

    @Column(name = "WAERSMS")
    private String waersms;

    @Column(name = "ZZHSX")
    private String zzhsx;

    @Column(name = "ZZHSXMS")
    private String zzhsxms;

    @Column(name = "ZZHGN")
    private String zzhgn;

    @Column(name = "ZZHGNMS")
    private String zzhgnms;
    @Column(name = "ZSFSX")
    private String zsfsx;
    @Column(name = "ZSFSXMS")
    private String zsfsxms;
    @Column(name = "ZJGLX")
    private String zjglx;
    @Column(name = "ZJGLXMS")
    private String zjglxms;
    @Column(name = "ZSFGXZH")
    private String zsfgxzh;
    @Column(name = "ZSFGXZHMS")
    private String zsfgxzhms;
    @Column(name = "ZFSX")
    private String zfsx;
    @Column(name = "ZFSXMS")
    private String zfsxms;
    @Column(name = "DYZZF")
    private String dyzzf;
    @Column(name = "SFMRBDZZH")
    private String sfmrbdzzh;
    @Column(name = "SFMRBDZZHMS")
    private String sfmrbdzzhms;
    @Column(name = "SFFYMRHKZH")
    private String sffymrhkzh;
    @Column(name = "SFFYMRHKZHMS")
    private String sffymrhkzhms;
    @Column(name = "SFTYZKMRBDZZH")
    private String sftyzkmrbdzzh;
    @Column(name = "SFTYZKMRBDZZHMS")
    private String sftyzkmrbdzzhms;
    @Column(name = "ZSFAJZH")
    private String zsfajzh;
    @Column(name = "ZSFAJZHMS")
    private String zsfajzhms;
    @Column(name = "ZAJJZSJ")
    private String zajjzsj;
    @Column(name = "ZYHLB")
    private String zyhlb;
    @Column(name = "ZYHLBMS")
    private String zyhlbms;
    @Column(name = "ZZHLX")
    private String zzhlx;
    @Column(name = "ZZHLXMS")
    private String zzhlxms;
    @Column(name = "ZXDJE")
    private String zxdje;
    @Column(name = "ZBNBLXDYY")
    private String zbnblxdyy;
    @Column(name = "ZSFKTYQZL")
    private String zsfktyqzl;
    @Column(name = "ZSFKTYQZLMS")
    private String zsfktyqzlms;
    @Column(name = "ZYQZLKTYY")
    private String zyqzlktyy;
    @Column(name = "ZSFJTGL")
    private String zsfjtgl;
    @Column(name = "ZSFJTGLMS")
    private String zsfjtglms;
    @Column(name = "ZJTGLY")
    private String zjtgly;
    @Column(name = "ZSFKYKTZJC")
    private String zsfkyktzjc;
    @Column(name = "ZSFKYKTZJCMS")
    private String zsfkyktzjcms;
    @Column(name = "ZBJRZJCYY")
    private String zbjrzjcyy;
    @Column(name = "ZSFKTQYWY")
    private String zsfktqywy;
    @Column(name = "ZSFKTQYWYMS")
    private String zsfktqywyms;

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
    private String  headId;

    @Transient
    private List<AccApplyAttItemPO> attItem;
}

