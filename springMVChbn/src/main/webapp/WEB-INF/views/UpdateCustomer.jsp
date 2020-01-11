<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Customer Details</title>
</head>
<body>
	<form action="updatecust" method="post">
		Enter Customer Code <input type="text" name="code" value="${cust.code}" readonly="readonly" ><br>
		Enter Customer Name <input type="text" name="name" value="${cust.name}"><br>
		<input type="submit">
	</form>
</body>
</html>