<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Page</title>
</head>
<body>
	<h1>Welcome Product Page</h1>
	<ul>
		<li>${product}</li>
		<li>${size}</li>
		<li>${price}</li>
	</ul>
	<div>
		<app:url value="/home" var="homepage"></app:url>
		<a href="${homepage}">Go to Page!!!</a>
	</div>
</body>
</html>