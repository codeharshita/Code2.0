<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Demo</title>
    <!-- Include Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form action="<%= request.getContextPath()%>/formJspServlet" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Full Name:</label>
            <input type="text" name="name" id="name" class="form-control" required>
        </div>

        <div class="mb-3">
            <label class="form-check-label">Gender:</label>
            <div class="form-check">
                <input type="radio" name="gender" value="Male" checked= "checked" class="form-check-input">
                <label class="form-check-label">Male</label>
            </div>
            <div class="form-check">
                <input type="radio" name="gender" value="Female" class="form-check-input">
                <label class="form-check-label">Female</label>
            </div>
        </div>

        <div class="mb-3">
            <label class="form-check-label">Languages Known:</label>
            <div class="form-check">
                <input type="checkbox" name="language" value="English" class="form-check-input">
                <label class="form-check-label">English</label>
            </div>
            <div class="form-check">
                <input type="checkbox" name="language" value="Hindi" class="form-check-input">
                <label class="form-check-label">Hindi</label>
            </div>
            <div class="form-check">
                <input type="checkbox" name="language" value="Marathi" class="form-check-input">
                <label class="form-check-label">Marathi</label>
            </div>
            <div class="form-check">
                <input type="checkbox" name="language" value="French" class="form-check-input">
                <label class="form-check-label">French</label>
            </div>
        </div>

        <div class="mb-3">
            <label for="Country" class="form-label">Countries:</label>
            <select name="Country" id="Country" class="form-select">
                <option value="India">India</option>
                <option value="Nepal">Nepal</option>
                <option value="Sri Lanka">Sri Lanka</option>
                <option value="China">China</option>
            </select>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<!-- Include Bootstrap JS and jQuery (optional) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
