package webjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		if(user.isEmpty()||pass.isEmpty()){
			rd=request.getRequestDispatcher("Form.html");
			if(user.isEmpty()||pass.isEmpty())
				pw.println("<font color=red>please enter name and password</font>");
			/*else if(user.isEmpty())
				pw.println("<font color=red>please enter name</font>");
			else if(pass.isEmpty())
				pw.println("<font color=red>please enter password</font>");*/
			rd.include(request, response);
			
		}
		else if(user.equals("admin")&&pass.equals("min")){
				rd=request.getRequestDispatcher("Admin");
				rd.forward(request, response);
			}
		else if((!user.equals("admin"))&&pass.equals("min")){
			rd=request.getRequestDispatcher("User");
			rd.forward(request, response);
		}
		pw.println("sucess");	
	}

}
