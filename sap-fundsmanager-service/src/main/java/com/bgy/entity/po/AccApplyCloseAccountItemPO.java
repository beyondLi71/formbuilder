package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yyg
 * @date 2018/4/18 17:20
 * @desc TR-TR034_3-账户销户 附件实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FB_SAP_FM_ACCCLOSEACCOUNTITEM")
public class AccApplyCloseAccountItemPO {

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

