package com.demo.vo;

/**
 * Description: 回款订单表 Po
 * Copyright: ©2017 suixingpay. All rights reserved.
 * @author wu_hong@suixingpay.com
 * Created on: 2017-08-18 11:50:36
 */
public class OrderItem {
	// 回款编号
	private	String	astRepayOno;
	// 渠道订单编号
	private	String	astOno;
	// 实际回款金额
	private	String	realAmt;
	// 扣款账号
	private	String	actNo;
	// 扣款户名
	private	String	actNm;
	// 扣款银行
	private	String	bnkNm;
	// 扣款联行行号
	private	String	lbnkNo;
	// 支行信息
	private	String	lbnkNm;
	// 扣款身份证号
	private	String	idCardNo;
	// 扣款手机号
	private	String	phoneNo;
	

	/**
     * 回款编号
     * 
     * @return the astRepayOno
     */
    public String getAstRepayOno() {
        return astRepayOno;
    }
    /**
     * @param astRepayOno the astRepayOno to set
     */
    public void setAstRepayOno(String astRepayOno) {
        this.astRepayOno = astRepayOno;
    }
    /**
     * 渠道订单编号
     * 
     * @return the astOno
     */
    public String getAstOno() {
        return astOno;
    }
    /**
     * @param astOno the astOno to set
     */
    public void setAstOno(String astOno) {
        this.astOno = astOno;
    }
    public void setRealAmt(String realAmt) {
		this.realAmt = realAmt;
	}
	/**
	 * 实际回款金额
	 * @return
	 */
	public String getRealAmt() {
		return realAmt;
	}

	public void setActNo(String actNo) {
		this.actNo = actNo;
	}
	/**
	 * 扣款账号
	 * @return
	 */
	public String getActNo() {
		return actNo;
	}

	public void setActNm(String actNm) {
		this.actNm = actNm;
	}
	/**
	 * 扣款户名
	 * @return
	 */
	public String getActNm() {
		return actNm;
	}

	public void setBnkNm(String bnkNm) {
		this.bnkNm = bnkNm;
	}
	/**
	 * 扣款银行
	 * @return
	 */
	public String getBnkNm() {
		return bnkNm;
	}

	public void setLbnkNo(String lbnkNo) {
		this.lbnkNo = lbnkNo;
	}
	/**
	 * 扣款联行行号
	 * @return
	 */
	public String getLbnkNo() {
		return lbnkNo;
	}

	public void setLbnkNm(String lbnkNm) {
		this.lbnkNm = lbnkNm;
	}
	/**
	 * 支行信息
	 * @return
	 */
	public String getLbnkNm() {
		return lbnkNm;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	/**
	 * 扣款身份证号
	 * @return
	 */
	public String getIdCardNo() {
		return idCardNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * 扣款手机号
	 * @return
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

}