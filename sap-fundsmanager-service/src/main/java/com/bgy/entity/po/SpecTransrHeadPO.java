package com.bgy.entity.po;

import com.bgy.entity.vo.AttItemVO;
import com.bgy.entity.vo.SpecTransrItemVO;
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
 * @date 2018/4/23 17:06
 * @desc TR-096特转单审批表实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fb_sap_fm_spectransrhead")
public class SpecTransrHeadPO {

    @Id
    private Long id;

    @Column(name = "headid")
    private String headId;

    @Column(name = "zdjbh")
    private String zdjbh;

    @Column(name = "zcom")
    private String zcom;

    @Column(name = "butxt")
    private String butxt;

    @Column(name = "zpc")
    private String zpc;

    @Column(name = "ktext")
    private String ktext;

    @Column(name = "zddfx")
    private String zddfx;

    @Column(name = "zddfxn")
    private String zddfxn;

    @Column(name = "zdjlx")
    private String zdjlx;

    @Column(name = "zddlyn")
    private String zddlyn;

    @Column(name = "erdat")
    private String erdat;

    @Column(name = "ernam")
    private String ernam;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Column(name = "remark")
    private String remark;

    @Transient
    private List<SpecTransrItemPO> item;

    @Transient
    private List<AttItemPO> attItem;
}
