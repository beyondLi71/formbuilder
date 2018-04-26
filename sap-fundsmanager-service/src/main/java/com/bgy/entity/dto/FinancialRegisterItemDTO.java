package com.bgy.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 理财登记流程明细表
 * @by linlangleo
 */
@Data
@ApiModel(value = "理财登记流程明细表实体")
@AllArgsConstructor
@NoArgsConstructor
public class FinancialRegisterItemDTO {
	//ID
//	private String id;
	//单号
//	private String headId;

	//公司代码
	@JsonProperty("BUKRS")
	@ApiModelProperty(value = "公司代码", example = "98K")
	private String bukrs;

	//登记单据编号
	@JsonProperty("ZDJDJBH")
	private String zdjdjbh;

	//登记单据日期
	@JsonProperty("ZDJDJRQ")
	private String zdjdjrq;

	//利润中心
	@JsonProperty("PRCTR")
	private String prctr;

	//是否期初
	@JsonProperty("ZSHQC")
	private String zshqc;

	//交易类型编码
	@JsonProperty("ZJYLXBM")
	private String zjylxbm;

	//交易类型名称
	@JsonProperty("ZJYLXMC")
	private String zjylxmc;

	//单据状态
	@JsonProperty("ZDJZT")
	private String zdjzt;

	//理财产品类型
	@JsonProperty("ZLCCPLX")
	private String zlccplx;

	//投资项目
	@JsonProperty("ZTZXM")
	private String ztzxm;

	//基金公司
	@JsonProperty("ZJJGS")
	private String zjjgs;

	//境内/境外
	@JsonProperty("ZJNJW")
	private String zjnjw;

	//发行机构
	@JsonProperty("ZFXJG")
	private String zfxjg;

	//付款银行账号
	@JsonProperty("BANKN")
	private String bankn;

	//付款银行户名
	@JsonProperty("NAME1_TEXT")
	private String name1_text;

	//付款银行全称
	@JsonProperty("BANKA")
	private String banka;

	//集团/区域
	@JsonProperty("ZJTQY")
	private String zjtqy;

	//所属板块
	@JsonProperty("ZSSBK")
	private String zssbk;

	//资金是否需要转第三方账户
	@JsonProperty("ZSHDSF")
	private String zshdsf;

	//支付方式
	@JsonProperty("ZZFFS")
	private String zzffs;

	//收款银行账户
	@JsonProperty("ZBANKN2")
	private String zbankn2;

	//收款银行户名
	@JsonProperty("ZNAME1_TEXT2")
	private String zname1_text2;

	//收款银行全称
	@JsonProperty("ZBANKA2")
	private String zbanka2;

	//购买原因
	@JsonProperty("ZGMYY")
	private String zgmyy;

	//理财附件
	@JsonProperty("ZLCFJ")
	private String zlcfj;

	//产品代码
	@JsonProperty("ZCPDM")
	private String zcpdm;

	//产品名称
	@JsonProperty("ZCPMC")
	private String zcpmc;

	//是否保本
	@JsonProperty("ZSHBB")
	private String zshbb;

	//是否有承诺函
	@JsonProperty("ZSHYCLH")
	private String zshyclh;

	//金额
	@JsonProperty("ZJE")
	private String zje;

	//币种
	@JsonProperty("WAERS")
	private String waers;

	//汇率
	@JsonProperty("KURSF")
	private String kursf;

	//本位币金额
	@JsonProperty("ZBWBJE")
	private String zbwbje;

	//计息基础（360/365)
	@JsonProperty("ZJXJC")
	private String zjxjc;

	//起息日
	@JsonProperty("ZQXR")
	private String zqxr;

	//预期到期日
	@JsonProperty("ZYQDQR")
	private String zyqdqr;

	//预期期限（天）
	@JsonProperty("ZYQQX")
	private String zyqqx;

	//预期年化收益率（%）
	@JsonProperty("ZYQNHL")
	private String zyqnhl;

	//预期收益
	@JsonProperty("ZYQSY")
	private String zyqsy;

	//预期收益（手工）
	@JsonProperty("ZYQSY2")
	private String zyqsy2;

	//赎回金额
	@JsonProperty("ZSHJE")
	private String zshje;

	//本金收支项目
	@JsonProperty("ZBJSZXM")
	private String zbjszxm;

	//本金计划项目
	@JsonProperty("ZBJJHXM")
	private String zbjjhxm;

	//本金现金流量项目
	@JsonProperty("ZBJXJLL")
	private String zbjxjll;

	//预期日收益
	@JsonProperty("ZYQRSY")
	private String zyqrsy;

	//原因
	@JsonProperty("ZYY")
	private String zyy;

	//可行性分析
	@JsonProperty("ZKXXFX")
	private String zkxxfx;

	//备注
	@JsonProperty("ZBZ")
	private String zbz;

	//会计凭证号
	@JsonProperty("BELNR")
	private String belnr;

	//会计年度
	@JsonProperty("GJAHR")
	private String gjahr;

	//结算单单据号
	@JsonProperty("ZJSDDH")
	private String zjsddh;

	//撤单原因
	@JsonProperty("ZCDYY")
	private String zcdyy;

	//制单人
	@JsonProperty("ZZDR")
	private String zzdr;

	//制单时间
	@JsonProperty("ZZDSJ")
	private String zzdsj;

	//审批人
	@JsonProperty("ZSPR")
	private String zspr;

	//审批时间
	@JsonProperty("ZSPSJ")
	private String zspsj;

	//修改人
	@JsonProperty("ZXGR")
	private String zxgr;

	//修改时间
	@JsonProperty("ZXGSJ")
	private String zxgsj;
}
