<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search page</title>
</head>
<body>
<fieldset>
<legend>Employee search Details</legend>
<form action="./search" method="POST">
<table>
<tr>
<td><label>Enter the employee id:</label></td>
<td><input type="text" name="id" placeholder="enter id"></td>

</tr>
<tr>
<td><input type="submit" value="search"></td>
</tr>
</table>
</form>
</fieldset>
</body>
</html>
