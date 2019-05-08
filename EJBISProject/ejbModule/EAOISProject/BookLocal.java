package EAOISProject;

import java.util.List;

import javax.ejb.Local;

import ejbModule.Book;
import ejbModule.BookID;

@Local
public interface BookLocal {
	public List<Book> SearchBook(String searchTerm);
	public List<Book> FindAllBooks();
}
