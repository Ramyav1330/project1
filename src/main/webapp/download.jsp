<%@page import="java.util.List"%>
<%@page import="servlet.Dto.studentDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<studentDto> l1=(List<studentDto> )request.getAttribute("studentlist"); %>
<table  border="">
<tr>
<th>id </th>
<th>phone</th>
<th>Gender</th>
<th>std name</th>
<th>delete</th>
<th>update</th>
</tr>
<%for(studentDto a:l1){ %>
<tr>
<td><%=a.getStd_id() %></td>
<td><%=a.getPhnno() %></td>
<td><%=a.getGender() %></td>
<td><%=a.getStd_name() %></td>
<td><a href="remove?sid=<%=a.getStd_id()%>">delete</a></td>
<td><a href="update1.jsp?sid=<%=a.getStd_id() %>
&sname=<%=a.getStd_name()%>
&phno=<%=a.getPhnno() %>
&gender=<%=a.getGender() %>">update</a></td>
</tr>
<%} %>
</table>
</body>
</html>