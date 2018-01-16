/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: wuhong[wu_hong@suixingpay.com] 
 * @date: 2017年9月18日 下午5:19:53   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.demo.vo;

/**  
 * 用户房产信息
 * @author: wuhong[wu_hong@suixingpay.com]
 * @date: 2017年9月18日 下午5:19:53
 * @version: V1.0
 * @review: wuhong[wu_hong@suixingpay.com]/2017年9月18日 下午5:19:53
 */
public class UsrFinHouse {
    // 房产面积
    private String  houseArea;
    // 房产所在城市
    private String  houseCity;
    // 房产地址
    private String  houseAdd;
    // 房产评估价值
    private String  houseValue;
    // 是否有房贷 00无 01有
    private String  houseLoan;
    // 房贷剩余年限
    private String  loanRemainYears;
    // 房产类型 00商业贷款;01无贷款;02租房
    private String  houseProType;
    // 房贷月供
    private String  loanForMonth;
    
    /**
     * houseArea
     * 
     * @return the houseArea
     */
    public String getHouseArea() {
        return houseArea;
    }
    /**
     * @param houseArea the houseArea to set
     */
    public void setHouseArea(String houseArea) {
        this.houseArea = houseArea;
    }
    /**
     * houseCity
     * 
     * @return the houseCity
     */
    public String getHouseCity() {
        return houseCity;
    }
    /**
     * @param houseCity the houseCity to set
     */
    public void setHouseCity(String houseCity) {
        this.houseCity = houseCity;
    }
    /**
     * houseAdd
     * 
     * @return the houseAdd
     */
    public String getHouseAdd() {
        return houseAdd;
    }
    /**
     * @param houseAdd the houseAdd to set
     */
    public void setHouseAdd(String houseAdd) {
        this.houseAdd = houseAdd;
    }
    /**
     * houseValue
     * 
     * @return the houseValue
     */
    public String getHouseValue() {
        return houseValue;
    }
    /**
     * @param houseValue the houseValue to set
     */
    public void setHouseValue(String houseValue) {
        this.houseValue = houseValue;
    }
    /**
     * houseLoan
     * 
     * @return the houseLoan
     */
    public String getHouseLoan() {
        return houseLoan;
    }
    /**
     * @param houseLoan the houseLoan to set
     */
    public void setHouseLoan(String houseLoan) {
        this.houseLoan = houseLoan;
    }
    /**
     * loanRemainYears
     * 
     * @return the loanRemainYears
     */
    public String getLoanRemainYears() {
        return loanRemainYears;
    }
    /**
     * @param loanRemainYears the loanRemainYears to set
     */
    public void setLoanRemainYears(String loanRemainYears) {
        this.loanRemainYears = loanRemainYears;
    }
    /**
     * houseProType
     * 
     * @return the houseProType
     */
    public String getHouseProType() {
        return houseProType;
    }
    /**
     * @param houseProType the houseProType to set
     */
    public void setHouseProType(String houseProType) {
        this.houseProType = houseProType;
    }
    /**
     * loanForMonth
     * 
     * @return the loanForMonth
     */
    public String getLoanForMonth() {
        return loanForMonth;
    }
    /**
     * @param loanForMonth the loanForMonth to set
     */
    public void setLoanForMonth(String loanForMonth) {
        this.loanForMonth = loanForMonth;
    }
    
}
