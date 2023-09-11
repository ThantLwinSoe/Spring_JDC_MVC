<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date Page</title>
</head>
<body>
	<h1>Welcome Date page!!!</h1>
	<ul>
		<li>
			${dd}
		</li>
		<li>
			<app:url value="/welcome" var="home"></app:url>
			<a href="${home}">Go to Home!!!</a>
		</li>
	</ul>
</body>
</html>