package Servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Person;
import facade.FacadeLocal;

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
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String passwordCheck = Facade.checkPassword(email);
			if (password.equals(passwordCheck)) {
				HttpSession session = request.getSession();
				session.setAttribute("email",email);
				response.sendRedirect("Home.jsp");
				//logged-in page
			}
			else {
				response.sendRedirect("LoginError.jsp");	//error page 
			}
		}
		catch (Exception e) {
			response.sendRedirect("LoginError.jsp"); //error page
		}
	}
}
