<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>User Form</title>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
<h4>Submit your information</h4>
<hr>
<form:form action="displayUserInfo" modelAttribute="user">
	Name: <form:input path="name" required="true" placeholder="Enter your name"/>
		  <p/>
		  <form:errors path="name" cssStyle="color:red"/>
	<p/>
	Gender: Male: <form:radiobutton path="gender" value="male" required="true"/>
			Female: <form:radiobutton path="gender" value="female" required="true"/>
	<p/>
	Country: <form:select path="country">
				<form:option value="India"></form:option>
				<form:option value="USA" label="The United States"></form:option>
				<form:option value="Ireland"></form:option>
				<form:option value="Uzbekistan"></form:option>
			 </form:select>
	<p/>
	Introduction: <form:textarea path="introduction"/>
	<p/>
		  <form:errors path="introduction" cssStyle="color:red"/>
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
