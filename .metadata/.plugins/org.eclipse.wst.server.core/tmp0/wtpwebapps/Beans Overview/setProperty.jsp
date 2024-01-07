<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Set Property</title>
</head>
<body>
<jsp:useBean id="user" class="com.studyorg.servlets.User" scope="page"></jsp:useBean>

<jsp:setProperty property="firstName" name="user" value="Chaand"/>
<jsp:setProperty property="lastName" name="user" value="Sheikh"/>



Values are changed updated.

</body>
</html>
