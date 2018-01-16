package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.demo.utils.Configuration;
import com.demo.utils.HttpClientUtil;
import com.demo.utils.PaymentUtils;
import com.demo.utils.Util;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class limitQueryController
 */
@WebServlet("/queryCredit")
public class QueryCreditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryCreditController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // 发送请求
	    String url = Configuration.getInstance().getValue("limitQuery");
        JSONObject jsonPut = new JSONObject();
        jsonPut.put("tranCd", request.getParameter("tranCd"));
        jsonPut.put("astId", request.getParameter("astId"));
        String result = HttpClientUtil.doPost(url, jsonPut.toString());
        // 判断是否有获取到返回值
        if (StringUtils.isBlank(result)) {
            Util.putJsondata("未获取到返回数据", response);
            return;
        }
        JSONObject resultJson = JSONObject.fromObject(result);
        // 如果返回成功则进行验签和解密
        String astPri = Configuration.getInstance().getValue("astPri");
        String mcsPub = Configuration.getInstance().getValue("mcsPub");
        if ("0000".equals(resultJson.get("resCode"))) {
            String sign = resultJson.getString("sign"); // 签名字段
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
