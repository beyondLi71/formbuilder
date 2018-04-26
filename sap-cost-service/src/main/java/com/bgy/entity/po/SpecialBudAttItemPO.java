package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 10:12
 * @desc 预算附件.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_CS_SPECIALBUDATTITEM")
public class SpecialBudAttItemPO {

    @Id
    private String id;

    @Column(name = "ZFILEID")
    private String zfileid;

    @Column(name = "FILETYPE")
    private String filetype;

    @Column(name = "FILENAME")
    private String filename;

    @Column(name = "FILEURL")
    private String fileurl;

    @Column(name = "HEADID")
    private String headId;
}

