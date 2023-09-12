<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate" %>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<%
		LocalDate date = LocalDate.now();
	
		pageContext.setAttribute("date", date);
	%>
	
	<h1>Welcome Home Page</h1>
	<h4>${date}</h4>
	
	<ul>
		<li>
			<app:url value="/matrixpage/T shirt;size=M;price=25000" var="matrix"></app:url>
			<a href="${matrix}">Matrix Value!!!</a>
		</li>
	</ul>
	
</body>
</html>