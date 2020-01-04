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
 * Servlet implementation class DeleteRow
 */
@WebServlet("/DeleteRow")
public class DeleteRow extends HttpServlet {
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
			int rows=0;
			if(emp!=null){
				pw.println("the row to be deleted has empno = "+empno);
				rows = dao.deleteEmpRow(empno);
				pw.println(rows +" row deleted");
				pw.println("<br><a href=\"Home.html\">go back to home page</a>");
			}
			else{
				pw.println("row with Employee Number "+empno+" not found");
				pw.println("<br><a href=\"Home.html\">go back to home page</a>");
			}
		}else {
			pw.println("<h2> invalid access "+"<br>");
			pw.println("<a href=Form.html>go back to Login page</a>");
		}
	}

}
