<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./login.action" method="post">
<!-- 要指明那个对象的object.xxx -->
用户名：<input name="user.username" type="text"><br>
密码：   <input name="user.password" type="password"><br>
<input type="submit" value="登陆">
</form>
</body>
</html>