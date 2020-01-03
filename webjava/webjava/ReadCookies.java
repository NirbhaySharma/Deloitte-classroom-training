package webjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ReadCookies
 */
@WebServlet("/ReadCookies")
public class ReadCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		Cookie[] cks= request.getCookies();
		for( Cookie ck:cks){
			pw.println("cookie name : "+ck.getName()+"<br>");
			pw.println("cookie value : "+ck.getValue()+"<br>");
			
		}
		HttpSession session= request.getSession();
		pw.println(session.getAttribute("mobile")+"<br>");
		session.invalidate();
	}

}
