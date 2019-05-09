package Servlets;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FacadeISProject.FacadeLocal;
import ejbModule.Loaning;

/**
 * Servlet implementation class LoaningServlet
 */
@WebServlet("/LoaningServlet")
public class LoaningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @EJB  
	FacadeLocal Facade;

    public LoaningServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action != null) {
			if(action.equals("")) {
				String text = request.getParameter("text");
				List<Loaning> loans = Facade.PersonLoans(text);
				
			}
		}
	}
}
