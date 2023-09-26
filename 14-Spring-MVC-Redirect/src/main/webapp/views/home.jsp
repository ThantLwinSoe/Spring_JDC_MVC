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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
	integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
	crossorigin="anonymous"></script>
<style type="text/css">
	.mag-head{
		margin-left: 1rem;		
	}
	
	.btn-cus {
		background-color: #FFFFFF;
		border-radius: 50px;
		color: black;
	}
</style>	
<title>Home Page</title>
</head>
<body >

	<nav class="navbar text-bg-primary opacity-75">
		<h2 class="navbar-brand text-light font-monospace mag-head">
		<i class="bi bi-emoji-kiss-fill"></i>
		<i class="bi bi-emoji-kiss-fill"></i>
		Di Di Language School
		
		</h2>
			
		<ul class="nav btn-group d-flex flex-row">
			<li class="nav-item btn ">
				<a href="#" class="nav-link btn btn-info btn-cus font-monospace ">Home</a>
			</li>
			<li class="nav-item btn">
				<a href="#" class="nav-link  btn btn-info btn-cus font-monospace">Course</a>
			</li>
		</ul>
	</nav>
	
	<div class="card mt-4 bg-body-secondary " style="width: 24rem; margin-left: auto; margin-right: auto;">
		<div class="card-body row">
		<div class="">
		<form action="/admin" method="post">
			<div class="mb-1">
				<label>User Name</label>
			</div>
			<div class="mb-1 ">
				<input class="form-control" type="text" id="userName" 
				name="userName" placeholder="User Name">
			</div>
			<div class="mb-1 ">
				<label>Password</label>
			</div>
			<div class="mb-1">
				<input class="form-control" type="password" id="passw" 
				name="passw" placeholder="Password"/>
			</div>
			
			<div>
		<!-- 
				<input type="submit" value="Submit">
		 -->		<button type="submit" class="btn btn-primary mt-2">Sign In</button>
			</div>		
		</form>
		</div>
		</div>
	</div>
	

</body>
</html>