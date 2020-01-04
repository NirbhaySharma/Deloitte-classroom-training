package com.deloitte.dept.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


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
 * Servlet implementation class GetDepts
 */
@WebServlet("/GetDepts")
public class GetDepts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=	response.getWriter();
		HttpSession session= request.getSession();
		Object user=session.getAttribute("user");
		if(user!=null){
			DeptDao dao=new DeptDaoImpl();
			List<Dept> deptList=dao.getDepts();
			pw.println("<table border=2>");
			pw.println("<tr><th>deptNo</th><th>deptName</th><th> loc</th></tr>");
			for(Dept e:deptList){
				pw.println("<tr><td>"+e.getDeptNo()+"</td><td>"+e.getDeptName()+"</td><td>"+e.getDeptLoc()+"</tr>");
			}
			pw.println("</table>");
			pw.println("<br><a href=\"Home.html\">go back to home page</a>");
		}
		else {
			pw.println("<h2> invalid access "+"<br>");
			pw.println("<a href=Form.html>go back to Login page</a>");
		}
	}

}
