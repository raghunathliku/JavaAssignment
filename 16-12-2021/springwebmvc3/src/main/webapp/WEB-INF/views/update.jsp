<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="navBar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Employee</title>
</head>
<body>
	<fieldset>
		<legend>Employee update Details</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<td><label>Enter Employee id to update:</label></td>
					<td><input type="text" name="eid"></td>
				</tr>


				<tr>
					<td><label>Enter Employee Name:</label></td>
					<td><input type="text" name="ename"></td>
				</tr>

				<tr>
					<td><label>Enter Employee Position:</label></td>
					<td><input type="text" name="position"></td>
				</tr>

				<tr>
					<td><label>Enter Employee password:</label></td>
					<td><input type="text" name="password"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Update">
			</table>
		</form>
	</fieldset>
</body>
</html>