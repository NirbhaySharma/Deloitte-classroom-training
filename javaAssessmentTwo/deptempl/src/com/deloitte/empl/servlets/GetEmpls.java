package com.deloitte.empl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


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
 * Servlet implementation class GetEmpls
 */
@WebServlet("/GetEmpls")
public class GetEmpls extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=	response.getWriter();
		
		HttpSession session= request.getSession();
		Object user=session.getAttribute("user");
		if(user!=null){
			EmpDao emp=new EmpDaoImpl();
			List<Emp> empList=emp.getEmpls();
			pw.println("<table border=2>");
			pw.println("<tr><th>Empno</th><th>EmpName</th><th> Job</th> <th>Mgr</th><th>Date</th><th>Salary</th><th>Comm</th><th>Deptno</th></tr>");
			for(Emp e:empList){
				pw.println("<tr><td>"+e.getEmpno()+"</td><td>"+e.getEname()+"</td><td>"+e.getJob()+"</td> <td>"+e.getMgr()+"</td><td>"+e.getHiredate()+"</td><td>"+e.getSal()+"</td><td>"+e.getComm()+"</td><td>"+e.getDeptno()+"</td></tr>");
			}
			pw.println("</table>");
			pw.println("<br><a href=\"Home.html\">go back to home page</a>");
		}else {
			pw.println("<h2> invalid access "+"<br>");
			pw.println("<a href=Form.html>go back to Login page</a>");
		}
	}	
}
