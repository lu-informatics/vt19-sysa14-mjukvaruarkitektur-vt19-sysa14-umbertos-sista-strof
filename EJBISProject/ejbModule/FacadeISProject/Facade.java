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
    public void CreateReserve(Reserve reserve) {
    	Reserve.CreateReserve(reserve);
    }
    public void DeleteReserve(Reserve reserve) {
    	Reserve.DeleteReserve(reserve);
    }
	public List<Reserve> PersonReserve(String id){
		return Reserve.PersonReserve(id);
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
	public String CheckPassword(String email){
		return Person.CheckPassword(email);
	}
	public String FindPersonID(String email) {
		return Person.FindPersonID(email);
	}
	public Book FindBookByID(String isbn, String bookcopy){
		return Book.FindBookByID(isbn, bookcopy);
	}
}
