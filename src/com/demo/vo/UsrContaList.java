/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: wuhong[wu_hong@suixingpay.com] 
 * @date: 2017年9月18日 下午5:21:00   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.demo.vo;

/**  
 * 用户通讯录数据
 * @author: wuhong[wu_hong@suixingpay.com]
 * @date: 2017年9月18日 下午5:21:00
 * @version: V1.0
 * @review: wuhong[wu_hong@suixingpay.com]/2017年9月18日 下午5:21:00
 */
public class UsrContaList {
    // 姓名
    private String  name;
    // 电话号码
    private String  phone;
    /**
     * name
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * phone
     * 
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
