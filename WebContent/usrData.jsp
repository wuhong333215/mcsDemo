<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.demo.utils.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>用户数据接口</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css" />
</head>
<body>
<form action="usrData" method="post" class="bootstrap-frm">
	<h1>用户数据接口</h1>
	<label>
         <span><span style="color:red;">*</span>交易码:</span>
         <input type="text" name="tranCd" value="MC0001">
    </label>
    <label>
         <span><span style="color:red;">*</span>渠道编号:</span>
         <input type="text" name="astId" value="<%=Configuration.getInstance().getValue("astId")%>">
    </label>
	<h2>基本信息</h2>
	<label>
         <span><span style="color:red;">*</span>用户姓名:</span>
         <input type="text" name="usrNm" value="">
    </label>
    <label>
         <span><span style="color:red;">*</span>证件类型:</span>
         <input type="text" name="creTyp" value="">
    </label>
    <label>
         <span><span style="color:red;">*</span>证件号:</span>
         <input type="text" name="creNo" value="">
    </label>
    <label>
         <span><span style="color:red;">*</span>性别:</span>
         <input type="text" name="gender" value="">
    </label>
    <label>
         <span><span style="color:red;">*</span>移动电话:</span>
         <input type="text" name="phoneNo" value="">
    </label>
    <label>
         <span>备注:</span>
         <input type="text" name="rmk" value="">
    </label>
    <h2>家庭信息</h2>
    <label>
         <span><span style="color:red;">*</span>住址:</span>
         <input type="text" name="homeAdd" value="">
    </label>
    <label>
         <span>邮编:</span>
         <input type="text" name="postCode" value="">
    </label>
    <label>
         <span>婚姻状况:</span>
         <input type="text" name="marSts" value="">
    </label>
    <label>
         <span>伴侣姓名:</span>
         <input type="text" name="spouseName" value="">
    </label>
    <label>
         <span>学历:</span>
         <input type="text" name="eduInfo" value="">
    </label>
    <label>
         <span>子女人数:</span>
         <input type="text" name="childNum" value="">
    </label>
    <label>
         <span>子女是否上学:</span>
         <input type="text" name="childIsStudent" value="">
    </label>
    <label>
         <span>赡养长辈人数:</span>
         <input type="text" name="elderNum" value="">
    </label>
    <h2>资产信息</h2>
    <label>
         <span>名下房产数量:</span>
         <input type="text" name="houseNum" value="">
    </label>
    <label>
         <span>是否有私家车:</span>
         <input type="text" name="carHold" value="">
    </label>
    <label>
         <span>是否有公积金 :</span>
         <input type="text" name="accFund" value="">
    </label>
    <label>
         <span>是否有社保:</span>
         <input type="text" name="sociSec" value="">
    </label>
    <label>
         <span>私家车评估价格:</span>
         <input type="text" name="carValue" value="">
    </label>
    <label>
         <span>家庭工资月收入:</span>
         <input type="text" name="familyAvgWage" value="">
    </label>
    <label>
         <span>月其他收入:</span>
         <input type="text" name="otherIncome" value="">
    </label>
	<h2>房产信息</h2>
	<input hidden name="finHouseNum" id="finHouseNum" value="0"></input>
	<div id="finHouse"></div>
	<h2>通讯信息</h2>
    <label>
         <span>邮箱:</span>
         <input type="text" name="mailAdd" value="">
    </label>
    <label>
         <span>紧急联系人姓名:</span>
         <input type="text" name="emergencyContactName" value="">
    </label>
    <label>
         <span>紧急联系人关系 :</span>
         <input type="text" name="emergencyContactRela" value="">
    </label>
    <label>
         <span>紧急联系人电话:</span>
         <input type="text" name="emergencyContactPhone" value="">
    </label>
	<h2>通讯录数据</h2>
	<input hidden name="contaListNum" id="contaListNum" value="0"></input>
	<div id="contaList"></div>
	<h2>征信信息</h2>
	<label>
         <span>征信报告 :</span>
         <input type="text" name="creditReport" value="">
    </label>
    <label>
         <span>芝麻信用分:</span>
         <input type="text" name="sesameCreditScore" value="">
    </label>
    <h2>工作信息</h2>
	<label>
         <span>工作单位名称 :</span>
         <input type="text" name="workUnit" value="">
    </label>
    <label>
         <span>单位联系人电话:</span>
         <input type="text" name="unitContactPhone" value="">
    </label>
    <label>
         <span>工作单位地址:</span>
         <input type="text" name="workAdd" value="">
    </label>
    <label>
         <span>工作单位职务:</span>
         <input type="text" name="workDuty" value="">
    </label>
	<label>
         <input hidden/>
         <span>&nbsp;</span>
         <input type="button" value="增加房产信息" onclick="addFinHouse()" class="button"/>
         <input type="button" value="增加通讯录数据" onclick="addContaList()" class="button"/>
         <input type="submit" value="提交" class="button"/>
    </label>
</form>
<script type="text/javascript">
	
	// 记录房产信息条数
	var	finHouseNum = 0;
	// 记录通讯录数据
	var	contaListNum = 0;
	
	function addFinHouse() {
		console.log(finHouseNum);
		var finHouse = document.getElementById("finHouseNum");
		finHouseNum = finHouseNum + 1;
		finHouse.value = finHouseNum;
		addFinHouseLabel(finHouseNum);
	}
	
	// 增加一行房产信息
	function addFinHouseLabel(i) {
		var parent = document.getElementById("finHouse");
		var label = document.createElement("label");
		label.innerText = "第" + i + "条房产信息";
		parent.appendChild(label);
		
		addLabel("房产面积", "houseArea", "finHouse");
		addLabel("房产所在城市", "houseCity", "finHouse");
		addLabel("房产地址", "houseAdd", "finHouse");
		addLabel("房产评估价值", "houseValue", "finHouse");
		addLabel("是否有房贷 ", "houseLoan", "finHouse");
		addLabel("房贷剩余年限", "loanRemainYears", "finHouse");
		addLabel("房产类型 ", "houseProType", "finHouse");
		addLabel("房贷月供", "loanForMonth", "finHouse");
	}
	
	function addContaList() {
		var contaList = document.getElementById("contaListNum");
		contaListNum = contaListNum + 1;
		contaList.value = contaListNum;
		addContaListLabel(contaListNum);
	}
	// 增加一行通讯录数据
	function addContaListLabel(i) {
		var parent = document.getElementById("contaList");
		var label = document.createElement("label");
		label.innerText = "第" + i + "条通讯录数据";
		parent.appendChild(label);
		
		addLabel("姓名", "name", "contaList");
		addLabel("电话号码", "phone", "contaList");
	}
	
	// 增加一行Label
	function addLabel(name, code, parent) {
		var parent = document.getElementById(parent);
		var label = document.createElement("label");
		var spanName = document.createElement("span");
		spanName.innerText = name;
		label.appendChild(spanName);
		var input = document.createElement("input");
		input.setAttribute("type", "text");
		input.setAttribute("name", code);
		label.appendChild(input);
		parent.appendChild(label);
	}
</script>
</body>
</html>