<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New User</title>
</head>
<body>
	<form:form modelAttribute="user" action="addUser" cssStyle="margin:100px;">
		<tr><td>Name: <form:input path="name"/>
		<form:errors path="name" cssStyle="color:red"/></td></tr>
		<p/>
		<tr><td>Email: <form:input path="email"/>
		<form:errors path="email" cssStyle="color:red"/></td></tr>
		<p/>
		<tr><td><input type="submit" value="Submit"></td></tr>
	</form:form>
</body>
</html>