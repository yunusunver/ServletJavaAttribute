<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.List" %>
    <%@ page import ="_07_Attribute.mvc.model.People"  %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>RequestDispatcher</h1>

<% 
	List<People> pList=(List<People>)request.getAttribute("personPeople");
%>

<table style="width:300px">

<% 
	for(People person: pList){
%>

<tr>
	<td><%=person.getGender() %></td>
	<td><%=person.getFirstName() %></td>
	<td><%=person.getLastName() %></td>
</tr>
<%
	}
%>


</table>


</body>
</html>