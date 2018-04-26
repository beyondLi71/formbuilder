package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yyg
 * @date 2018/4/18 12:00
 * @desc 一般预算调整附件实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fb_sap_cs_gudgetfileitem")
public class  BudgetFileItemPO {

    @Id
    private Long id;

    @Column(name="headid")
    private String headid;

    @Column(name="zfileid")
    private String zfileid;

    @Column(name="filetype")
    private String filetype;

    @Column(name="filename")
    private String filename;

    @Column(name="fileurl")
    private String fileurl;

    @Column(name="pictureurl")
    private String pictureurl;

}