<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>HomePage</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
	<h4>Home page : List of users in the project</h4>
	<a href="${pageContext.request.contextPath}/addUser">Add User</a>
	<hr/>
	<table border="1" align="left">
		<tr>
			<th>User ID</th>
			<th>Name</th>
			<th>email</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.userId}</td>
				<td>${user.name}</td>
				<td>${user.email}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>