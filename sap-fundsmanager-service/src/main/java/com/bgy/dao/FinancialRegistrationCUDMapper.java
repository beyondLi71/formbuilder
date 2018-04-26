package com.bgy.dao;


import com.bgy.entity.po.PaymentOrderHeadPO;
import com.bgy.entity.po.PaymentOrderItemPO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.bgy.entity.po.FinancialRegisterItemPO;
import org.apache.ibatis.annotations.Select;


/**
 * 理财登记流程的增删改Mapper
 */
public interface FinancialRegistrationCUDMapper {
    /**
     *  插入理财登记流程的明细表 数据
     *  最后插入 HEADID 的是 传进来的单号docID
     */
    @Insert("insert into FB_SAP_FM_FINANCIALREGISTITEM" +
            " (ID, BUKRS, ZDJDJBH, ZDJDJRQ, PRCTR, ZSHQC, ZJYLXBM, ZJYLXMC, ZDJZT, ZLCCPLX, ZTZXM, ZJJGS, ZJNJW, " +
            " ZFXJG, BANKN, NAME1_TEXT, BANKA, ZJTQY, ZSSBK, ZSHDSF, ZZFFS, ZBANKN2, ZNAME1_TEXT2, ZBANKA2, ZGMYY," +
            " ZLCFJ, ZCPDM, ZCPMC, ZSHBB, ZSHYCLH, ZJE, WAERS,  KURSF, ZBWBJE, ZJXJC, ZQXR, ZYQDQR, ZYQQX, ZYQNHL," +
            " ZYQSY, ZYQSY2, ZSHJE, ZBJSZXM, ZBJJHXM, ZBJXJLL, ZYQRSY, ZYY, ZKXXFX, ZBZ, BELNR, GJAHR, ZJSDDH," +
            " ZCDYY, ZZDR, ZZDSJ, ZSPR, ZSPSJ, ZXGR, ZXGSJ, HEADID)" +
            " values (#{fri.id}, #{fri.bukrs}, #{fri.zdjdjbh}, #{fri.zdjdjrq}, #{fri.prctr}, #{fri.zshqc}," +
            " #{fri.zjylxbm}, #{fri.zjylxmc}, #{fri.zdjzt}, #{fri.zlccplx}, #{fri.ztzxm}, #{fri.zjjgs}, #{fri.zjnjw}," +
            " #{fri.zfxjg}, #{fri.bankn}, #{fri.name1_text}, #{fri.banka}, #{fri.zjtqy}, #{fri.zssbk}, #{fri.zshdsf}," +
            " #{fri.zzffs}, #{fri.zbankn2}, #{fri.zname1_text2}, #{fri.zbanka2}, #{fri.zgmyy}, #{fri.zlcfj}," +
            " #{fri.zcpdm}, #{fri.zcpmc}, #{fri.zshbb}, #{fri.zshyclh}, #{fri.zje}, #{fri.waers},  #{fri.kursf}," +
            " #{fri.zbwbje}, #{fri.zjxjc}, #{fri.zqxr}, #{fri.zyqdqr}, #{fri.zyqqx}, #{fri.zyqnhl}, #{fri.zyqsy}," +
            " #{fri.zyqsy2}, #{fri.zshje}, #{fri.zbjszxm}, #{fri.zbjjhxm}, #{fri.zbjxjll}, #{fri.zyqrsy}, #{fri.zyy}," +
            " #{fri.zkxxfx}, #{fri.zbz}, #{fri.belnr}, #{fri.gjahr}, #{fri.zjsddh}, #{fri.zcdyy}, #{fri.zzdr}," +
            " #{fri.zzdsj}, #{fri.zspr}, #{fri.zspsj}, #{fri.zxgr}, #{fri.zxgsj}, #{docID})")
    void addFinancialRegisterItem(@Param("fri") FinancialRegisterItemPO financialRegisterItem, @Param("docID") String docID);

    /**
     * 插入SapHead表
     * @param paymentOrderHead
     */
    @Insert("insert into FB_SAP_FM_PAYMENTORDERHEAD (ZQZSJ, YQFKSJ, YWLX, ZDJSPZT, ZBLGS, ZUUID, ZFKYHZHM, ZFKDNO, ZTXT, ZZFNAM, ZBWTXT, ZQZNAM, ZJSFS, ZSPZT, YBJE, ZTJSPRQ, ZSPRQ, PRCTR, FLG_JJFK, ZFKYHZH, KURSF, ZFLG_ZFTFZT, SKYHZH, ZKLDJE, HTH, ZFKDLX, ZFFKDNUM, DFLRZX, ZZFSJ, DFYFD, SKDW, BUKRS, ZDZBSM, SKDWHM, ZSJZFRQ, WAERS, ERDAT, SKBANKL, ZYJZFRQ, FKBANKL, ZSPH, ZZFZT, DJZT, KOSTL, FLG_BDFGSYCL, BBJE, ZBTBL, SY, ZBCZFJE, ZDR, LYXT, BDFLRZX, FLG_GX, BDFYFD, ZSYLDJE, DFGS, BDFGS, YFDH, CJRQ, HEADID) values (#{zqzsj}, #{yqfksj}, #{ywlx}, #{zdjspzt}, #{zblgs}, #{zuuid}, #{zfkyhzhm}, #{zfkdno}, #{ztxt}, #{zzfnam}, #{zbwtxt}, #{zqznam}, #{zjsfs}, #{zspzt}, #{ybje}, #{ztjsprq}, #{zsprq}, #{prctr}, #{flgJjfk}, #{zfkyhzh}, #{kursf}, #{zflgZftfzt}, #{skyhzh}, #{zkldje}, #{hth}, #{zfkdlx}, #{zffkdnum}, #{dflrzx}, #{zzfsj}, #{dfyfd}, #{skdw}, #{bukrs}, #{zdzbsm}, #{skdwhm}, #{zsjzfrq}, #{waers}, #{erdat}, #{skbankl}, #{zyjzfrq}, #{fkbankl}, #{zsph}, #{zzfzt}, #{djzt}, #{kostl}, #{flgBdfgsycl}, #{bbje}, #{zbtbl}, #{sy}, #{zbczfje}, #{zdr}, #{lyxt}, #{bdflrzx}, #{flgGx}, #{bdfyfd}, #{zsyldje}, #{dfgs}, #{bdfgs}, #{yfdh}, #{cjrq}, #{headId})")
    void savePaymentOrderHead(PaymentOrderHeadPO paymentOrderHead);

    /**
     * 插入SapItem表
     * @param paymentOrderItem
     */
    @Insert("<script>insert into FB_SAP_FM_PAYMENTORDERITEM (BBJE, SY, GZDW, ZBCZFJE, YFDHNO, HSRZBM, HKONT, YBJE, ZSZXM, ZSYLDJE, TZKXLX, ZXJLL, KURSF, WAERS, ZZJJH, ZFKDNO, YSZYDW, YFDH, XMQQ, ZKLDJE, ZFKDJHNO, FYLX, YSZYBM, HEADID) values (#{bbje}, #{sy}, #{gzdw}, #{zbczfje}, #{yfdhno}, #{hsrzbm}, #{hkont}, #{ybje}, #{zszxm}, #{zsyldje}, #{tzkxlx}, #{zxjll,jdbcType=VARCHAR}, #{kursf}, #{waers}, #{zzjjh}, #{zfkdno}, #{yszydw}, #{yfdh}, #{xmqq}, #{zkldje}, #{zfkdjhno}, #{fylx}, #{yszybm}, #{headId})</script>")
    void savePaymentOrderItem(PaymentOrderItemPO paymentOrderItem);

    /**
     * 根据传进来的表名，删除和headId对应的数据
     */
    @Select("delete from ${tabName} where HEADID = #{docID}")
    void delByHeadId(@Param("tabName") String tabName, @Param("docID") String docID);
}
