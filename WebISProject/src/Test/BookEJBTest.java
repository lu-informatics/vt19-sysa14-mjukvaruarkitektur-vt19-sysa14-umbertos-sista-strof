package Test;


import javax.naming.Context;
import javax.naming.InitialContext;

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

		book =(BookLocal)context.lookup("java:app/EJBISProject/BookImpl!EAOISProject.BookLocal");

	}
	public void testMethod() {
		//Assert.assertNotNull(book);
		//List<Book> books = book.FindAllBooks();
		Assert.assertNull(book.findAllBooks());
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		book = null;
	}
	


}
