<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Services Page</h1>
<%  
  ArrayList<String> enames=new ArrayList<String>();
	enames.add("rahul");
	enames.add("Sonia");
	enames.add("Priyanka");
	enames.add("Modi");
  
  for(String ename:enames){
	  out.println(ename);
  }

%>

</body>
</html>