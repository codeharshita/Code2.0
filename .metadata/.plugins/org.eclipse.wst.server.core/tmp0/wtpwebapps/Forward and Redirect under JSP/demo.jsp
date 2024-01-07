<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forward and redirect demo.</title>
</head>
<body>
<% //request.getRequestDispatcher("forward.jsp").forward(request, response);%>
<% //response.sendRedirect("https://www.facebook.com"); %>
<% response.sendRedirect("redirect.jsp"); %>
				
				
				

</body>
</html>