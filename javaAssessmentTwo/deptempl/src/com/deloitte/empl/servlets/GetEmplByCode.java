package com.deloitte.empl.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

/**
 * Servlet implementation class GetEmplByCode
 */
@WebServlet("/GetEmplByCode")
public class GetEmplByCode extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		HttpSession session= request.getSession();
		Object user=session.getAttribute("user");
		if(user!=null){
			int empno=Integer.parseInt(request.getParameter("empno"));
			EmpDao dao=new EmpDaoImpl();
			
			Emp emp=dao.getEmpByCode(empno);
			if(emp!=null){
				pw.println("Employee Number = "+emp.getEmpno());
				pw.println("Employee Name = "+emp.getEname()+"<br>");
				pw.println("Employee Job = "+emp.getJob()+"<br>");
				pw.println("Employee MGR = "+emp.getMgr()+"<br>");
				pw.println("Employee HDate = "+emp.getHiredate()+"<br>");
				pw.println("Employee Salary = "+emp.getSal()+"<br>");
				pw.println("Employee Comm = "+emp.getComm()+"<br>");
				pw.println("Employee Department No = "+emp.getDeptno()+"<br>");
				pw.println("<br><a href=\"Home.html\">go back to home page</a>");
			}else{
			pw.println("no row with this empno found");
			pw.println("<br><a href=\"Home.html\">go back to home page</a>");
			}
		}else {
			pw.println("<h2> invalid access "+"<br>");
			pw.println("<a href=Form.html>go back to Login page</a>");
		}
	}

}
