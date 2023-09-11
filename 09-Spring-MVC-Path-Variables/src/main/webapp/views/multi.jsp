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
	
	<h3>
		<app:choose>
			<app:when test="${not empty message }">
				${message }
			</app:when>
			<app:otherwise>
				Default
			</app:otherwise>
		</app:choose>
		
	</h3>
	
	<ul>
		<li>
			<app:url value="/multi/actionOne" var="actionOne"></app:url>
			<a href="${actionOne}">Action One!!!</a>
		</li>
	</ul>
</body>
</html>