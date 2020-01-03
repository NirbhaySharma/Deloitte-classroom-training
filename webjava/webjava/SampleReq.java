package webjava;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleReq
 */
@WebServlet("/SampleReq")
public class SampleReq extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("inside init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("inside destroy");
		}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw =response.getWriter();
		String name=request.getParameter("Company_name");
		String email=request.getParameter("Email_Id");
		String date=request.getParameter("datetime");
		
		String JOB=request.getParameter("job");
		int sal=Integer.parseInt(request.getParameter("sal"));
		pw.println(" Company name = "+name+" <br>");
		pw.println(" Email = "+email+" <br>");
		pw.println(" Date = "+date+" <br>");
		pw.println(" JOB = "+JOB+" <br>");
		pw.println("salary is = "+sal);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
