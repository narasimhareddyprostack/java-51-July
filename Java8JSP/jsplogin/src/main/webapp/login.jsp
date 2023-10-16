<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!  String name="Rahul"; %>
<form action="success.jsp" method="get">
<label>Email Id:::</label>
<input type="text" name="emailid" placeholder="Email Id"/>
<br> <br>
<label>Password:</label>
<input type="text" name="password" placeholder="Password"/>
<br>
<input type="submit" value="Login"/>
</form>
</body>
</html>