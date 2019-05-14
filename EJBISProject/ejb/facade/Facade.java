package facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import entities.Book;
import entities.Loaning;
import entities.Person;
import entities.Reserve;
import sessionBeans.BookLocal;
import sessionBeans.LoaningLocal;
import sessionBeans.PersonLocal;
import sessionBeans.ReserveLocal;


/**
 * Session Bean implementation class Facade
 */

@Stateless
@LocalBean
public class Facade implements FacadeRemote, FacadeLocal {
	
	@EJB
	LoaningLocal Loaning;
	@EJB
	ReserveLocal Reserve;
	@EJB
	BookLocal Book;
	@EJB
	PersonLocal Person;

    /**
     * Default constructor. 
     */
    public Facade() {
    	
    }
    public List<Loaning> personLoans(String id){
    	return Loaning.personLoans(id);
    }
    public void createReserve(Reserve reserve) {
    	Reserve.createReserve(reserve);
    }
    public void deleteReserve(Reserve reserve) {
    	Reserve.deleteReserve(reserve);
    }
	public List<Reserve> personReserve(String id){
		return Reserve.personReserve(id);
	}
	public List<Book> searchBook(String searchTerm){
		return Book.searchBook(searchTerm);
	}
	public List<Book> findAllBooks(){
		return Book.findAllBooks();
	}
	public Book findBookByID(String isbn, String bookcopy){
		return Book.findBookByID(isbn, bookcopy);
	}
	public void createPerson(Person person) {
		Person.createPerson(person);
	}
	public String checkPassword(String email){
		return Person.checkPassword(email);
	}
	public String findPersonID(String email) {
		return Person.findPersonID(email);
	}
	
}
