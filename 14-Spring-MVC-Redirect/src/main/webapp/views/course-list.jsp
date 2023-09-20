<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Page</title>
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


</head>
<body>
		<jsp:include page="nav-bar.jsp">
			<jsp:param value="course-list" name="page"/>
		</jsp:include>
		
		<div class="mt-3 mx-4">
			<h2 class="font-monospace">Course List</h2>
		</div>
		
		<div class="mt-3 mx-4">
			<table class="table font-monospace">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Level</th>
						<th>Duration</th>
						<th>Fees</th>
					</tr>
				</thead>
				
				<tbody>
					<app:forEach var="course" items="${courseList}">
						<tr>
							<td>${course.getId()}</td>
							<td>${course.getName()}</td>
							<td>${course.getLevel()}</td>
							<td>${course.getDuration()}</td>
							<td>${course.getFees()}</td>
						</tr>
					</app:forEach>
				</tbody>
				
			</table>
		</div>
		
</body>
</html>