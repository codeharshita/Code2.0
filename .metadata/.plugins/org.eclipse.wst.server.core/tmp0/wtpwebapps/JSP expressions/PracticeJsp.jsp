<%@ page import="java.util.Date"%>
<%@ page import="com.studyeasy.jsp.UserDefined"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Importing concepts</title>
</head>
<body>

	<%= new Date()
	%><br />
	<% out.print(new UserDefined().sayHi());%>
	
  <%UserDefined obj = new UserDefined(); %>
  <%obj.name(); %>



</body>
</html>