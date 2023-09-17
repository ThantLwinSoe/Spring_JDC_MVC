<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
	integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
	crossorigin="anonymous"></script>
<title>Home Page</title>
</head>
<body>
	<div class="navbar navbar-expand-lg bg-info">
		<h1 class="container-fluid text-white">Welcome Home Page</h1>
	</div>


	<div class="card mx-auto p-2 text-bg-danger" style="width: 32rem;margin-top: 5rem;">
		<form action="/welcome/personPage" method="get" class="card-body">
			
			<div class="mb-3">
				<label class="form-label">User Name: </label> 
			
				<div class="input-group mb-3">
					<input class="form-control" type="text" name="uname"
					placeholder="User Name"><br>
				</div>
			</div>
			
			<div class="mb-3">
				
				<label class="form-label">Course: </label>
				<div class="input-group mb-3">
					<input class="form-control"
					type="text" name="course" placeholder="Course"><br>
				</div>
			</div>
			
			<div class="mb-3">
				<label class="form-label">Phone
				Number: </label>
				
				<div class="input-group mb-3">
					<input class="form-control" type="text" name="pnum" placeholder="Phone Number"><br>
				</div>
			</div>
			
			<div >
				<input class="btn btn-primary" type="submit" value="Submit">
			</div>
			
			
		</form>
	</div>


</body>
</html>