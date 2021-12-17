<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Employee Data</legend>
		<form action="./delete" method="post">
			<table>
				<tr>
					<td><label>Enter Employee id to remove :</label></td>
					<td><input type="text" name="eid"></td>
				</tr>
<tr>
					<td><input type="submit" value="delete">
			</table>
		</form>
	</fieldset>
</body>
</html>