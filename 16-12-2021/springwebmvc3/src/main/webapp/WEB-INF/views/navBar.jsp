<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style> 
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: blue;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: #111;
}
</style>
<title>Nav</title>
</head>
<body>
<ul>
  <li><a href="./register">Registration</a></li>
  <li><a href="./update">update</a></li>
  <li><a href="./delete">delete</a></li>
  <li><a href="./search">Search</a></li>
 <li><a href="./logout">logout</a></li>
 </ul>
</body>
</html>