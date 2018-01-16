<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.demo.utils.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>放款接口</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
<form action="orderPay" method="post" class="bootstrap-frm">
	<h1>放款接口</h1>
	<label>
         <span><span style="color:red;">*</span>交易码:</span>
         <input type="text" name="tranCd" value="MC0003">
    </label>
    <label>
         <span><span style="color:red;">*</span>渠道编号:</span>
         <input type="text" name="astId" value="<%=Configuration.getInstance().getValue("astId")%>">
    </label>
    <label>
         <span><span style="color:red;">*</span>放款批次号:</span>
         <input type="text" name="loanBatNo" value="">
    </label>
	<label>
         <span><span style="color:red;">*</span>总笔数:</span>
         <input type="text" name="totalLoanCnt" value="">
    </label>
    <label>
         <span><span style="color:red;">*</span>总金额:</span>
         <input type="text" name="totalLoanAmt" value="">
    </label>
	<input hidden name="loanReqNum" id="loanReqNum" value="0"></input>
	<div id="loanReqItems"></div>
	<label>
		 <input hidden/>
         <span>&nbsp;</span>
         <input type="button" value="增加放款订单" onclick="add()" class="button"/>
         <input type="button" value="复制第一条订单" onclick="copy()" class="button"/>
         <input type="submit" value="提交" class="button"/>
    </label>
</form>
<script type="text/javascript">
	
	// 记录回款订单条数
	var	num = 0;
	
	function add() {
		var loanReqNum = document.getElementById("loanReqNum");
		num = num + 1;
		loanReqNum.value = num;
		addLoanReqItems(num);
	}
	
	function copy() {
		copyEvery("astOno");
		copyEvery("actNo");
		copyEvery("actNm");
		copyEvery("actTyp");
		copyEvery("cardNo");
		copyEvery("lbnkNo");
		copyEvery("lbnkNm");
		copyEvery("bnkCd");
		copyEvery("proNm");
		copyEvery("cityNm");
		copyEvery("loanAmt");
		copyEvery("loanRate");
		copyEvery("repayInt");
		copyEvery("payNo");
		copyEvery("repayPer");
		copyEvery("repayTyp");
		copyEvery("repayMod");
		copyEvery("argLoanDt");
		copyEvery("argRepayDt");
		copyEvery("noticeUrl");
		copyEvery("rmk");
		copyEvery("usrNm");
	}
	// 复制第一行数据给所有对应name
	function copyEvery(name) {
		var  vars = document.getElementsByName(name);
		for (var i = 1; i < vars.length; i++) {
			vars[i].value = vars[0].value;
		}
	}
	// 增加一行数据行数据
	function addLoanReqItems(i) {
		var parent = document.getElementById("loanReqItems")
		var label = document.createElement("label");
		label.innerText = "第" + i + "条放款订单";
		parent.appendChild(label);
		
		addLabel("渠道订单号", "astOno", 1);
		addLabel("收款人账户", "actNo", 1);
		addLabel("收款人姓名", "actNm", 1);
		addLabel("账号类型", "actTyp", 1);
		addLabel("用户证件号", "cardNo", 1);
		addLabel("联行行号", "lbnkNo", 0);
		addLabel("支行信息", "lbnkNm", 0);
		addLabel("行别编码", "bnkCd", 1);
		addLabel("开户行省", "proNm", 0);
		addLabel("开户行市", "cityNm", 0);
		addLabel("放款金额", "loanAmt", 1);
		addLabel("放款利率", "loanRate", 1);
		addLabel("回款利息", "repayInt", 1);
		addLabel("回款期数", "payNo", 1);
		addLabel("还款周期", "repayPer", 1);
		addLabel("还款类型", "repayTyp", 1);
		addLabel("还款方式", "repayMod", 1);
		addLabel("协议放款日期", "argLoanDt", 1);
		addLabel("贷款终止日期", "argRepayDt", 1);
		addLabel("通知地址", "noticeUrl", 0);
		addLabel("备注", "rmk", 0);
		addLabel("用户姓名", "usrNm", 1);
	}
	
	// flag 1为必填，0为非必填
	function addLabel(name, code, flag) {
		var parent = document.getElementById("loanReqItems");
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