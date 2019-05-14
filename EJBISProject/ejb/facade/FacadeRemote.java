package facade;

import java.util.List;

import javax.ejb.Remote;

import entities.Book;
import entities.Loaning;
import entities.Person;
import entities.Reserve;

@Remote
public interface FacadeRemote {
	public List<Loaning> personLoans(String id);
	public List<Reserve> personReserve(String id);
	public void deleteReserve(Reserve reserve);
	public void createReserve(Reserve reserve);
	public List<Book> findAllBooks();
	public List<Book> searchBook(String searchTerm);
	public Book findBookByID(String isbn, String bookcopy);
	public String checkPassword(String email);
	public String findPersonID(String email);
	public void createPerson(Person person);
}
