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
 * Servlet implementation class UpdateEmp
 */
@WebServlet("/UpdateEmp")
public class UpdateEmp extends HttpServlet {
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
			String name;
			String job;
			int mgr;
			double sal;
			double comm;
			int deptNo;
			if(emp!=null){
				String paraname[]= request.getParameterValues("updaterow");
				for(String str:paraname){
					switch (str){
					case "ename":name=request.getParameter("ename");
								 rows+=dao.updateEmpDetailsName(empno, name);
								 break;
					case "ejob":job=request.getParameter("ejob");
								rows+=dao.updateEmpDetailsJob(empno,job);
								break;
					case "emgr":mgr=Integer.parseInt(request.getParameter("emgr"));
					 			rows+=dao.updateEmpDetailsMgr(empno, mgr);
					 			break;
					case "esal":sal=Double.parseDouble(request.getParameter("esal"));
					 			rows+=dao.updateEmpDetailsSal(empno, sal);
					 			break;
					case "ecomm":comm=Double.parseDouble(request.getParameter("ecomm"));
					 			rows+=dao.updateEmpDetailsComm(empno, comm);
					 			break;
					case "edeptno":deptNo=Integer.parseInt(request.getParameter("edeptno"));
					 				rows+=dao.updateEmpDetailsDeptno(empno,deptNo);
					 				break;
					}
				}
				pw.println(rows);
				pw.println("<br><a href=\"Home.html\">go back to home page</a>");
				}else
					pw.println("row with Employee Number "+empno+" not found");
					pw.println("<br><a href=\"Home.html\">go back to home page</a>");
		}else {
			pw.println("<h2> invalid access "+"<br>");
			pw.println("<a href=Form.html>go back to Login page</a>");
		}
	}

	

}
