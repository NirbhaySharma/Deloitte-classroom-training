package com.deloitte.dept.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.dept.beans.Dept;
import com.deloitte.dept.dao.DeptDao;
import com.deloitte.dept.dao.impl.DeptDaoImpl;


/**
 * Servlet implementation class AddDept
 */
@WebServlet("/AddDept")
public class AddDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 

		PrintWriter pw= response.getWriter();
		HttpSession session= request.getSession();
		Object user=session.getAttribute("user");
		if(user!=null){
			int deptNo=Integer.parseInt(request.getParameter("deptno"));
			String dName=request.getParameter("dname");
			String loc=request.getParameter("loc");
			Dept dept= new Dept(deptNo,dName,loc);
		
			DeptDao dao = new DeptDaoImpl();
			int rows=0;
			rows = dao.addDept(dept);
			if(rows>0){
			pw.println("inserted");
			pw.println("<br><a href=\"Home.html\">go back to home page</a>");
			}	
			else{
			pw.println("not inserted");
			pw.println("<br><a href=\"Home.html\">go back to home page</a>");
			}
		}
		else {
			pw.println("<h2> invalid access "+"<br>");
			pw.println("<a href=Form.html>go back to Login page</a>");
		}
	}

}
