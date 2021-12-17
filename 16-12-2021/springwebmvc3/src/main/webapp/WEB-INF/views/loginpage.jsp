<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%String mess=(String) request.getAttribute("errMsg"); %>
    <%String mess1=(String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<%if(mess !=null && !mess.isEmpty()){ %>
<h1><%=mess %></h1>
<%} %>

<%if(mess1 !=null && !mess1.isEmpty()){ %>
<h1><%=mess1 %></h1>
<%} %>
<fieldset>
<legend>Emoloyee Login Form</legend>

<form action="./login" method="post" >
<table>
<tr>
<td><label>UserId:</label></td>
<td><input type="useid" name=eid placeholder="Enter user Id"></td>
</tr>
<tr>
<td><label>Password:</label></td>
<td><input type="password" name="password" placeholder="Enter your password"></td>

</tr>
<tr>
<td><input type="submit" ></td>
</tr>


</table>

</form>

</fieldset>
</body>
</html>