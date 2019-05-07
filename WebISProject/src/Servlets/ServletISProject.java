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


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	
    	String pathInfo = request.getParameter("Text");
    	System.out.println(pathInfo);
    	
    	if(pathInfo == null || pathInfo.equals("")) {
    		System.out.println("alla");
    		System.out.println(pathInfo);
    		List<Book> allBooks = Facade.FindAllBooks();
        	sendAsJson(response, request, allBooks);
    	}
    	
    	else if(pathInfo != null) {
    		System.out.println("alla2");
    		System.out.println(pathInfo);
    		List<Book> books = Facade.SearchBook(pathInfo);
    		sendAsJson(response, request, books);
    		return;
    	}
    
    }
    
    private void sendAsJson(HttpServletResponse response, HttpServletRequest request, List<Book> books) throws IOException, ServletException {
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
    		request.setAttribute("book", jsonArray);
    		request.getRequestDispatcher("/Books.jsp").forward(request, response);
    		
    		
    		//out.print(jsonArray);
    	} else{
    		//out.print("[]");
    	}
    	//out.flush();
    	}
}
