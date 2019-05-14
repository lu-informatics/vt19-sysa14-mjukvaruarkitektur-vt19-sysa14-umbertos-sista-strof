package sessionBeans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Book;




@Stateless
@LocalBean
public class BookImpl implements BookLocal {
	@PersistenceContext(unitName="ISEJBSql")
	private EntityManager em;
	List<Book> results = null;
	Book book = new Book();

    public BookImpl() {
    }
    
   //Find book by searching form title or author
    public List<Book> searchBook(String searchTerm){
    	try {
    	TypedQuery<Book> query = em.createNamedQuery("Book.findBookWithSearch", Book.class);
    	query.setParameter("searchTerm", "%" + searchTerm + "%");
    	results = query.getResultList();
    	}
    	catch (Exception e){
    		System.out.println(e);
    	}
    	return results;
    }
    
    //Find and return all books
    public List<Book> findAllBooks(){
    	try {
    	TypedQuery<Book> query = em.createNamedQuery("Book.findAllBooks", Book.class);
    	results = query.getResultList();
    	return results;
    	}
    	catch (Exception e) {
    		System.out.println(e);
    	}
    	return results;
    	
    }
    
    //Find a book with is ID(isbn, bookcopy)
    public Book findBookByID(String isbn, String bookcopy){
    	try {
    	TypedQuery<Book> query = em.createNamedQuery("Book.findByID", Book.class);
    	query.setParameter("isbn", isbn);
    	query.setParameter("bookcopy", bookcopy);
    	book = query.getSingleResult();
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	return book;
    }
}
