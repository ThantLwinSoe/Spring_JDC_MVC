<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application Enum</title>
</head>
<body>
	<h1>Level Page</h1>
	
	<h3>Java ${lvl}</h3>
	
	<ul>
		<li>
			<app:url value="/welcome" var="home"></app:url>
			<a href="${home}">Go To Home</a>
		</li>
	</ul>
</body>
</html>