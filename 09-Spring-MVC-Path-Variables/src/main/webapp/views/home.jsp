<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate" %>
<%@ page import="com.jdc.app.levels.*" %> 
<%@ page import="java.util.List" %>   
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core"	 %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<% 
	LocalDate date = LocalDate.now(); 
	String str = "Home Page"; 
	List<Enum> list = List.of(Level.Basic,Level.Intermediate,Level.Advance);
	
	pageContext.setAttribute("lvl", list);
	pageContext.setAttribute("date", date);
	pageContext.setAttribute("str", str);
	%>
	<h1>${str}</h1>
	
	<ul>
		<li>
			<app:url value="/multi" var="multi"></app:url>
			<a href="${multi}">Action One</a>
		</li>
		
		<li>
			<app:url value="/input/Aung Myin/show/890" var="input_method"></app:url>
			<a href="${input_method}">Input Call!!!</a>
		</li>
		
		<li>
			<app:url value="/datepage/${date}" var="dateshow"></app:url>
			<a href="${dateshow}">${date}</a>
		</li>
		
  	<app:forEach items="${lvl}" var="level">
		<li>
			<app:url value="/levels/${level}" var="enum_page"></app:url>
			
			<a href="${enum_page}">${level}</a>
			
		</li>
	</app:forEach>
	</ul>
	
	
</body>
</html>