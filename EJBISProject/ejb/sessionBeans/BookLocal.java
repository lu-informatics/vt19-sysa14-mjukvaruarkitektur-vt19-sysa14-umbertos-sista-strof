package sessionBeans;

import java.util.List;

import javax.ejb.Local;

import entities.Book;

@Local
public interface BookLocal {
	public List<Book> searchBook(String searchTerm);
	public List<Book> findAllBooks();
	public Book findBookByID(String isbn, String bookcopy);
}
