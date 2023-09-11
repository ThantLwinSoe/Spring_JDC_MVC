<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input Controller Page</title>
</head>
<body>
	<h1>Input Controller Page</h1>	
	
	<app:choose>
			<app:when test="${not empty name and not empty id }">
				<h3>Name::>>${name}</h3>
				<h3>Id::>> ${id}</h3>
			</app:when>
			<app:otherwise>
				<h3>Need Name</h3>
				<h3>Need Id</h3>
			</app:otherwise>
	</app:choose>
	
</body>
</html>