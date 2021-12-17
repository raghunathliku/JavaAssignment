<%@page import="com.technoelevate.springwebmvc3.dto.EmployeeDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="navBar.jsp" %>
	<%EmployeeDto mess=(EmployeeDto) request.getAttribute("regObj"); %>
    <%String mess1=(String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Employee</title>
</head>
<body>
	<fieldset>
		<legend>Employee Registration Details</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td><label>Enter Employee id to Register:</label></td>
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
					<td><input type="submit" >
			</table>
		</form>
	</fieldset>
	<%if(mess !=null){ %>
<h1>hello Mr. <%=mess.getEname() %> your data has been registered successfully...</h1>

<%} %>

<%if(mess1 !=null && !mess1.isEmpty()){ %>
<h1><%=mess1 %></h1>
<%} %>
</body>
</html>