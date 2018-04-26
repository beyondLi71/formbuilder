package com.bgy.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 资金划转业务 附件明细表实体PO
 * @by linlangleo
 * @date 2018/4/18 10:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FB_SAP_FM_FUNDTRANSATTITEM")
public class FundTransAttItemPO {
  @Id
  private Long id;

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
