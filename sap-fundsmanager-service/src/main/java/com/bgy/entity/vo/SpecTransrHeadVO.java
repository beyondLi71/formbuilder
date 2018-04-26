package com.bgy.entity.vo;

import com.bgy.entity.po.AttItemPO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/23 19:59
 * @desc TR-096特转单审批表实体vo
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpecTransrHeadVO {
    //private Long id;

    //private String headid;

    private String zdjbh;

    private String zcom;

    private String butxt;

    private String zpc;

    private String ktext;

    private String zddfx;

    private String zddfxn;

    private String zdjlx;

    private String zddlyn;

    private String erdat;

    private String ernam;

    //private String createBy;

    //private String updateBy;

    //private LocalDateTime createTime;

    //private LocalDateTime updateTime;

    //private String remark;

    private List<SpecTransrItemVO> item;

    private List<AttItemVO> attItem;

}
