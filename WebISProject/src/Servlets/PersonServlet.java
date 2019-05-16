package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.ejb.EJB;
import javax.ejb.EJBTransactionRolledbackException;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Person;
import facade.FacadeLocal;
/**
 * Servlet implementation class PersonServlet
 */
@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @EJB
	FacadeLocal Facade;

    public PersonServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Person person = new Person();
			person.setId(UUID.randomUUID().toString());
			person.setFirstname(request.getParameter("firstname"));
			person.setLastname(request.getParameter("lastname"));
			person.setEmail(request.getParameter("email"));
			person.setPhone(request.getParameter("phone"));
			person.setPassword(request.getParameter("password"));
			Facade.createPerson(person);
			response.sendRedirect("Home.jsp");
		}
		catch(Exception e) {
			throw new EJBTransactionRolledbackException("Person");
		}
	}
}
