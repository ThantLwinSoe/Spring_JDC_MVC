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
	<h1>Welcome Request Mapping</h1>
	
	<ul>
		<li>
			<app:url value="/multi" var="multiplePage"></app:url>
			<a href="${multiplePage}">Multiple Pages!!!</a>
		</li>
	</ul>	
	
</body>
</html>