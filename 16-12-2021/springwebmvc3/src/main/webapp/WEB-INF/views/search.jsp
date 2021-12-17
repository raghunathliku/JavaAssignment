<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="navBar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >

<fieldset>
<legend>Emoloyee Login Form</legend>

<form action="./search" method="post" >
<table>
<tr>
<td><label>UserId:</label></td>
<td><input type="useid" name=eid placeholder="Enter user Id"></td>
</tr>

</tr>
<tr>
<td><input type="submit" name="Search"></td>
</tr>


</table>

</form>

</fieldset>
</body>
</html>