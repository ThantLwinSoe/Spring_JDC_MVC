<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>



<html>
	<header class="text-bg-primary font-monospace opacity-75 p-3">
		<nav class="navbar">
				<div class="navbar-brand text-light font-monospace">
					Welcome ${name}
				</div>
				<div class="">
					<ul class=" nav ">
						<li class="navbar-item px-2">
							<a href="/home" class="btn btn-dark opacity-75 text-light font-monospace">Home</a>
						</li>
						<li class="navbar-item px-2">
							<a href="/teacher" class="btn btn-dark opacity-75 text-light font-monospace">Teacher</a>
						</li>
						<li class="navbar-item px-2">
							<a href="#" class="btn btn-dark opacity-75 text-light font-monospace">Student</a>
						</li>																		
						<li class="navbar-item px-2">
							<app:url value="/search/add" var="add"></app:url>
							<a href="${add}" class="btn btn-dark 
							text-light font-monospace opacity-75" 
							>Add Course</a>
						</li>
						<li class="navbar-item px-2">
							<a href="/search" class="btn btn-dark opacity-75 text-light font-monospace">Edit Course</a>
						</li>
					</ul>
				</div>
		</nav>
	</header>
</html>