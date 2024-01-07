<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ManagementApplication2</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
<script type="text/javascript">
	function cancelForm(){
		window.location.href= '<%= request.getContextPath()%>/list';
	}
</script>


</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato"> 
			<ul class="navbar-nav">
				<li class="nav-item"><a
					href="<%=request.getContextPath()%>/list" class="nav-link">Users</a></li>
			</ul>
		</nav>
		
		<div class ="container text-center">
				<label style="font-size: 30px;">User Management Application</label>
			</div>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${user != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${user == null}">
					<form action="insert" method="post">
				</c:if>
				<caption>
					<h2>
						<c:choose>
							<c:when test="${user != null}">
                                Edit User
                              </c:when>
							<c:otherwise>
                                Add New User
                            </c:otherwise>
						</c:choose>
					</h2>
				</caption>
				<c:if test="${user != null}">
					<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
				</c:if>
				<fieldset class="form-group">
					<label>User Name</label> <input type="text" class="form-control"
						name="name" required="required"
						value="<c:out value='${user.name}' />" />
				</fieldset>
				<fieldset class="form-group">
					<label>User Email</label> <input type="email" class="form-control"
						name="email" value="${user.email}" required="required" />
						 <span class="error-message">${errorMessage}</span>
				</fieldset>

				<fieldset class="form-group">
					<label for="country">User Country</label> <select
						class="form-control" id="country" name="country">
						<!-- delete line 61 later (<option value="" disabled selected>Select your country</option>) -->
						<option value="" disabled selected>Select your country</option>
						<option value="USA"
							<c:if test="${user.country == 'USA'}">selected</c:if>>United
							States</option>
						<option value="Canada"
							<c:if test="${user.country == 'Canada'}">selected</c:if>>Canada</option>
						<option value="UK"
							<c:if test="${user.country == 'UK'}">selected</c:if>>United
							Kingdom</option>
						<option value="Australia"
							<c:if test="${user.country == 'Australia'}">selected</c:if>>Australia</option>
						<option value="India"
							<c:if test="${user.country == 'India'}">selected</c:if>>India</option>

					</select>
				</fieldset>
				
				<fieldset class="form-group">
				<p>Upload a file</p>
				<input type="file" id="myFile" name="filename" required="required">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button> &nbsp;&nbsp;&nbsp;&nbsp; 

				<button type="button" class="btn btn-danger" onclick="cancelForm()">Cancel</button>
				
				</form>
			</div>
			
		</div>
	</div>
</body>
</html>
