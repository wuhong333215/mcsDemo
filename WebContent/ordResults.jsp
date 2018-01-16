<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.demo.utils.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>放款结果查询</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css" />
</head>

<body>
<form action="ordResults" method="post" class="bootstrap-frm">
	<h1>放款结果查询</h1>
	<label>
         <span><span style="color:red;">*</span>交易码:</span>
         <input type="text" name="tranCd" value="MC0005">
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
         <span>&nbsp;</span>
         <input type="submit" value="查询" class="button"/>
    </label>
</form>
</body>
</html>