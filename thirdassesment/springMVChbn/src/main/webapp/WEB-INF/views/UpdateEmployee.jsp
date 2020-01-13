<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateemp" method="post">
		Enter Employee number<input type="text" name="empno"  value="${emp.empno}" readonly="readonly" ><br>
	 	Enter Employee Name <input type="text" name="ename" value="${emp.ename}"><br> 
		Enter JOB <input type="text" name="job" value="${emp.job}"><br> 
		Enter MGR <input type="text" name="mgr" value="${emp.mgr}"><br> 
		Enter HIREDATE Enter <input type="text" name="hiredate" value="${emp.hiredate}"><br> 
		Enter SAL <input type="text" name="sal" value="${emp.sal}"><br> 
		Enter COMM <input type="text" name="comm" value="${emp.comm}"><br> 
		Enter DEPTNO <input type="text" name="deptno" value="${emp.deptno}"><br>
		<input type="submit">
	</form>
</body>
</html>