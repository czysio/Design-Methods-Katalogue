<%@page import="org.hibernate.hql.internal.ast.util.ASTUtil.IncludePredicate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home page</title>
  <link rel="stylesheet" href="<c:url value="jquery-ui.css" />">
<!--   <link rel="stylesheet" href="https://jqueryui.com/resources/demos/style.css">
 -->  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="<c:url value="jquery-ui.js"/>" type="text/javascript" /></script>
  <script>
  $( function() {
    $( "#accordion" ).accordion({
      heightStyle: "content"
    });
  } );
  </script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%@ include file="/views/homepageheader.jsp" %><br/>

	<div >
		<div id="accordion">
			<c:forEach items="${methods}" var="method">
  				<h3>${method.name}</h3>
  				<div  >
  					<div  >
  						<img src="/files/${method.icon}"/>
  					</div>
  				</div>
 			</c:forEach>
		</div>
	</div>
</body>
</html>