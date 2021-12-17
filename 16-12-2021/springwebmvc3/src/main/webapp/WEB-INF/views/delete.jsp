<%@page import="com.technoelevate.springwebmvc3.dto.EmployeeDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="navBar.jsp" %>
     <%EmployeeDto mess=(EmployeeDto) request.getAttribute("removeObj"); %>
    <%String mess1=(String) request.getAttribute("msg"); %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >

<fieldset>
<legend>Emoloyee Delete Form</legend>

<form action="./delete" method="post" >
<table>
<tr>
<td><label>UserId to Remove:</label></td>
<td><input type="userid" name=eid placeholder="Enter user Id"></td>
</tr>

</tr>
<tr>
<td><input type="submit"  ></td>
</tr>


</table>

</form>

</fieldset>
<%if(mess !=null){ %>
<h1>hello Mr. <%=mess.getEname() %> your data has been removed successfully...</h1>

<%} %>

<%if(mess1 !=null && !mess1.isEmpty()){ %>
<h1><%=mess1 %></h1>
<%} %>
</body>
</html>