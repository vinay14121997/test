<%@page import="org.jsp.Model.UserInformation"%>
<%@page import="java.util.List"%>
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
  List<UserInformation> list=(List<UserInformation>)request.getAttribute("alluserdetails");
%>
<center>
<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Emailid</th>
<th>Mobilenumber</th>
<th>Gender</th>
<th>Address</th>
</tr>
<%
for(UserInformation user:list)
{
%>
<tr>
<td><%=user.getFirstname() %></td>
<td><%=user.getLastname() %></td>
<td><%=user.getEmailid() %></td>
<td><%long mb=user.getMobilenumber();
String m=mb+"";%>
<%=m.substring(1,3)+"****"+m.substring(6,10)%></td>
<td><%=user.getGender() %></td>
<td><%=user.getAddress() %></td>
</tr>
<% }%>
</table>
</center>




</body>
</html>