/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: wuhong[wu_hong@suixingpay.com] 
 * @date: 2017年9月18日 下午5:32:02   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.demo.vo;

/**  
 * 通讯信息
 * @author: wuhong[wu_hong@suixingpay.com]
 * @date: 2017年9月18日 下午5:32:02
 * @version: V1.0
 * @review: wuhong[wu_hong@suixingpay.com]/2017年9月18日 下午5:32:02
 */
public class UsrContact {
    // 邮箱
    private String  mailAdd;
    // 紧急联系人姓名
    private String  emergencyContactName;
    // 紧急联系人关系
    private String  emergencyContactRela;
    // 紧急联系人电话
    private String  emergencyContactPhone;
    /**
     * mailAdd
     * 
     * @return the mailAdd
     */
    public String getMailAdd() {
        return mailAdd;
    }
    /**
     * @param mailAdd the mailAdd to set
     */
    public void setMailAdd(String mailAdd) {
        this.mailAdd = mailAdd;
    }
    /**
     * emergencyContactName
     * 
     * @return the emergencyContactName
     */
    public String getEmergencyContactName() {
        return emergencyContactName;
    }
    /**
     * @param emergencyContactName the emergencyContactName to set
     */
    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }
    /**
     * emergencyContactRela
     * 
     * @return the emergencyContactRela
     */
    public String getEmergencyContactRela() {
        return emergencyContactRela;
    }
    /**
     * @param emergencyContactRela the emergencyContactRela to set
     */
    public void setEmergencyContactRela(String emergencyContactRela) {
        this.emergencyContactRela = emergencyContactRela;
    }
    /**
     * emergencyContactPhone
     * 
     * @return the emergencyContactPhone
     */
    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }
    /**
     * @param emergencyContactPhone the emergencyContactPhone to set
     */
    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }
    
}
