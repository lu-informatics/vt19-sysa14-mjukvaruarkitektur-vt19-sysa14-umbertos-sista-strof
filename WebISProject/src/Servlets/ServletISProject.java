package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import FacadeISProject.FacadeLocal;

/**
 * Servlet implementation class ServletISProject
 */
@WebServlet("/ServletISProject")
public class ServletISProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private FacadeLocal Facade;        
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletISProject() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><head>");
		out.println("<title>Test</title>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("</head><body>");
		out.println("<h1>Test</h1>");
		out.println("</body></html>");
    }

}
