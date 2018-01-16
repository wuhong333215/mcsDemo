/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: wuhong[wu_hong@suixingpay.com] 
 * @date: 2017年9月18日 下午5:29:58   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.demo.vo;

/**  
 * 家庭信息
 * @author: wuhong[wu_hong@suixingpay.com]
 * @date: 2017年9月18日 下午5:29:58
 * @version: V1.0
 * @review: wuhong[wu_hong@suixingpay.com]/2017年9月18日 下午5:29:58
 */
public class UsrFamily {
    // 住址
    private String  homeAdd;
    // 邮编
    private String  postCode;
    // 婚否，00未婚，01已婚
    private String  marSts;
    // 配偶姓名
    private String  spouseName;
    // 学历  00大专以下；01大专；02本科；03研究生；04博士及以上
    private String  eduInfo;
    // 子女人数
    private String  childNum;
    // 子女是否上学，00全部上学，01全部没上学，02部分上学
    private String  childIsStudent;
    // 赡养长辈人数
    private String  elderNum;
    /**
     * homeAdd
     * 
     * @return the homeAdd
     */
    public String getHomeAdd() {
        return homeAdd;
    }
    /**
     * @param homeAdd the homeAdd to set
     */
    public void setHomeAdd(String homeAdd) {
        this.homeAdd = homeAdd;
    }
    /**
     * postCode
     * 
     * @return the postCode
     */
    public String getPostCode() {
        return postCode;
    }
    /**
     * @param postCode the postCode to set
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    /**
     * marSts
     * 
     * @return the marSts
     */
    public String getMarSts() {
        return marSts;
    }
    /**
     * @param marSts the marSts to set
     */
    public void setMarSts(String marSts) {
        this.marSts = marSts;
    }
    /**
     * spouseName
     * 
     * @return the spouseName
     */
    public String getSpouseName() {
        return spouseName;
    }
    /**
     * @param spouseName the spouseName to set
     */
    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }
    /**
     * eduInfo
     * 
     * @return the eduInfo
     */
    public String getEduInfo() {
        return eduInfo;
    }
    /**
     * @param eduInfo the eduInfo to set
     */
    public void setEduInfo(String eduInfo) {
        this.eduInfo = eduInfo;
    }
    /**
     * childNum
     * 
     * @return the childNum
     */
    public String getChildNum() {
        return childNum;
    }
    /**
     * @param childNum the childNum to set
     */
    public void setChildNum(String childNum) {
        this.childNum = childNum;
    }
    /**
     * childIsStudent
     * 
     * @return the childIsStudent
     */
    public String getChildIsStudent() {
        return childIsStudent;
    }
    /**
     * @param childIsStudent the childIsStudent to set
     */
    public void setChildIsStudent(String childIsStudent) {
        this.childIsStudent = childIsStudent;
    }
    /**
     * elderNum
     * 
     * @return the elderNum
     */
    public String getElderNum() {
        return elderNum;
    }
    /**
     * @param elderNum the elderNum to set
     */
    public void setElderNum(String elderNum) {
        this.elderNum = elderNum;
    }
    
}
