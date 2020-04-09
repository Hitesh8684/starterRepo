<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr>
	<th>Name</th>
	<th>Email</th>
	<th>Created At</th>
</tr>
	<c:forEach items="${records}" var="val">
	<tr>
	
	<td>${val.name}</td>
	<td>${val.email}</td>
	<td>${val.createdAt}</td>
	
	</tr>
	</c:forEach>

</table>
<%-- <ul>

<c:forEach items="${records}" var="val">
<li>${val.name}</li>

</c:forEach>
</ul> --%>
</body>
</html>