<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List all...</title>
</head>
<body>
<h2>list all</h2>
<table>
	<tr>
		<th>FirstName</th>
		<th>lastName</th>
		<th>email</th>
		<th>mobile</th>
		<th>Action</th>
		
	</tr>
	<c:forEach var="leads" items="${leads}">
		<tr>
			<td>${leads.firstName} </td>
			<td>${leads.lastName} </td>
			<td>${leads.email} </td>
			<td>${leads.mobile} </td>
			<td>
				<a href="deleteOne?id=${lead.id}">delete</a>
				<a href="update?id=${lead.id}">Update</a>
			</td>
	    </tr>
	</c:forEach>
</table>
</body>
</html>