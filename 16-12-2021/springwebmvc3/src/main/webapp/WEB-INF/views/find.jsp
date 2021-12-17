<%@page import="com.technoelevate.springwebmvc3.dto.EmployeeDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="navBar.jsp" %>
    <%EmployeeDto mess=(EmployeeDto) request.getAttribute("empData"); %>
    <%String mess1=(String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<fieldset>
<legend>Emoloyee Details Form</legend>

<form action="./search" method="post" >
<table>
<tr>
<td><label>Enter UserId to see details:</label></td>
<td><input type="useid" name=eid placeholder="Enter user Id"></td>
</tr>

</tr>
<tr>
<td><input type="submit" ></td>
</tr>


</table>

</form>

</fieldset>
<%if(mess !=null){ %>
<h1>Hello Mr. <%=mess.getEname() %> your details are shown below</h1>
<h2>User Id           :<%=mess.getEid() %></h2>
<h2>Client Name       :<%=mess.getEname() %></h2>
<h2>Client Password   :<%=mess.getPassword() %></h2>
<h2>Client Designation:<%=mess.getPosition() %></h2>
<%} %>

<%if(mess1 !=null && !mess1.isEmpty()){ %>
<h1><%=mess1 %></h1>
<%} %>
</body>
</html>