<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Registration Page </title>
</head>
<body>

<form action="formresults" onsubmit="return validateInfo();">
		First name :
		<input id="firstname" type="text" name="firstname">
			<br>
		Last name
		<input id="lastname" type="text" name="lastname">
			<br>
			<input type="submit" value="Add">
	</form>

</body>
</html>