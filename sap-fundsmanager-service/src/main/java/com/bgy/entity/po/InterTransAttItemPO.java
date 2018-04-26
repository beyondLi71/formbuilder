package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @desc TR058 附件明细表实体PO
 * @author linlangleo
 * @date 2018-04-19 17:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_FM_INTERTRANSATTITEM")
public class InterTransAttItemPO {
  @Id
  private String id;

  @Column(name = "HEADID")
  private String headId;

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
