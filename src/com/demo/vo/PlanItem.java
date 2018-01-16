package com.demo.vo;

/**  
 * 回款计划数据
 * @author: wuhong[wu_hong@suixingpay.com]
 * @date: 2017年9月18日 下午2:03:00
 * @version: V1.0
 * @review: wuhong[wu_hong@suixingpay.com]/2017年9月18日 下午2:03:00
 */
public class PlanItem{
	// 回款编号,用作回款数据的唯一标识
	private String astRepayOno;
	// 应回款本金
	private	String	repayCapAmt;
	// 应回款利息
	private	String	repayIns;
	// 应回款金额,回款金额=回款本金+回款利息
	private	String	repayAmt;
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
	// 扣款方式,00小贷平台代扣；01主动还款
    private String  repayMod;
	// 协议还款日期
	private	String	argRepayDt;
    /**
     * astRepayOno
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
     * repayCapAmt
     * 
     * @return the repayCapAmt
     */
    public String getRepayCapAmt() {
        return repayCapAmt;
    }
    /**
     * @param repayCapAmt the repayCapAmt to set
     */
    public void setRepayCapAmt(String repayCapAmt) {
        this.repayCapAmt = repayCapAmt;
    }
    /**
     * repayIns
     * 
     * @return the repayIns
     */
    public String getRepayIns() {
        return repayIns;
    }
    /**
     * @param repayIns the repayIns to set
     */
    public void setRepayIns(String repayIns) {
        this.repayIns = repayIns;
    }
    /**
     * repayAmt
     * 
     * @return the repayAmt
     */
    public String getRepayAmt() {
        return repayAmt;
    }
    /**
     * @param repayAmt the repayAmt to set
     */
    public void setRepayAmt(String repayAmt) {
        this.repayAmt = repayAmt;
    }
    /**
     * actNo
     * 
     * @return the actNo
     */
    public String getActNo() {
        return actNo;
    }
    /**
     * @param actNo the actNo to set
     */
    public void setActNo(String actNo) {
        this.actNo = actNo;
    }
    /**
     * actNm
     * 
     * @return the actNm
     */
    public String getActNm() {
        return actNm;
    }
    /**
     * @param actNm the actNm to set
     */
    public void setActNm(String actNm) {
        this.actNm = actNm;
    }
    /**
     * bnkNm
     * 
     * @return the bnkNm
     */
    public String getBnkNm() {
        return bnkNm;
    }
    /**
     * @param bnkNm the bnkNm to set
     */
    public void setBnkNm(String bnkNm) {
        this.bnkNm = bnkNm;
    }
    /**
     * lbnkNo
     * 
     * @return the lbnkNo
     */
    public String getLbnkNo() {
        return lbnkNo;
    }
    /**
     * @param lbnkNo the lbnkNo to set
     */
    public void setLbnkNo(String lbnkNo) {
        this.lbnkNo = lbnkNo;
    }
    /**
     * lbnkNm
     * 
     * @return the lbnkNm
     */
    public String getLbnkNm() {
        return lbnkNm;
    }
    /**
     * @param lbnkNm the lbnkNm to set
     */
    public void setLbnkNm(String lbnkNm) {
        this.lbnkNm = lbnkNm;
    }
    /**
     * idCardNo
     * 
     * @return the idCardNo
     */
    public String getIdCardNo() {
        return idCardNo;
    }
    /**
     * @param idCardNo the idCardNo to set
     */
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }
    /**
     * phoneNo
     * 
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }
    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    /**
     * repayMod
     * 
     * @return the repayMod
     */
    public String getRepayMod() {
        return repayMod;
    }
    /**
     * @param repayMod the repayMod to set
     */
    public void setRepayMod(String repayMod) {
        this.repayMod = repayMod;
    }
    /**
     * argRepayDt
     * 
     * @return the argRepayDt
     */
    public String getArgRepayDt() {
        return argRepayDt;
    }
    /**
     * @param argRepayDt the argRepayDt to set
     */
    public void setArgRepayDt(String argRepayDt) {
        this.argRepayDt = argRepayDt;
    }
    /**      
     * 
     * @return
     * @see java.lang.Object#toString()
     */ 
    @Override
    public String toString() {
        return "PlanItem [astRepayOno=" + astRepayOno + ", repayCapAmt=" + repayCapAmt + ", repayIns=" + repayIns
                + ", repayAmt=" + repayAmt + ", actNo=" + actNo + ", actNm=" + actNm + ", bnkNm=" + bnkNm + ", lbnkNo="
                + lbnkNo + ", lbnkNm=" + lbnkNm + ", idCardNo=" + idCardNo + ", phoneNo=" + phoneNo + ", repayMod="
                + repayMod + ", argRepayDt=" + argRepayDt + "]";
    }
	
}