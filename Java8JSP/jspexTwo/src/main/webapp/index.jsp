
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to JSP Tags</h1>

<%! String ename="Rahul Gandhi"; %>

<%! int calc_Age(int dob_Year){
	return 2023 - dob_Year;
} %>

<%  
  out.println(calc_Age(1983));
%>
<%= ename %>
<%  
  for(int i=0;i<=10;i++){
	  out.println(i);
  }
%>
<%@include file='contact.html' %>
</body>
</html>