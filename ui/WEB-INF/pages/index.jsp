<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请登录</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/common/js/third/jquery-1.11.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/common/js/common.js" charset="GBK"></script>
<style type="text/css">
	.vT_td{
	}
	.vT_tr:hover{
		background: rgba(252, 13, 13, 0.28);
	}
	.vT_td:hover{
		background: rgba(196, 125, 122, 0.4);
	}
</style>
</head>
<body>
	${message},- -#
	<a href="${pageContext.request.contextPath}/need_login.do">login</a>
	<div id="data-table">ddd</div>
	<div class="vv_table">
		<span id="table_id"></span>
	</div>
</body>
</html>