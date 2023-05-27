<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update1">	
id:<input type="number" name="sid" value=<%=request.getParameter("sid")%> readonly="readonly"><br>
name:<input type="text" name="sname" value=<%=request.getParameter("sname")%>><br> 
number<input type="number" name="number" value=<%=request.getParameter("phno")%>><br> 
<%if(request.getParameter("gender").equals("male")) {%>
male:<input type="radio" name="gender" value="male" checked="checked"><br>
female:<input type="radio" name="gender" value="female"><br>
<%} else { %>
male:<input type="radio" name="gender" value="male" ><br>
female:<input type="radio" name="gender" value="female" checked="checked"><br>
<%} %>
<button type="submit">update</button>
</body>
</html>