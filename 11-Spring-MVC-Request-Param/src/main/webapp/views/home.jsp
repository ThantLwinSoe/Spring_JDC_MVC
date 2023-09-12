<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome Home Page</h1>
	
	<form action="/welcome/personPage" method="get">
		<label>User Name</label>
		<input type="text" name="uname" placeholder="User Name"><br>
		<label>Course</label>
		<input type="text" name="course" placeholder="Course"><br>
		<label>Phone Number</label>
		<input type="text" name="pnum" placeholder="Phone Number"><br>
		<input type="submit" value="Submit">				
	</form>

</body>
</html>