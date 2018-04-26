package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author LF--liufang@maxrocky.com
 * @date 2018/4/18 19:55
 * @desc 消耗附件.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fb_sap_cs_consbudgetattitem")
public class ConsBudAttItemPO {
    @Id
    private String id;

    @Column(name = "zfileid")
    private String zfileid;

    @Column(name = "filetype")
    private String filetype;

    @Column(name = "filename")
    private String filename;

    @Column(name = "fileurl")
    private String fileurl;

    @Column(name = "headid")
    private String headId;
}

