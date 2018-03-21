<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Login</title>
</head>
<body>
<%@ include file="/views/formheader.jsp" %><br/>
	<div class="container">
		<div class="form-group">
			<h2>Zaloguj się:</h2>
			<p style="color: red; font-size: 1.5em">${param.message}</p>.
			<form method="POST" >
				<label>username/email: <input class="form-control"  type="text" name="username"
					placeholder="username/email"></label><br> 
					<label>hasło: <input class="form-control" type="password" name="password" placeholder="password"></label><br>
				<button class="btn btn-dark" type="submit">Potwierdź dane</button><br>
			</form>
			Nie masz konta ? <a href="registration">Zarejestruj się</a>
		</div>
	</div>
</body>
</html>