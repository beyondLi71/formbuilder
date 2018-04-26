package com.bgy.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @desc 还本付息付中收 主表实体VO
 * @author linlangleo
 * @date 2018-04-18 17:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RepayOfPAIHeadVO {
  private Long id;
  private String headId;
  private String bukrs;
  private String zdjbh;
  private String zdjlx;
  private String zdjlx_ms;
  private String prctr;
  private String prctr_ms;
  private String kostl;
  private String kostl_ms;
  private String zshzk_ms;
  private String zlcbt;
  private String zjfdate;
  private String waers;
  private String kursf;
  private String zzbsczfq_ms;
  private String zxyxqxy_ms;
  private String zsh9xqy;
  private String zsh9xqy_ms;
  private String zshdrjh;
  private String zshdrjh_ms;
  private String zshxyqd;
  private String zshxyqd_ms;
  private String zshynn;
  private String zshynn_ms;
  private String zyljzfje;
  private String zljzfjzrq;
  private String zbczje1;
  private String zbczje2;
  private String acc_num;
  private String beneficial;
  private String bankl;
  private String description;
  private String partner_ms;
  private String zbankn;
  private String zkoinh;
  private String zbankl;
  private String zbanka;
  private String gsber_ms;
  private String zssqy_ms;
  private String zrzfb_ms;
  private String zxgsm;
  private String zfkdno;
  private String zzkdno;
  private String zjszt_ms;
  private String zspzt_ms;
  private String zdjzt_ms;
  private String zcredate;
  private String zcreby;
  private String tel_number;
  private List<RepayOfPAIItemVO> repayOfPAIItem;
  private List<AttItemVO> repayOfPAIAttItem;
}
