<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<nav class="navbar bg-dark navbar-dark navbar-expand-sm">
<div class="container">
	<h2 class="navbar-brand">Katalog Metod Projektowych</h2>
	<div class="navbar-nav ml-sm-auto">
		<c:choose>
			<c:when test="${sessionScope.logged}">
				<a class="nav-item nav-link" href="/">HomePage</a>
				<a class="nav-item nav-link" href="user/logout">Wyloguj</a>	
			</c:when>
			<c:otherwise>
				<a class="nav-item nav-link" href="user/login">Zaloguj się</a> 
				<a class="nav-item nav-link" href="user/registration">Zarejestruj się</a>
			</c:otherwise>
		</c:choose>
	</div>
</div>
</nav>