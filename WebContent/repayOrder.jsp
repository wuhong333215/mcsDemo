<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.demo.utils.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>回款订单接口</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
<form action="repayOrder" method="post" class="bootstrap-frm">
	<h1>回款订单接口</h1>
	<label>
         <span><span style="color:red;">*</span>交易码:</span>
         <input type="text" name="tranCd" value="MC0008">
    </label>
    <label>
         <span><span style="color:red;">*</span>渠道编号:</span>
         <input type="text" name="astId" value="<%=Configuration.getInstance().getValue("astId")%>">
    </label>
    <label>
         <span><span style="color:red;">*</span>还款订单批次号:</span>
         <input type="text" name="orderBatNo" value="">
    </label>
	<label>
         <span><span style="color:red;">*</span>总笔数:</span>
         <input type="text" name="totalOrderCnt" value="">
    </label>
    <label>
         <span><span style="color:red;">*</span>总金额:</span>
         <input type="text" name="totalOrderAmt" value="">
    </label>
	<input hidden name="orderNum" id="orderNum" value="0"></input>
	<div id="orderItem"></div>
	<label>
		 <input hidden/>
         <span>&nbsp;</span>
         <input type="button" value="增加回款订单" onclick="add()" class="button"/>
         <input type="button" value="复制第一条订单" onclick="copy()" class="button"/>
         <input type="submit" value="提交" class="button"/>
    </label>
</form>
<script type="text/javascript">
	
	// 记录回款订单条数
	var	num = 0;
	
	function add() {
		var orderNum = document.getElementById("orderNum");
		num = num + 1;
		orderNum.value = num;
		addOrderItems(num);
	}
	
	function copy() {
		copyEvery("astRepayOno");
		copyEvery("astOno");
		copyEvery("realAmt");
		copyEvery("actNo");
		copyEvery("actNm");
		copyEvery("bnkNm");
		copyEvery("lbnkNo");
		copyEvery("lbnkNm");
		copyEvery("idCardNo");
		copyEvery("phoneNo");
	}
	// 复制第一行数据给所有对应name
	function copyEvery(name) {
		var  vars = document.getElementsByName(name);
		for (var i = 1; i < vars.length; i++) {
			vars[i].value = vars[0].value;
		}
	}
	// 增加一行数据行数据
	function addOrderItems(i) {
		var parent = document.getElementById("orderItem")
		var label = document.createElement("label");
		label.innerText = "第" + i + "条回款订单";
		parent.appendChild(label);
		
		addLabel("回款编号", "astRepayOno", 1);
		addLabel("渠道订单编号", "astOno", 1);
		addLabel("实际回款", "realAmt", 1);
		addLabel("扣款账号", "actNo", 1);
		addLabel("扣款户名", "actNm", 1);
		addLabel("扣款银行", "bnkNm", 0);
		addLabel("扣款联行行号", "lbnkNo", 0);
		addLabel("支行信息", "lbnkNm", 0);
		addLabel("扣款身份证号", "idCardNo", 0);
		addLabel("扣款手机号", "phoneNo", 0);
	}
	
	// flag 1为必填，0为非必填
	function addLabel(name, code, flag) {
		var parent = document.getElementById("orderItem");
		var label = document.createElement("label");
		var spanName = document.createElement("span");
		spanName.innerText = name;
		if (1 == flag) {
			var spanStar = document.createElement("span");
			spanStar.style.cssText = "color:red;";
			spanStar.innerText = "*";
			var spanBig = document.createElement("span");
			spanBig.appendChild(spanStar);
			spanBig.appendChild(spanName);
			label.appendChild(spanBig);
		} else {
			label.appendChild(spanName);
		}
		var input = document.createElement("input");
		input.setAttribute("type", "text");
		input.setAttribute("name", code);
		label.appendChild(input);
		parent.appendChild(label);
	}
</script>
</body>
</html>