<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Add Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
	integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
	crossorigin="anonymous"></script>
</head>
<body class="bg-body-secondary">
	
	<div class="container">
		<div class="mt-3 mb-3" >
		<h1>Course</h1>
	</div>
	<div class="row">
	<div class="col-5">
		<app:url value="/admin/add" var="course_add"></app:url>
			<form action="${course_add}" method="get">
				<div class="">
					<label class="form-label mb-2">Name</label>
				</div>
				<div class="mb-2">
					<input type="text" id="cname" name="cname" class="form-control" placeholder="Course Name">
				</div>
				<div class="mb-1">
					<label class="form-label">Level</label>
				</div>
				<div class="mb-2">
					<select id="level" name="level" class="form-select">
						<option value="">Select the course</option>
						<option value="Basic">Basic</option>
						<option value="Intermediate">Intermediate</option>
						<option value="Advance">Advance</option>
					</select>						
				</div>
				<div class="mb-2">
					<label class="form-label">Duration</label>
				</div>
				<div>
					<input type="text" id="duration" name="duration" class="form-control" placeholder="Duration">
				</div>
								<div>
					<label class="form-label">Fees</label>
				</div>
				<div>
					<input type="text" id="fees" name="fees" class="form-control" placeholder="Fees">
				</div>
				<div>
					
					<input type="submit" class="btn btn-primary mt-4 mx" value="save " style="width: 5rem;">
					<app:url value="/admin?userName=Di Di" var="admin"></app:url>
					<a href="${admin}" class="btn btn-primary mt-4 mx-2" style="width: 5rem;">Cancel</a>
				</div>								
			</form>
			</div>
		</div>
	</div>
</body>
</html>