<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Multiple Pages</title>
</head>
<body>
	<h1>Multiple Pages</h1>
	
	<ul>
		<li>${not empty message ? message : "Default"}</li>
		<li>
			<app:url value="/welcome" var="home"></app:url>
			<a href="${home}">Return Home Page!!!</a>
		</li>
	</ul>
</body>
</html>