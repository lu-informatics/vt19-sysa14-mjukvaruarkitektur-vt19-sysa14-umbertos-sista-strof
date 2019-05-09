package Servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import FacadeISProject.FacadeLocal;
import ejbModule.Person;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	FacadeLocal Facade;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try { 
			Person user = new Person();
			String email = request.getParameter("email");
			user.setEmail(request.getParameter("email"));
			user.setPassword(request.getParameter("password"));
			Person userComapre = Facade.CheckPassword(email);
			if (user.getPassword().equals(userComapre.getPassword())) { 
				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser",userComapre);
				response.sendRedirect("Home.jsp");
				//logged-in page
			}
			else response.sendRedirect("Login.jsp");
			//error page 
			}
		catch (Throwable theException) {
		System.out.println(theException); 
		}
	}
}
