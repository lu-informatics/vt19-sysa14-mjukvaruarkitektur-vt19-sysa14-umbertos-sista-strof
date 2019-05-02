package FacadeISProject;

import java.util.List;

import javax.ejb.Local;

import ejbModule.Book;
import ejbModule.BookID;
import ejbModule.Loaning;
import ejbModule.Person;
import ejbModule.Reserve;

@Local
public interface FacadeLocal {
	public Person CreatePerson(Person person);
	public List<Book> FindAllBooks();
	public List<Book> SearchBook(String searchTerm);
	public Book findBook(BookID bookID);
	public List<Loaning> PersonLoans(String id);
	public List<Reserve> PersonReserve(String id);
	public Reserve CreateReserve(Reserve reserve);

}
