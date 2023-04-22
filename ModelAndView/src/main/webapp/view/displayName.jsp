<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name View</title>
</head>
<body>
Hello ${name}<br/>
Today is ${date}<br/>
____________________<br/>
Currently Online Users:<br/>
<c:forEach var="temp" items="${users}">
${temp}
</c:forEach>

</body>
</html>