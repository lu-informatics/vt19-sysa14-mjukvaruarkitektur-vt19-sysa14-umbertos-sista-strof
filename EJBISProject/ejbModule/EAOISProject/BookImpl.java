package EAOISProject;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ejbModule.Book;

import ejbModule.BookID;

/**
 * Session Bean implementation class BookImpl
 */ 


@Stateless
@LocalBean
public class BookImpl implements BookLocal {
	@PersistenceContext(unitName="ISEJBSql")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public BookImpl() {
        // TODO Auto-generated constructor stub
    }
    
   
    public List<Book> SearchBook(String searchTerm){
    	TypedQuery<Book> query = em.createNamedQuery("Book.findBookWithSearch", Book.class);
    	query.setParameter("searchTerm", "%" + searchTerm + "%");
    	List<Book> results = query.getResultList();
    	return results;
    }
    
    public List<Book> FindAllBooks(){
    	TypedQuery<Book> query = em.createNamedQuery("Book.findAllBooks", Book.class);
    	List<Book> results = query.getResultList();
    	return results;
    		
    }
    public Book FindBookByID(String isbn, String bookcopy){
    	TypedQuery<Book> query = em.createNamedQuery("Book.findByID", Book.class);
    	query.setParameter("isbn", isbn);
    	query.setParameter("bookcopy", bookcopy);
    	Book book= query.getSingleResult();
    	return book;
    }
    
    
    
}
