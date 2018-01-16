/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: wuhong[wu_hong@suixingpay.com] 
 * @date: 2017年9月18日 下午8:23:48   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.demo.vo;

/**  
 * 放款订单请求项
 * @author: wuhong[wu_hong@suixingpay.com]
 * @date: 2017年9月18日 下午8:23:48
 * @version: V1.0
 * @review: wuhong[wu_hong@suixingpay.com]/2017年9月18日 下午8:23:48
 */
public class LoanItem {
    //渠道订单号
    private String astOno;
    //收款人账户
    private String actNo;
    //收款人姓名
    private String actNm;
    //账号类型
    private String actTyp;
    //用户证件号
    private String cardNo;
    //扣款身份证
    private String idCardNo;
    //扣款手机号
    private String phoneNo;
    //联行行号
    private String lbnkNo;
    //支行信息
    private String lbnkNm;
    //行别编码
    private String bnkCd;
    //开户行省
    private String proNm;
    //开户行市
    private String cityNm;
    //放款金额
    private String loanAmt;
    //放款利率
    private String loanRate;
    //回款利息
    private String repayInt;
    //回款期数
    private String payNo;
    //还款周期
    private String repayPer;
    //还款类型
    private String repayTyp;
    //还款方式
    private String repayMod;
    //计息方式
	private String intTyp;
    //协议放款日期
    private String argLoanDt;
    //贷款终止日期
    private String argRepayDt;
    //通知地址
    private String noticeUrl;
    //备注
    private String rmk;
    //用户姓名
    private String usrNm;
    /**
     * astOno
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
     * actTyp
     * 
     * @return the actTyp
     */
    public String getActTyp() {
        return actTyp;
    }
    /**
     * @param actTyp the actTyp to set
     */
    public void setActTyp(String actTyp) {
        this.actTyp = actTyp;
    }
    /**
     * cardNo
     * 
     * @return the cardNo
     */
    public String getCardNo() {
        return cardNo;
    }
    /**
     * @param cardNo the cardNo to set
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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
     * bnkCd
     * 
     * @return the bnkCd
     */
    public String getBnkCd() {
        return bnkCd;
    }
    /**
     * @param bnkCd the bnkCd to set
     */
    public void setBnkCd(String bnkCd) {
        this.bnkCd = bnkCd;
    }
    /**
     * proNm
     * 
     * @return the proNm
     */
    public String getProNm() {
        return proNm;
    }
    /**
     * @param proNm the proNm to set
     */
    public void setProNm(String proNm) {
        this.proNm = proNm;
    }
    /**
     * cityNm
     * 
     * @return the cityNm
     */
    public String getCityNm() {
        return cityNm;
    }
    /**
     * @param cityNm the cityNm to set
     */
    public void setCityNm(String cityNm) {
        this.cityNm = cityNm;
    }
    /**
     * loanAmt
     * 
     * @return the loanAmt
     */
    public String getLoanAmt() {
        return loanAmt;
    }
    /**
     * @param loanAmt the loanAmt to set
     */
    public void setLoanAmt(String loanAmt) {
        this.loanAmt = loanAmt;
    }
    /**
     * loanRate
     * 
     * @return the loanRate
     */
    public String getLoanRate() {
        return loanRate;
    }
    /**
     * @param loanRate the loanRate to set
     */
    public void setLoanRate(String loanRate) {
        this.loanRate = loanRate;
    }
    /**
     * repayInt
     * 
     * @return the repayInt
     */
    public String getRepayInt() {
        return repayInt;
    }
    /**
     * @param repayInt the repayInt to set
     */
    public void setRepayInt(String repayInt) {
        this.repayInt = repayInt;
    }
    /**
     * payNo
     * 
     * @return the payNo
     */
    public String getPayNo() {
        return payNo;
    }
    /**
     * @param payNo the payNo to set
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
    /**
     * repayPer
     * 
     * @return the repayPer
     */
    public String getRepayPer() {
        return repayPer;
    }
    /**
     * @param repayPer the repayPer to set
     */
    public void setRepayPer(String repayPer) {
        this.repayPer = repayPer;
    }
    /**
     * repayTyp
     * 
     * @return the repayTyp
     */
    public String getRepayTyp() {
        return repayTyp;
    }
    /**
     * @param repayTyp the repayTyp to set
     */
    public void setRepayTyp(String repayTyp) {
        this.repayTyp = repayTyp;
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
     * argLoanDt
     * 
     * @return the argLoanDt
     */
    public String getArgLoanDt() {
        return argLoanDt;
    }
    /**
     * @param argLoanDt the argLoanDt to set
     */
    public void setArgLoanDt(String argLoanDt) {
        this.argLoanDt = argLoanDt;
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
     * noticeUrl
     * 
     * @return the noticeUrl
     */
    public String getNoticeUrl() {
        return noticeUrl;
    }
    /**
     * @param noticeUrl the noticeUrl to set
     */
    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl;
    }
    /**
     * rmk
     * 
     * @return the rmk
     */
    public String getRmk() {
        return rmk;
    }
    /**
     * @param rmk the rmk to set
     */
    public void setRmk(String rmk) {
        this.rmk = rmk;
    }
    /**
     * usrNm
     * 
     * @return the usrNm
     */
    public String getUsrNm() {
        return usrNm;
    }
    /**
     * @param usrNm the usrNm to set
     */
    public void setUsrNm(String usrNm) {
        this.usrNm = usrNm;
    }
	/**
	 * @return 
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param 
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @return 
	 */
	public String getIdCardNo() {
		return idCardNo;
	}
	/**
	 * @param 
	 */
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	/**
	 * @return 
	 */
	public String getIntTyp() {
		return intTyp;
	}
	/**
	 * @param 
	 */
	public void setIntTyp(String intTyp) {
		this.intTyp = intTyp;
	}
    
}
