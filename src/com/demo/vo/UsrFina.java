/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: wuhong[wu_hong@suixingpay.com] 
 * @date: 2017年9月18日 下午5:31:11   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.demo.vo;

/**  
 * 资产信息
 * @author: wuhong[wu_hong@suixingpay.com]
 * @date: 2017年9月18日 下午5:31:11
 * @version: V1.0
 * @review: wuhong[wu_hong@suixingpay.com]/2017年9月18日 下午5:31:11
 */
public class UsrFina {
    // 名下房产数量
    private String  houseNum;
    // 是否有私家车
    private String  carHold;
    // 是否有公积金
    private String  accFund;
    // 是否有社保
    private String  sociSec;
    // 私家车评估价格
    private String  carValue;
    // 家庭平均工资月收入
    private String  familyAvgWage;
    // 月其他收入
    private String  otherIncome;
    /**
     * houseNum
     * 
     * @return the houseNum
     */
    public String getHouseNum() {
        return houseNum;
    }
    /**
     * @param houseNum the houseNum to set
     */
    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }
    /**
     * carHold
     * 
     * @return the carHold
     */
    public String getCarHold() {
        return carHold;
    }
    /**
     * @param carHold the carHold to set
     */
    public void setCarHold(String carHold) {
        this.carHold = carHold;
    }
    /**
     * accFund
     * 
     * @return the accFund
     */
    public String getAccFund() {
        return accFund;
    }
    /**
     * @param accFund the accFund to set
     */
    public void setAccFund(String accFund) {
        this.accFund = accFund;
    }
    /**
     * sociSec
     * 
     * @return the sociSec
     */
    public String getSociSec() {
        return sociSec;
    }
    /**
     * @param sociSec the sociSec to set
     */
    public void setSociSec(String sociSec) {
        this.sociSec = sociSec;
    }
    /**
     * carValue
     * 
     * @return the carValue
     */
    public String getCarValue() {
        return carValue;
    }
    /**
     * @param carValue the carValue to set
     */
    public void setCarValue(String carValue) {
        this.carValue = carValue;
    }
    /**
     * familyAvgWage
     * 
     * @return the familyAvgWage
     */
    public String getFamilyAvgWage() {
        return familyAvgWage;
    }
    /**
     * @param familyAvgWage the familyAvgWage to set
     */
    public void setFamilyAvgWage(String familyAvgWage) {
        this.familyAvgWage = familyAvgWage;
    }
    /**
     * otherIncome
     * 
     * @return the otherIncome
     */
    public String getOtherIncome() {
        return otherIncome;
    }
    /**
     * @param otherIncome the otherIncome to set
     */
    public void setOtherIncome(String otherIncome) {
        this.otherIncome = otherIncome;
    }
    
}
