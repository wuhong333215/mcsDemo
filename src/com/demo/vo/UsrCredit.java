/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: wuhong[wu_hong@suixingpay.com] 
 * @date: 2017年9月18日 下午5:33:20   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.demo.vo;

/**  
 * 征信信息
 * @author: wuhong[wu_hong@suixingpay.com]
 * @date: 2017年9月18日 下午5:33:20
 * @version: V1.0
 * @review: wuhong[wu_hong@suixingpay.com]/2017年9月18日 下午5:33:20
 */
public class UsrCredit {
    // 征信报告
    private String  creditReport;
    // 芝麻信用分
    private String  sesameCreditScore;
    /**
     * creditReport
     * 
     * @return the creditReport
     */
    public String getCreditReport() {
        return creditReport;
    }
    /**
     * @param creditReport the creditReport to set
     */
    public void setCreditReport(String creditReport) {
        this.creditReport = creditReport;
    }
    /**
     * sesameCreditScore
     * 
     * @return the sesameCreditScore
     */
    public String getSesameCreditScore() {
        return sesameCreditScore;
    }
    /**
     * @param sesameCreditScore the sesameCreditScore to set
     */
    public void setSesameCreditScore(String sesameCreditScore) {
        this.sesameCreditScore = sesameCreditScore;
    }
    
}
