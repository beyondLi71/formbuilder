package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @desc TR058 附件明细表实体VO
 * @author linlangleo
 * @date 2018-04-19 17:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterTransAttItemVO {
  private String id;

  private String headId;

  private String zfileid;

  private String filetype;

  private String filename;

  private String fileurl;

  private String pictureurl;
}
