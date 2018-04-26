package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author yyg
* @date 2018/4/17 13:41
* @desc  资金划转及结汇购汇业务（结汇购汇业务)附件 实体
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FB_SAP_FM_SETTEXCHATTTITEM")
public class SettexchAtttItemPO {

    @Id
    private Long id;

    @Column(name = "HEADID")
    private String headid;

    @Column(name = "ZFILEID")
    private String zfileid;

    @Column(name = "FILETYPE")
    private String filetype;

    @Column(name = "FILENAME")
    private String filename;

    @Column(name = "FILEURL")
    private String fileurl;

    @Column(name = "PICTUREURL")
    private String pictureurl;

}
