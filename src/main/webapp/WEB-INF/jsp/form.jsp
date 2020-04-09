<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
 	<form:form id="test" method="post" action="/addData" modelAttribute="testModel">
 	<label>Name:</label>
 	<form:input name="name" path="name"/>
 	<label>Email:</label>
 	<form:input name="email" path="email"/>
 	<button type="submit" name="submitbtn">Submit</button>
 	</form:form>
 	<a href="/find" >Search</a>
</body>
</html>