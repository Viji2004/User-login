<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <% 
 //to avoid back moving to credential pages
 response.setHeader("Cache-control","no-cache,no-store,must-invalidate");
if (session.getAttribute("user") == null) {
   response.sendRedirect("login1.jsp");
} %>
<h1>WELCOME</h1>
Hi, ${user}......... 
Welcome
Successfully Loggedin 

<form action="logout" method="post">
<input type="submit" value="logout">
</form>
</body>
</html>