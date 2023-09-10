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
			<app:url value="/multi/action1" var="action_1"></app:url>
			<a href="${action_1}">Action One</a>
		</li>		
		<li>
			<app:url value="/multi/action1?id=29" var="action_1_with_id"></app:url>
			<a href="${action_1_with_id}">Action One with Parameter</a>
		</li>		
		<li>
			<app:url value="/multi/890" var="digit"></app:url>
			<a href="${digit}">Number</a>
		</li>
		<li>
			<app:url value="/multi/yes/whoami" var="wild_card"></app:url>
			<a href="${wild_card}">Wild Card</a>
		</li>		
		<li>
			<app:url value="/welcome" var="home"></app:url>
			<a href="${home}">Return Home Page!!!</a>
		</li>
	</ul>
</body>
</html>