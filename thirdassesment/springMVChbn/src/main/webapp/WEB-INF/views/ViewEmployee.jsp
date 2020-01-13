<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<table border="2">
		<tr><th>Employee Number<TH>Employee NAME</TH><th>JOB</th><th>MGR</th><th>HIREDATE</th><th>SALARY</th><th>Comm</th><th>DeptNo</th><th>Update</th><th>Delete</th></tr>
		<c:forEach var="emp" items="${emp}"> 
			<tr>
				<td><c:out value="${emp.empno}"></c:out>  </td>
				<td><c:out value="${emp.ename}"></c:out>  </td>
				<td><c:out value="${emp.job}"></c:out>  </td>
				<td><c:out value="${emp.mgr}"></c:out>  </td>
				<td><c:out value="${emp.hiredate}"></c:out>  </td>
				<td><c:out value="${emp.sal}"></c:out>  </td>
				<td><c:out value="${emp.comm}"></c:out>  </td>
				<td><c:out value="${emp.deptno}"></c:out>  </td>
				<td><a href="updateemp?empno=${emp.empno}">Update </a></td>
				<td><a href="deleteemp?empno=${emp.empno}">Delete </a></td>
			</tr>
		</c:forEach>
	</table> <br>
	

</body>
</html>