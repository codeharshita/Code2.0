<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>

<h1>Hello JSP</h1>
<%! int a = 10;
int b = 34;
%>
<%int c=a+b; %>
<%= c +  " is the answer" %><br/>

<%=new java.util.Date()%><br/>
<%= 85>63 %>


<%
for(int i = 0; i<10; i++){
	out.print("<br/>");
	out.print(i);
}


%><br/>


<%!

	String sayHi(){
	return "Hello JSP.";
}
%>
<%= sayHi() %>

</body>
</html>