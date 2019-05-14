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
import ejbModule.Reserve;

/**
 * Servlet implementation class ReserveServlet
 */
@WebServlet("/ReserveServlet/*")
public class ReserveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @EJB
	FacadeLocal Facade;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReserveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String pathInfo = request.getPathInfo();
		String[] splits = pathInfo.split("/");
		String email = splits[1];
		//out.println(pathInfo);
		String id = Facade.FindPersonID(email);
		//out.println(id);
		List<Reserve> reserves = Facade.PersonReserve(id);
		sendAsJson(response, reserves);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("create") != null) {
		Reserve reserve = new Reserve();
		String email = request.getSession(false).getAttribute("email").toString();
		reserve.setId(Facade.FindPersonID(email));
		String isbn = request.getParameter("isbn");
		String bookcopy = request.getParameter("bookcopy");
		Book book = Facade.FindBookByID(isbn, bookcopy);
		reserve.setBookID(book.getBookID());
		try{
			Facade.CreateReserve(reserve);
			response.sendRedirect("Books.jsp");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		else if(request.getParameter("delete") != null) {
			Reserve reserve = new Reserve();
			String email = request.getSession(false).getAttribute("email").toString();
			reserve.setId(Facade.FindPersonID(email));
			String isbn = request.getParameter("isbn");
			String bookcopy = request.getParameter("bookcopy");
			Book book = Facade.FindBookByID(isbn, bookcopy);
			reserve.setBookID(book.getBookID());
			try {
				Facade.DeleteReserve(reserve);
				response.sendRedirect("Reservations.jsp");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}



	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private void sendAsJson(HttpServletResponse response, List<Reserve> reserves) throws IOException, ServletException {
    	PrintWriter out = response.getWriter();
    	response.setContentType("application/json");
    	if(reserves != null) {
    		JsonArrayBuilder array = Json.createArrayBuilder();
    		for(Reserve r: reserves) {
    			JsonObjectBuilder o = Json.createObjectBuilder();
    			o.add("isbn", String.valueOf(r.getBookID().getisbn()));
    			o.add("bookcopy", String.valueOf(r.getBookID().getbookcopy()));
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
