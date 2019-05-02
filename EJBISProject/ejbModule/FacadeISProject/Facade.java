package FacadeISProject;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import EAOISProject.BookLocal;
import EAOISProject.LoaningImpl;
import EAOISProject.LoaningLocal;
import EAOISProject.PersonLocal;
import EAOISProject.ReserveLocal;
import ejbModule.Book;
import ejbModule.BookID;
import ejbModule.Loaning;
import ejbModule.Reserve;
import ejbModule.Person;


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
    public List<Loaning> PersonLoans(String id){
    	return Loaning.PersonLoans(id);
    }
    public Reserve CreateReserve(Reserve reserve) {
    	return Reserve.CreateReserve(reserve);
    }
	public List<Reserve> PersonReserve(String id){
		return Reserve.PersonReserve(id);
	}
	public Book findBook(BookID bookID) {
		return Book.findBook(bookID);
	}
	public List<Book> SearchBook(String searchTerm){
		return Book.SearchBook(searchTerm);
	}
	public List<Book> FindAllBooks(){
		return Book.FindAllBooks();
	}
	public Person CreatePerson(Person person) {
		return Person.CreatePerson(person);
	}
    

}
