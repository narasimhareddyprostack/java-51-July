<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%=session.getAttribute("firstName")
	%>
	
	<h1>${firstName}</h1>
	
	<h2>---------------</h2>
	
	<h3>Org Name: ${requestScope.org_Name}</h3>
</body>
</html>