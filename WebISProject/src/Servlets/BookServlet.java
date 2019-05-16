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

import entities.Book;
import facade.FacadeLocal;

/**
 * Servlet implementation class ServletISProject
 */
@WebServlet("/BookServlet/*")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private FacadeLocal Facade;        
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	try {
    	String pathInfo = request.getPathInfo();
    	if(pathInfo == null|| pathInfo.equals("/")){
    		System.out.println("Alla");
    		System.out.println(pathInfo);
    		List<Book> books = Facade.findAllBooks();
    		sendAsJson(response, books);
    		return;
    	}
    	String[] splits = pathInfo.split("/");
    	if(splits.length != 2) {
    		System.out.println("Alla2");
    		response.sendError(HttpServletResponse.SC_BAD_REQUEST);
    		return;
    	}
    	String id = splits[1];
    	List <Book> book = Facade.searchBook(id);
    	sendAsJson(response, book);
    	}
    	catch(Exception e) {
    		throw e;
    	}
    
    }
    
    private void sendAsJson(HttpServletResponse response, List<Book> books) throws IOException, ServletException {
    	PrintWriter out = response.getWriter();
    	response.setContentType("application/json");
    	if(books != null) {
    		JsonArrayBuilder array = Json.createArrayBuilder();
    		for(Book b: books) {
    			JsonObjectBuilder o = Json.createObjectBuilder();
    			o.add("Isbn", String.valueOf(b.getBookID().getisbn()));
    			o.add("bookcopy", String.valueOf(b.getBookID().getbookcopy()));
    			o.add("title", b.getTitle());
    			o.add("author", b.getAuthor());
    			array.add(o);
    		}
    		JsonArray jsonArray = array.build();
    		System.out.println("Book Rest: "+jsonArray);
    		out.print(jsonArray);
    	} 
    	else{
    		out.print("No Matches Found!");
    	}
    	out.flush();
    }
    
}

