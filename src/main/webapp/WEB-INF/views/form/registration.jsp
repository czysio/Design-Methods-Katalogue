<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>registration</title>
</head>
<body>
<%@ include file="/WEB-INF/views/formheader.jsp" %><br/>
	<div class="container">
	<h1>Rejestracja:</h1>
	<div class="form-group has-danger has-success">
		<form:errors path="*"></form:errors>
		<form:form modelAttribute="user" method="post">
 			<label class="form-control-label">Imię: 
 				<form:input class="form-control form-control-success form-control-danger" path="firstName" placeholder="Imię"/>
 			</label><br/>
 			<form:errors style="color: red" path="firstName"/><br/>
 			<label class="form-control-label">Nazwisko: 
 				<form:input class="form-control form-control-success form-control-danger" path="lastName" placeholder="Nazwisko"/>
 			</label><br/>
 			<form:errors style="color: red" path="lastName"/><br/>
 			<label class="form-control-label">Username: 
 				<form:input class="form-control form-control-success form-control-danger" path="username" placeholder="Login"/>
 			</label><br/>
 			<form:errors style="color: red" path="username"/><br/>
 			<label class="form-control-label">Email: 
 				<form:input class="form-control form-control-success form-control-danger" type="email" path="email" placeholder="Email"/>
 			</label><br/>
 			<form:errors style="color: red" path="email"/><br/>
 			<label class="form-control-label">Hasło: 
 				<form:input class="form-control form-control-success form-control-danger" id="password" type="password" path="password" placeholder="Hasło"/>
 			</label><br/>
 			<label class="form-control-label">Powtórz hasło: 
 				<input class="form-control form-control-success form-control-danger" id="passwordcheck" type="password" name="passwordcheck" placeholder="Powtórz hasło"/>
 			</label><br/>
 			<button class="btn btn-dark" type="submit">Potwierdź dane</button>
  		</form:form>
  	</div>
  	</div>
<script src="/Katalogue/static/registrationPasswordCheck.js" type="text/javascript"></script>
</body>
</html>