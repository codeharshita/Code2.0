<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous">
</script>

<script>

	var currentUserId= null;
	function deleteThisUser(e){
		console.log('we are able to click yes button,');
		console.log(currentUserId);
		var url = '<%=request.getContextPath()%>/delete?id=' + currentUserId;
		
		 fetch(url, {
		        method: 'Post', // Use the DELETE HTTP method or another appropriate method
		        headers: {
		            'Content-Type': 'application/json' // Set the content type as needed
		        }
		    })
		    .then(response => {
		    	console.log(response)
		        if (response.ok) {
		            // Handle a successful response (e.g., user deleted)
		        	window.location.reload();
		        } else {
		            // Handle an error response (e.g., user not deleted)
		            console.log("user not deleted.");
		        }
		    })
		    .catch(error => {
		        // Handle network errors or other exceptions
		    });
		}
	
	
	function openModal(userId, buttonType){
		console.log('buttonType: '+buttonType)
		currentUserId=userId;
	}
	
</script>

</head>

<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Users</a></li>
			</ul>
			<div style="padding-left: 30%">
				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New User</a> <a href="<%=request.getContextPath()%>/generate"
					class="btn btn-success">Generate pdf </a> <a
					href="<%=request.getContextPath()%>/excelGenerate"
					class="btn btn-success">Generate Excel</a>
			</div>
		</nav>
	</header>
	<br>

	<div class="row">


		<div class="container text-center">
			<!-- Use "text-right" class to align content to the right -->
			<div class="container text-center">
				<label style="font-size: 30px;">User Management Application</label>
			</div>
		</div>
		<br>

		<div class="table-responsive">
			<table class="table table-bordered">
				<thead>


					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Country</th>
						<th>Actions</th>

					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="user" items="${listUser}">

						<tr>
							<td><c:out value="${user.id}" /></td>
							<td><c:out value="${user.name}" /></td>
							<td><c:out value="${user.email}" /></td>
							<td><c:out value="${user.country}" /></td>
							<td><a href="edit?id=<c:out value='${user.id}' />">Edit</a>

								&nbsp;&nbsp;&nbsp;&nbsp;
								<button type="button" class="btn btn-primary"
									data-bs-toggle="modal" data-bs-target="#myModal"
									onClick="openModal(${user.id},'delete')">Delete</button>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>


		<!-- Modal for delete -->
		<div class="modal fade" id="myModal" tabindex="-1"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Confirm Delete</h5>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<div class="modal-body">Are you sure you want to delete?</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-bs-dismiss="modal">No</button>
						<button type="button" class="btn btn-primary"
							data-bs-dismiss="modal" id="confirm-delete-btn-yes"
							onClick="deleteThisUser()">Yes</button>
					</div>
				</div>
			</div>
		</div>

	</div> <!-- row ending tag -->






</body>

</html>