package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FacadeISProject.FacadeLocal;
import ejbModule.Book;
import ejbModule.Loaning;
import ejbModule.Person;

/**
 * Servlet implementation class LoaningServlet
 */
@WebServlet("/LoaningServlet/*")
public class LoaningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @EJB  
	FacadeLocal Facade;

    public LoaningServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String pathInfo = request.getPathInfo();
		String[] splits = pathInfo.split("/");
		String email = splits[1];
		//out.println(pathInfo);
		String id = Facade.FindPersonID(email);
		//out.println(id);
		List<Loaning> loans = Facade.PersonLoans(id);
		sendAsJson(response, loans);
		return;
		
		
	}
	
    private void sendAsJson(HttpServletResponse response, List<Loaning> loans) throws IOException, ServletException {
    	PrintWriter out = response.getWriter();
    	response.setContentType("application/json");
    	if(loans != null) {
    		JsonArrayBuilder array = Json.createArrayBuilder();
    		for(Loaning l: loans) {
    			JsonObjectBuilder o = Json.createObjectBuilder();
    			o.add("BookID", String.valueOf(l.getBookID()));
    			o.add("ID", l.getId());
    			o.add("endTime", String.valueOf(l.getEndtime()));
    			array.add(o);
    		}
    		JsonArray jsonArray = array.build();
    		System.out.println("Loaning Rest: "+jsonArray);
    		out.print(jsonArray);
    	} 
    	else{
    		out.print("[]");
    	}
    	out.flush();
    }
}
