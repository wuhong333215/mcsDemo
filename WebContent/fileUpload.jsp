<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.demo.utils.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>上传文件</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css" />
</head>

<body>
<form action="<%=Configuration.getInstance().getValue("contractUpload")%>" method="post" enctype="multipart/form-data" class="bootstrap-frm">
	<h1>合同文件上传</h1>
	<label>
         <span><span style="color:red;">*</span>上传文件:</span>
         <input type="file" name="contract" value="">
    </label>
	<label>
         <span><span style="color:red;">*</span>渠道编号:</span>
         <input type="text" name="astId" value="">
    </label>
    <label>
         <span><span style="color:red;">*</span>渠道订单号:</span>
         <input type="text" name="astOno" value="">
    </label>
	<label>
         <span>&nbsp;</span>
         <input type="submit" value="上传文件" class="button"/>
    </label>
</form>
</body>
</html>