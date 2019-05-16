package Test;


import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import entities.Book;
import junit.framework.Assert;
import junit.framework.TestCase;
import sessionBeans.BookLocal;
public class BookEJBTest extends TestCase {
	
	BookLocal book;
	
	public BookEJBTest(String name) {
		super(name);
	}
	protected void setUp() throws Exception {
		super.setUp();
		Context context = new InitialContext();

		book =(BookLocal)context.lookup("java:app/EJBISProject/BookImpl!sessionBeans.BookLocal");

	}
	public void testMethod() {
		List<Book> books = book.findAllBooks();
		Assert.assertFalse(books.isEmpty());
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		book = null;
	}
	


}
