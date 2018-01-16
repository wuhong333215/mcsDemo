package com.demo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.demo.utils.Configuration;
import com.demo.utils.HttpClientUtil;
import com.demo.utils.PaymentUtils;
import com.demo.utils.SortUtils;
import com.demo.utils.Util;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class OrdResultsController
 */
@WebServlet("/ordResults")
public class OrdResultsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdResultsController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // 获取密钥信息
	    String astPri = Configuration.getInstance().getValue("astPri");
	    String mcsPub = Configuration.getInstance().getValue("mcsPub");
        String loanBatNo = request.getParameter("loanBatNo");
        JSONObject encryptData = new JSONObject();
        encryptData.put("loanBatNo", loanBatNo);
        String reqData = null;
        try {
            reqData = PaymentUtils.encrypt(encryptData.toString(), mcsPub);
        } catch (Exception e1) {
            Util.putJsondata("加密错误", response);
            return;
        }
        // 加签名
        Map<String, Object> signData = new HashMap<String, Object>();
        signData.put("tranCd", request.getParameter("tranCd"));
        signData.put("astId", request.getParameter("astId"));
        signData.put("reqData", reqData);
        String sign = PaymentUtils.sign(SortUtils.getSign(signData), astPri);
        // 发送请求
        String url = Configuration.getInstance().getValue("ordResults");
        JSONObject jsonPut = new JSONObject();
        jsonPut.put("tranCd", request.getParameter("tranCd"));
        jsonPut.put("astId", request.getParameter("astId"));
        jsonPut.put("reqData", reqData);
        jsonPut.put("sign", sign);
        String result = HttpClientUtil.doPost(url, jsonPut.toString());
        // 判断是否有获取到返回值
        if (StringUtils.isBlank(result)) {
            Util.putJsondata("未获取到返回数据", response);
            return;
        }
        JSONObject resultJson = JSONObject.fromObject(result);
        // 如果返回成功则进行验签和解密
        if ("0000".equals(resultJson.get("resCode"))) {
            sign = resultJson.getString("sign"); // 签名字段
            String resData = resultJson.getString("resData"); // 加密字段
            // 验签
            boolean docheck = PaymentUtils.doCheck(resData, sign, mcsPub);
            if (!docheck) {
                Util.putJsondata("返回信息验签失败",response);
            }
            // 解密
            try {
                resData = PaymentUtils.decrypt(resData, astPri);
                resultJson.put("resData", resData);
            } catch (Exception e) {
                Util.putJsondata("返回信息解密异常",response);
            }
        }
        Util.putJsondata(resultJson.toString(), response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
