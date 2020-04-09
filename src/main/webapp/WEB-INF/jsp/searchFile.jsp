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
<form action="/search" method="post">
<label>Search By Name</label>
<input type="text" name="name"/> 
<button type="submit" name="submit">Search</button>
</form>

	<%-- <c:set var = "salary" scope = "session" value = "${result}"/>
      <c:if test = "${! salary}">
         <p>My salary is:  <c:out value = "${salary}"/><p>
      </c:if> --%>
      
      <table border="1">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Email</th>
	<th>Created At</th>
</tr>
	<c:if test="${result != null}">
	<tr>
	<td>${result.id }</td>
	<td>${result.name}</td>
	<td>${result.email}</td>
	<td>${result.createdAt}</td>
	<td><a href = "delete/${result.id }" >delete</a></td>
	
	</tr>
	</c:if>
	
	

</table>
	
	


</body>
</html>