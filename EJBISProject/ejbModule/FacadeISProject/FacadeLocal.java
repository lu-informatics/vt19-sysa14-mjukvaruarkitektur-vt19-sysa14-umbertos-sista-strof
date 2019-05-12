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
	public List<Loaning> PersonLoans(String id);
	public List<Reserve> PersonReserve(String id);
	public void DeleteReserve(Reserve reserve);
	public void CreateReserve(Reserve reserve);
	public String CheckPassword(String email);
	public String FindPersonID(String email);
	public Book FindBookByID(String isbn, String bookcopy);

}
