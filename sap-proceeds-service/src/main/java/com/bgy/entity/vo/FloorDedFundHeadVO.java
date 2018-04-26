package com.bgy.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Ren ZhiQiang--one_thing_today@163.com
 * @date 2018/4/24 14:59
 * @desc 售楼抵楼款应收传输接口 主表 VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FloorDedFundHeadVO {
    //private String id;
    //private String headid;
    private String zdjh;
    private String ernam;
    private String zshr;
    private String zdjrq;
    private String zdjzt;
    private String zshrq;
    private String prctr;
    private String zprctr;
    private String bukrs;
    private String zskdh;
    private String zdjlx;
    private String budat;
    private String belnr;
    private String bktxt;
    private String erdat;
    private String zspzt;
    private String zpzzt;
    private String zdlklx;
    //private String create_by;
    //private String update_by;
    //private java.sql.Date create_time;
    //private java.sql.Date update_time;
    //private String remark;
    private List<FloorDedFundItemVO> item;
    private List<AttItemVO> attItem;
}
