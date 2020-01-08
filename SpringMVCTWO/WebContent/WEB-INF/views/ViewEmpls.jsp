<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
		<tr><TH>code<TH>EMP NAME<TH>salary</TH><TH>UPDATE</TH><TH>DELETE</TH></tr>
		<c:forEach var="emp" items="${empls}"> 
			<tr>
				<td><c:out value="${emp.code}"></c:out>  </td>
				<td><c:out value="${emp.name}"></c:out>  </td>
				<td><c:out value="${emp.sal}"></c:out>  </td>
				
				<td><a href="UpdateEmp?code=${emp.code}">Update </a></td>
				<td><a href="DeleteRow?code=${emp.code}">Delete </a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>