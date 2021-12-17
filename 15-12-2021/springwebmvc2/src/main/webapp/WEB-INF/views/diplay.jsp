<%@page import="com.technoelevate.springwebmvc2.dto.EmployeeDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%EmployeeDto dto=(EmployeeDto)request.getAttribute("empKey"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Details are:</h1>
<h2><%=dto.getEid() %></h2>
<h2><%=dto.getEname() %></h2>
<h2><%=dto.getPassword() %></h2>
<h2><%=dto.getPosition() %></h2>
</body>
</html>