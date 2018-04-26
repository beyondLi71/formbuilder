package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * 资金划转业务 附件明细表实体VO
 * @by linlangleo
 * @date 2018/4/18 10:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundTransAttItemVO {
  private Long id;
  private String headId;
  private String zfileid;
  private String filetype;
  private String filename;
  private String fileurl;
  private String pictureurl;
}
