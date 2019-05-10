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
    	String pathInfo = request.getPathInfo();
    	if(pathInfo == null|| pathInfo.equals("/")){
    		System.out.println("Alla");
    		System.out.println(pathInfo);
    		List<Book> books = Facade.FindAllBooks();
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
    	List <Book> book = Facade.SearchBook(id);
    	sendAsJson(response, book);
    	/*String action = request.getParameter("submit");
    	String pathinfo = request.getPathInfo();
    	System.out.println(pathinfo);
    	if(action != null) {
    		if(action.equals("Search")) {
    			String pathInfo = request.getParameter("Text");
    				if(pathInfo == null || pathInfo.equals("")) {
    					searchAllBooks(request,response);
    				}
    				else{
    					searchBooks(request, response);
    				}
    			
    		}
    		
    	}
    	*/
    }
    
    private void sendAsJson(HttpServletResponse response, List<Book> books) throws IOException, ServletException {
    	PrintWriter out = response.getWriter();
    	response.setContentType("application/json");
    	if(books != null) {
    		JsonArrayBuilder array = Json.createArrayBuilder();
    		for(Book b: books) {
    			JsonObjectBuilder o = Json.createObjectBuilder();
    			o.add("BookID", String.valueOf(b.getBookID()));
    			o.add("title", b.getTitle());
    			o.add("author", b.getAuthor());
    			array.add(o);
    		}
    		JsonArray jsonArray = array.build();
    		System.out.println("Book Rest: "+jsonArray);
    		out.print(jsonArray);
    	} 
    	else{
    		out.print("[]");
    	}
    	out.flush();
    }
    	/*response.setContentType("application/json");    
    	if(books != null) {
    		JsonArrayBuilder array = Json.createArrayBuilder();
    		for(Book b: books) {
    			JsonObjectBuilder o = Json.createObjectBuilder();
    			o.add("BookID", String.valueOf(b.getBookID()));
    			o.add("title", b.getTitle());
    			o.add("author", b.getAuthor());
    			array.add(o);
    		}
    		JsonArray jsonArray = array.build(); 		
    		System.out.println("Book Rest: "+jsonArray);
    		request.setAttribute("book", jsonArray);
    		request.getRequestDispatcher("/Books.jsp").forward(request, response);		
    	} 
    	else{
    		
    	}*/
    
    
    }

