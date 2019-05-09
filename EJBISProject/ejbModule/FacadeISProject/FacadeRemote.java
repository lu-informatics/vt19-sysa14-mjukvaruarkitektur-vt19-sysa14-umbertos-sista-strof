package FacadeISProject;

import java.util.List;

import javax.ejb.Remote;

import ejbModule.Book;
import ejbModule.BookID;
import ejbModule.Loaning;
import ejbModule.Person;
import ejbModule.Reserve;

@Remote
public interface FacadeRemote {
	public Person CreatePerson(Person person);
	public List<Book> FindAllBooks();
	public List<Book> SearchBook(String searchTerm);
	public List<Loaning> PersonLoans(String id);
	public List<Reserve> PersonReserve(String id);
	public Reserve CreateReserve(Reserve reserve);
	public Person CheckPassword(String email);
}
