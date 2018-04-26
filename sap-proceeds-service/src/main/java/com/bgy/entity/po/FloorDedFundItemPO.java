package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/24 15:29
 * @desc 售楼抵楼款应收传输接口 明细表VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fb_sap_ar_floordedfunditem")
public class FloorDedFundItemPO {

    @Id
    private Long id;

    @Column(name = "headid")
    private String headId;

    @Column(name = "zskdh")
    private String zskdh;

    @Column(name = "zhxh")
    private String zhxh;

    @Column(name = "zfjdm")
    private String zfjdm;

    @Column(name = "dmbtr")
    private String dmbtr;

    @Column(name = "zbhsj")
    private String zbhsj;

    @Column(name = "zyfdh")
    private String zyfdh;

    @Column(name = "buzei")
    private String buzei;

    @Column(name = "kunnr")
    private String kunnr;

    @Column(name = "zkxmx")
    private String zkxmx;

    @Column(name = "mwskz")
    private String mwskz;

    @Column(name = "bukrs")
    private String bukrs;

    @Column(name = "zxm")
    private String zxm;

    @Column(name = "zhdjh")
    private String zhdjh;

    @Column(name = "zcplx")
    private String zcplx;

    @Column(name = "zse")
    private String zse;

    @Column(name = "zhxzt")
    private String zhxzt;

    @Column(name = "sgtxt")
    private String sgtxt;

    @Column(name = "zhxmzt")
    private String zhxmzt;

    @Column(name = "zxmdm")
    private String zxmdm;

    @Column(name = "create_by")
    private String create_by;

    @Column(name = "update_by")
    private String update_by;

    @Column(name = "create_time")
    private LocalDateTime create_time;

    @Column(name = "update_time")
    private LocalDateTime update_time;

    @Column(name = "remark")
    private String remark;
}
