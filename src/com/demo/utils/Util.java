package com.demo.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util {
	
	private static final Logger logger = LoggerFactory.getLogger(Util.class);
	
	/**   
	 * 输出返回信息
	 * @param json
	 * @param response 
	 */  
	public static void putJsondata(String json, HttpServletResponse response) {
	    try {
	        response.setCharacterEncoding("utf-8");
	        response.setContentType("application/json"); 
	        PrintWriter pw = response.getWriter();
	        pw.print(json);
	        pw.flush();
	    } catch (IOException e) {
	        logger.error("输出json串异常");
	    }
	}

	/**   
	 * 数据批量转换
	 * @param <T>
	 * @throws SecurityException 
	 * @throws Exception 
	 */  
	public static <T> void changeToObject(HttpServletRequest request, List<T> list, Object object) throws Exception {
	    Field[] fields = object.getClass().getDeclaredFields();
	    for (int i = 0; i < fields.length; i++) { // 遍历所有属性
            String name = fields[i].getName(); // 获取属性的名字
            String[] values = request.getParameterValues(name);
            if (null == values)
                return;
            name = name.substring(0,1).toUpperCase()+name.substring(1); //将属性的首字符大写，方便构造get，set方法
            Method setMethod = object.getClass().getMethod("set"+name, String.class);
            for (int j = 0; j < values.length; j++) {
                setMethod.invoke(list.get(j), values[j]);
            }
        }
	}
}
