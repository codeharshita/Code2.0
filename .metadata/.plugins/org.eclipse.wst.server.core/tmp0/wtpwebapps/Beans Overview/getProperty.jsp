<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Property</title>
</head>
<body>
<jsp:useBean id="user" class="com.studyorg.servlets.User"  scope="page"></jsp:useBean>
First Name:- <jsp:getProperty property="firstName" name="user"/>
Last Name:- <jsp:getProperty property="lastName" name="user"/>

</body>
</html>