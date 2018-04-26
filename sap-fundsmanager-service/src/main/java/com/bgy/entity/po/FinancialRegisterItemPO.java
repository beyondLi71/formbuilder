package com.bgy.entity.po;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 理财登记流程明细表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FinancialRegisterItemPO {

	//ID
	private String id;

	//单号
	private String headId;

	//公司代码
	private String bukrs;

	//登记单据编号
	private String zdjdjbh;

	//登记单据日期
	private String zdjdjrq;

	//利润中心
	private String prctr;

	//是否期初
	private String zshqc;

	//交易类型编码
	private String zjylxbm;

	//交易类型名称
	private String zjylxmc;

	//单据状态
	private String zdjzt;

	//理财产品类型
	private String zlccplx;

	//投资项目
	private String ztzxm;

	//基金公司
	private String zjjgs;

	//境内/境外
	private String zjnjw;

	//发行机构
	private String zfxjg;

	//付款银行账号
	private String bankn;

	//付款银行户名
	private String name1_text;

	//付款银行全称
	private String banka;

	//集团/区域
	private String zjtqy;

	//所属板块
	private String zssbk;

	//资金是否需要转第三方账户
	private String zshdsf;

	//支付方式
	private String zzffs;

	//收款银行账户
	private String zbankn2;

	//收款银行户名
	private String zname1_text2;

	//收款银行全称
	private String zbanka2;

	//购买原因
	private String zgmyy;

	//理财附件
	private String zlcfj;

	//产品代码
	private String zcpdm;

	//产品名称
	private String zcpmc;

	//是否保本
	private String zshbb;

	//是否有承诺函
	private String zshyclh;

	//金额
	private String zje;

	//币种
	private String waers;

	//汇率
	private String kursf;

	//本位币金额
	private String zbwbje;

	//计息基础（360/365)
	private String zjxjc;

	//起息日
	private String zqxr;

	//预期到期日
	private String zyqdqr;

	//预期期限（天）
	private String zyqqx;

	//预期年化收益率（%）
	private String zyqnhl;

	//预期收益
	private String zyqsy;

	//预期收益（手工）
	private String zyqsy2;

	//赎回金额
	private String zshje;

	//本金收支项目
	private String zbjszxm;

	//本金计划项目
	private String zbjjhxm;

	//本金现金流量项目
	private String zbjxjll;

	//预期日收益
	private String zyqrsy;

	//原因
	private String zyy;

	//可行性分析
	private String zkxxfx;

	//备注
	private String zbz;

	//会计凭证号
	private String belnr;

	//会计年度
	private String gjahr;

	//结算单单据号
	private String zjsddh;

	//撤单原因
	private String zcdyy;

	//制单人
	private String zzdr;

	//制单时间
	private String zzdsj;

	//审批人
	private String zspr;

	//审批时间
	private String zspsj;

	//修改人
	private String zxgr;

	//修改时间
	private String zxgsj;
}
