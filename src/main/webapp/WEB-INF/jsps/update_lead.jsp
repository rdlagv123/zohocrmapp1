<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2>Create | Lead</h2>
<input type="hidden" name="id" value="${lead.id }"/>
<form action="updateLead" method="post">
<pre>
	
	FirstName<input type="text" name="firstName" value="${lead.firstName }"/>
	LastName<input type="text" name="lastName" value="${lead.lastName }"/>
	email<input type="email" name="email" value="${lead.email }"/>
	mobile<input type="number" name="mobile" value="${lead.mobile }"/>
	<input type="submit" value="update"/>
</pre>


</form>
   ${msg}
</body>
</html>