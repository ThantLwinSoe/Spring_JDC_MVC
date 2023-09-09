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
	<h1>Home Page</h1>
	
	<p>
		<app:out value="${message}"></app:out>
	</p>
	
	<ol>
		<li>
			<app:url value="/other" var="otherPage"></app:url>
			<a href="${otherPage}">Go to Other Page!!!</a>
		</li>
	</ol>
</body>
</html>