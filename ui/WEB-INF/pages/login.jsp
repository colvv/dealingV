<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请登录</title>
</head>
<%@include file="/include/commonHead.jsp"%>
<body>
	<form action="${pageContext.request.contextPath}/login.do" method="post">
		帐号<input type="text" name="login_user_ID">
		密码<input type="password" name="login_user_password"> 
		<input type="submit" value="登录">
	</form>
	<form action="${pageContext.request.contextPath}/regist.do" method="post">
		帐号<input type="text" name="regist_user_ID">
		密码<input type="password" name="regist_user_password"> 
		重复密码<input type="password" name="regist_user_password"> 
		<input type="submit" value="注册">
	</form>
</body>
</html>