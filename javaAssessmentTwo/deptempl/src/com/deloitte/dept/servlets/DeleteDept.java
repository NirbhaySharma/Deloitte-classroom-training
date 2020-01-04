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
 * Servlet implementation class DeleteDept
 */
@WebServlet("/DeleteDept")
public class DeleteDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
	
		
		HttpSession session= request.getSession();
		Object user=session.getAttribute("user");
		if(user!=null){
			int deptNo=Integer.parseInt(request.getParameter("deptno"));
			DeptDao dao=new DeptDaoImpl();
			Dept dept=dao.getDeptByCode(deptNo);
			int rows=0;
			if(dept!=null){
				pw.println("the row to be deleted has empno = "+deptNo +"<br>");
				rows = dao.deleteDeptRow(deptNo);
				pw.println(rows +" row deleted");
				pw.println("<br><a href=\"Home.html\">go back to home page</a>");
			}
			else{
				pw.println("row with Employee Number "+deptNo+" not found");
				pw.println("<br><a href=\"Home.html\">go back to home page</a>");
			}
		}
		else {
			pw.println("<h2> invalid access "+"<br>");
			pw.println("<a href=Form.html>go back to Login page</a>");
		}
	}

}
