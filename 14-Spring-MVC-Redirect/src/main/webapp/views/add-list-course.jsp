<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>Add List Course</title>
</head>
<body>
	<h1>Add List Course</h1>
	<div>
		${warning}
	</div>
	<div>
		<ul>
			<li>Id : ${added_course.getId()}</li>
			<li>Name : ${added_course.getName()}</li>
			<li>Level : ${added_course.getLevel()}</li>
			<li>Duration : ${added_course.getDuration()}</li>
			<li>Fees : ${added_course.getFees()}</li>
		</ul>
	</div>
	<div>
		<app:url value="/admin?userName=Di Di" var="check"></app:url>
		<a href="${check}">Check Courses</a>
	</div>
</body>
</html>