<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
</head>
<body>
<form:form action="displayUserInfo" modelAttribute="user">
	Name: <form:input path="name"/>
	<p/>
	Gender: <form:radiobuttons path="gender" items="${genderMap}"/>
	<p/>
	Country: <form:select path="country" items="${countryMap}"/>
	<p/>
	Introduction: <form:textarea path="introduction"/>
	<p/>
	Visited Countries: <br/>
			China: <form:checkbox path="visitedCountries" value="China"/><br/>
			Poland: <form:checkbox path="visitedCountries" value="Poland"/><br/>
			Germany: <form:checkbox path="visitedCountries" value="Germany"/><br/>
			Turkey: <form:checkbox path="visitedCountries" value="Turkey"/>
	<p/>
	<input type="submit" value="Submit">
	
</form:form>
</body>
</html>
