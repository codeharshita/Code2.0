	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Using get method to read the form data</title>
</head>
<body>
	<p>User name : <%= request.getParameter("userName") %> </p><br><br>
	<p>Password : <%= request.getParameter("pswd") %> </p>
	

</body>
</html>