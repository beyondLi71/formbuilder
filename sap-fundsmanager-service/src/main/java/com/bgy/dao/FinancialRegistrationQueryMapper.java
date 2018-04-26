package com.bgy.dao;

import com.bgy.entity.po.PaymentOrderHeadPO;
import com.bgy.entity.po.FinancialRegisterItemPO;
import com.bgy.entity.po.PaymentOrderItemPO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 理财登记流程的查询Mapper
 * @by linlangleo
 */
public interface FinancialRegistrationQueryMapper {
    /**
     * 查询SapHeadInfo
     * @return
     */
    @Select("select ZQZSJ as zqzsj, YQFKSJ as yqfksj, YWLX as ywlx, ZDJSPZT as zdjspzt, ZBLGS as zblgs, ZUUID as zuuid, ZFKYHZHM as zfkyhzhm, ZFKDNO as zfkdno, ZTXT as ztxt, ZZFNAM as zzfnam, ZBWTXT as zbwtxt, ZQZNAM as zqznam, ZJSFS as zjsfs, ZSPZT as zspzt, YBJE as ybje, ZTJSPRQ as ztjsprq, ZSPRQ as zsprq, PRCTR as prctr, FLG_JJFK as flgJjfk, ZFKYHZH as zfkyhzh, KURSF as kursf, ZFLG_ZFTFZT as zflgZftfzt, SKYHZH as skyhzh, ZKLDJE as zkldje, HTH as hth, ZFKDLX as zfkdlx, ZFFKDNUM as zffkdnum, DFLRZX as dflrzx, ZZFSJ as zzfsj, DFYFD as dfyfd, SKDW as skdw, BUKRS as bukrs, ZDZBSM as zdzbsm, SKDWHM as skdwhm, ZSJZFRQ as zsjzfrq, WAERS as waers, ERDAT as erdat, SKBANKL as skbankl, ZYJZFRQ as zyjzfrq, FKBANKL as fkbankl, ZSPH as zsph, ZZFZT as zzfzt, DJZT as djzt, KOSTL as kostl, FLG_BDFGSYCL as flgBdfgsycl, BBJE as bbje, ZBTBL as zbtbl, SY as sy, ZBCZFJE as zbczfje, ZDR as zdr, LYXT as lyxt, BDFLRZX as bdflrzx, FLG_GX as flgGx, BDFYFD as bdfyfd, ZSYLDJE as zsyldje, DFGS as dfgs, BDFGS as bdfgs, YFDH as yfdh, CJRQ as cjrq, HEADID as headId from FB_SAP_FM_PAYMENTORDERHEAD where HEADID = #{value}")
    PaymentOrderHeadPO getPaymentOrderHeadInfo(String docId);

    /**
     * 理财登记流程的查询Mapper
     *  数据库的 HEADID 对应 单号docID
     */
    @Select("select * from FB_SAP_FM_FINANCIALREGISTITEM where HEADID = #{docID}")
    List<FinancialRegisterItemPO> getFinancialRegistetItem(@Param("docID") String docID);

    /**
     * 根据headId查询
     * @param headId
     * @return
     */
    @Select("select BBJE as bbje, SY as sy, GZDW as gzdw, ZBCZFJE as zbczfje, YFDHNO as yfdhno, HSRZBM as hsrzbm, HKONT as hkont, YBJE as ybje, ZSZXM as zszxm, ZSYLDJE as zsyldje, TZKXLX as tzkxlx, ZXJLL as zxjll, KURSF as kursf, WAERS as waers, ZZJJH as zzjjh, ZFKDNO as zfkdno, YSZYDW as yszydw, YFDH as yfdh, XMQQ as xmqq, ZKLDJE as zkldje, ZFKDJHNO as zfkdjhno, FYLX as fylx, YSZYBM as yszybm, HEADID as headid, HEADID as headId from FB_SAP_FM_PAYMENTORDERITEM where HEADID = #{value}")
    List<PaymentOrderItemPO> getPaymentOrderItemByHeadId(String headId);

    /**
     * 根据传进来的表名，动态查询 headId匹配的数目
     */
    @Select("select COUNT(*) from ${tabName} where HEADID = #{docID}")
    int getCountByHeadId(@Param("tabName") String tabName, @Param("headId") String headId);
}
