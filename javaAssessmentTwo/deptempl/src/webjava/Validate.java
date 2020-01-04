package webjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		RequestDispatcher rd;
		
		HttpSession session=request.getSession();
		session.setAttribute("user", user);
	
		if(user.isEmpty()||pass.isEmpty()){
			rd=request.getRequestDispatcher("Form.html");
			if(user.isEmpty()||pass.isEmpty())
				pw.println("<font color=red>please enter name and password</font>");
			rd.include(request, response);
			
		}
		else if(user.equals("admin")&&pass.equals("min")){
				rd=request.getRequestDispatcher("Home.html");
				rd.forward(request, response);
			
			}
		else {	rd=request.getRequestDispatcher("Form.html");
				pw.println("<font color=red>invalid enter name or password</font>");
				rd.include(request, response);
		}
			
	}

}
