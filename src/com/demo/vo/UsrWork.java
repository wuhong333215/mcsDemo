/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: wuhong[wu_hong@suixingpay.com] 
 * @date: 2017年9月18日 下午5:33:56   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.demo.vo;

/**  
 * 工作信息
 * @author: wuhong[wu_hong@suixingpay.com]
 * @date: 2017年9月18日 下午5:33:56
 * @version: V1.0
 * @review: wuhong[wu_hong@suixingpay.com]/2017年9月18日 下午5:33:56
 */
public class UsrWork {
    // 工作单位名称
    private String  workUnit;
    // 单位联系人电话
    private String  unitContactPhone;
    // 工作单位地址
    private String  workAdd;
    // 工作单位职务
    private String  workDuty;
    /**
     * workUnit
     * 
     * @return the workUnit
     */
    public String getWorkUnit() {
        return workUnit;
    }
    /**
     * @param workUnit the workUnit to set
     */
    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }
    /**
     * unitContactPhone
     * 
     * @return the unitContactPhone
     */
    public String getUnitContactPhone() {
        return unitContactPhone;
    }
    /**
     * @param unitContactPhone the unitContactPhone to set
     */
    public void setUnitContactPhone(String unitContactPhone) {
        this.unitContactPhone = unitContactPhone;
    }
    /**
     * workAdd
     * 
     * @return the workAdd
     */
    public String getWorkAdd() {
        return workAdd;
    }
    /**
     * @param workAdd the workAdd to set
     */
    public void setWorkAdd(String workAdd) {
        this.workAdd = workAdd;
    }
    /**
     * workDuty
     * 
     * @return the workDuty
     */
    public String getWorkDuty() {
        return workDuty;
    }
    /**
     * @param workDuty the workDuty to set
     */
    public void setWorkDuty(String workDuty) {
        this.workDuty = workDuty;
    }
    
}
