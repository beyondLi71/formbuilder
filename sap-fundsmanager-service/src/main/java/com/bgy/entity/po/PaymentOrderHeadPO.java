package com.bgy.entity.po;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by beyondLi
 * Date 2018/4/12 10:58
 * Desc .
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentOrderHeadPO {
    public String zqzsj;
    public String yqfksj;
    public String ywlx;
    public String zdjspzt;
    public String zblgs;
    public String zuuid;
    public String zfkyhzhm;
    public String zfkdno;
    public String ztxt;
    public String zzfnam;
    public String zbwtxt;
    public String zqznam;
    public String zjsfs;
    public String zspzt;
    public String ybje;
    public String ztjsprq;
    public String zsprq;
    public String prctr;
    public String flgJjfk;
    public String zfkyhzh;
    public String kursf;
    public String zflgZftfzt;
    public String skyhzh;
    public String zkldje;
    public String hth;
    public String zfkdlx;
    public String zffkdnum;
    public String dflrzx;
    public String zzfsj;
    public String dfyfd;
    public String skdw;
    public String bukrs;
    public String zdzbsm;
    public String skdwhm;
    public String zsjzfrq;
    public String waers;
    public String erdat;
    public String skbankl;
    public String zyjzfrq;
    public String fkbankl;
    public String zsph;
    public String zzfzt;
    public String djzt;
    public String kostl;
    public String flgBdfgsycl;
    public String bbje;
    public String zbtbl;
    public String sy;
    public String zbczfje;
    public String zdr;
    public String lyxt;
    public String bdflrzx;
    public String flgGx;
    public String bdfyfd;
    public String zsyldje;
    public String dfgs;
    public String bdfgs;
    public String yfdh;
    public String cjrq;
    public String headId;
    public List<PaymentOrderItemPO> paymentOrderItem;
}
