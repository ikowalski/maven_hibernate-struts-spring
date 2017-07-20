<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World!</title>
  </head>
  <body>
  <jsp:useBean id="me" scope="session" class="model.MessageStore"> </jsp:useBean>
  <jsp:getProperty property="message" name="me"/>
  </body>
</html>