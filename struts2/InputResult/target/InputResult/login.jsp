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
用户名：<input name="username" type="text"><br>
密码：   <input name="password" type="password"><br>
<!-- 为后台list传参 -->
爱好 1：  <input name="hobby[0]" type="text"><br>
爱好 2：   <input name="hobby[1]" type="text"><br>
年龄：<input name="age" type="text"><br>
<input type="submit" value="登陆">
</form>
</body>
</html>