<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.demo.utils.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>下载文件</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css" />
</head>

<body>
<form action="<%=Configuration.getInstance().getValue("accOrdDown")%>" method="post" enctype="multipart/form-data" class="bootstrap-frm">
	<h1>对账文件下载</h1>
	<label>
         <span><span style="color:red;">*</span>交易码:</span>
         <input type="text" name="tranCd" value="MC0009">
    </label>
	<label>
         <span><span style="color:red;">*</span>渠道编号:</span>
         <input type="text" name="astId" value="">
    </label>
    <label>
         <span><span style="color:red;">*</span>协议还款日期:</span>
         <input type="text" name="argRepayDt" value="">
    </label>
	<label>
         <span>&nbsp;</span>
         <input type="submit" value="下载文件" class="button"/>
    </label>
</form>
</body>
</html>