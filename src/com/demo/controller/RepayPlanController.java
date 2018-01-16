package com.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.utils.Configuration;
import com.demo.utils.HttpClientUtil;
import com.demo.utils.PaymentUtils;
import com.demo.utils.SortUtils;
import com.demo.utils.Util;
import com.demo.vo.PlanItem;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class repayPlanController
 */
@WebServlet("/repayPlan")
public class RepayPlanController extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(RepayPlanController.class);
    
    private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RepayPlanController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // 获取传过来的表单数据,根据表单中的name获取所填写的值
	    request.setCharacterEncoding("UTF-8");
	    // 创建对应大小的list集合
	    int planNum = Integer.valueOf(request.getParameter("planNum"));
	    List<PlanItem> planItems = new ArrayList<PlanItem>(planNum);
	    PlanItem planItem = new PlanItem();
	    for (int i = 0; i < planNum; i++) {
	        planItem = new PlanItem();
	        planItems.add(planItem);
	    }
	    // 获取到表单数据
	    try {
            Util.changeToObject(request, planItems, planItem);
        } catch (Exception e) {
            Util.putJsondata("获取表单数据失败", response);
            return;
        }
	    // 获取配置文件中的密钥
	    String astPri = Configuration.getInstance().getValue("astPri");
        String mcsPub = Configuration.getInstance().getValue("mcsPub");
        // 获取加密参数参数
        JSONObject encryptData = new JSONObject();
        encryptData.put("planItems", planItems);
        encryptData.put("astOno", request.getParameter("astOno"));
        encryptData.put("payNo", request.getParameter("payNo"));
        encryptData.put("totalPlanAmt", request.getParameter("totalPlanAmt"));
        // 加密
        String reqData = null;
        try {
            reqData = PaymentUtils.encrypt(encryptData.toString(), mcsPub);
        } catch (Exception e) {
            logger.error("数据加密异常", e);
            return;
        }
	    // 加签名
        Map<String, Object> signData = new HashMap<String, Object>();
        signData.put("tranCd", request.getParameter("tranCd"));
        signData.put("astId", request.getParameter("astId"));
        signData.put("reqData", reqData);
        String sign = PaymentUtils.sign(SortUtils.getSign(signData), astPri);
        // 发送请求
        JSONObject postData = new JSONObject();
        postData.put("tranCd", request.getParameter("tranCd"));
        postData.put("astId", request.getParameter("astId"));
        postData.put("reqData", reqData);
        postData.put("sign", sign);
        String url = Configuration.getInstance().getValue("repayPlan");
        String result = HttpClientUtil.doPost(url, postData.toString());
        // 判断是否有获取到返回值
        if (StringUtils.isBlank(result)) {
            Util.putJsondata("未获取到返回数据", response);
            return;
        }
        Util.putJsondata(result, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
