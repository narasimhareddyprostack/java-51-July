<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Customer Registration</title>
</head>
<body>
	<h3>New Customer Page</h3>
	<form action="custReg" method="post">
		<label>First Name:</label>
		<input type="text" name="firstName" placeholder="Enter Name"/>
		<br/>
		<label>Last Name:</label>
		<input type="text" name="lastName" placeholder="Enter Name"/>
		<br/>
		<label>Email Id:</label>
		<input type="text" name="emailid" placeholder="Enter Name"/>
		
		<br/><br/>
		<label>Gender</label>
		<input type="radio" name="gender" value="male"/>Male
		<input type="radio" name="gender" value="female"/>FeMale
		
		<br/>
		<label>Mobile No:</label>
		<input type="text" name="mobile" placeholder="Enter Name"/>
		
		<br/>
		
		<input type="submit" value="Registration"/>
	</form>
</body>
</html>