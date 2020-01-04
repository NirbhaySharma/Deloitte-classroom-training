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
 * Servlet implementation class AddEmp
 */
@WebServlet("/AddEmp")
public class AddEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); 
		
		PrintWriter pw= response.getWriter();
		HttpSession session= request.getSession();
		Object user=session.getAttribute("user");
		if(user!=null){
			int empNo=Integer.parseInt(request.getParameter("empno"));
			String eName=request.getParameter("ename");
			String job=request.getParameter("job");
			int mgr=Integer.parseInt(request.getParameter("mgr"));
			String date =request.getParameter("date");
			double salary=Double.parseDouble(request.getParameter("sal"));
			double comm=Double.parseDouble(request.getParameter("comm"));
			int departmentNo=Integer.parseInt(request.getParameter("deptno"));
			Emp emp = new Emp(empNo,eName,job,mgr,date,salary,comm,departmentNo);
			EmpDao dao = new EmpDaoImpl();
			int rows=0;
			rows = dao.addEmp(emp);
			if(rows>0){
				pw.println("inserted");
				pw.println("<br><a href=\"Home.html\">go back to home page</a>");
				}	
			else{
				pw.println("not inserted");
				pw.println("<br><a href=\"Home.html\">go back to home page</a>");
				}
		}else {
			pw.println("<h2> invalid access "+"<br>");
			pw.println("<a href=Form.html>go back to Login page</a>");
		}	
	}

	

}
