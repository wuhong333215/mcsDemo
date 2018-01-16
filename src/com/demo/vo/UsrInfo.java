/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: wuhong[wu_hong@suixingpay.com] 
 * @date: 2017年9月18日 下午5:29:16   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.demo.vo;

/**  
 * 基本信息
 * @author: wuhong[wu_hong@suixingpay.com]
 * @date: 2017年9月18日 下午5:29:16
 * @version: V1.0
 * @review: wuhong[wu_hong@suixingpay.com]/2017年9月18日 下午5:29:16
 */
public class UsrInfo {
    // 用户姓名
    private String usrNm;
    // 证件类型
    private String creTyp;
    // 用户证件号
    private String creNo;
    // 性别
    private String gender;
    // 移动电话
    private String phoneNo;
    // 备注
    private String rmk;
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
     * creTyp
     * 
     * @return the creTyp
     */
    public String getCreTyp() {
        return creTyp;
    }
    /**
     * @param creTyp the creTyp to set
     */
    public void setCreTyp(String creTyp) {
        this.creTyp = creTyp;
    }
    /**
     * creNo
     * 
     * @return the creNo
     */
    public String getCreNo() {
        return creNo;
    }
    /**
     * @param creNo the creNo to set
     */
    public void setCreNo(String creNo) {
        this.creNo = creNo;
    }
    /**
     * gender
     * 
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
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

}
