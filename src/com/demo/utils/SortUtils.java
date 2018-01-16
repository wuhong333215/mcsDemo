package com.demo.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;


/**
 * Description: 去空排序
 * Copyright:   ©2015 Vbill Payment Co. Ltd. All rights.
 * Created on:  2017年7月25日 下午2:39:41 
 * @author li_ty@suixingpay.com
 */
public class SortUtils{

    public static String getSign(Map<String, Object> map) {
		ArrayList<String> list = new ArrayList<String>();
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			if (entry.getValue() != null) {
				list.add(entry.getKey() + "=" + entry.getValue() + "&");
			}
		}
		int size = list.size();
		String[] arrayToSort = list.toArray(new String[size]);
		Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(arrayToSort[i]);
		}
		String result = sb.toString();
		return result;
		
	}
    
    
}
