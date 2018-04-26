package com.bgy.entity.po;

import com.bgy.entity.vo.AttItemVO;
import com.bgy.entity.vo.FloorDedFundItemVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/24 15:10
 * @desc 售楼抵楼款应收传输接口 主表 PO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fb_sap_ar_floordedfundhead")
public class FloorDedFundHeadPO {

    @Id
    private Long id;

    @Column(name = "headid")
    private String headId;

    @Column(name = "zdjh")
    private String zdjh;

    @Column(name = "ernam")
    private String ernam;

    @Column(name = "zshr")
    private String zshr;

    @Column(name = "zdjrq")
    private String zdjrq;

    @Column(name = "zdjzt")
    private String zdjzt;

    @Column(name = "zshrq")
    private String zshrq;

    @Column(name = "prctr")
    private String prctr;

    @Column(name = "zprctr")
    private String zprctr;

    @Column(name = "bukrs")
    private String bukrs;

    @Column(name = "zskdh")
    private String zskdh;

    @Column(name = "zdjlx")
    private String zdjlx;

    @Column(name = "budat")
    private String budat;

    @Column(name = "belnr")
    private String belnr;

    @Column(name = "bktxt")
    private String bktxt;

    @Column(name = "erdat")
    private String erdat;

    @Column(name = "zspzt")
    private String zspzt;

    @Column(name = "zpzzt")
    private String zpzzt;

    @Column(name = "zdlklx")
    private String zdlklx;

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

    @Transient
    private List<FloorDedFundItemPO> item;
    @Transient
    private List<AttItemPO> attItem;
}
