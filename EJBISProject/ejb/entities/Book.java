package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "Book.findBookWithSearch", 
    		query = "SELECT b FROM Book b WHERE b.title LIKE :searchTerm OR b.author LIKE :searchTerm"),
    @NamedQuery(name = "Book.findAllBooks", query = "SELECT b FROM Book b"),
    @NamedQuery(name = "Book.findByID", query = "SELECT b FROM Book b WHERE b.bookID.isbn = :isbn AND b.bookID.bookcopy = :bookcopy")

})
@Table(name="Book")
public class Book implements Serializable {

	private BookID bookID;
	private String title;
	private String author;
	
	

	
	@Column(name="title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column (name="author")
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@EmbeddedId
	public BookID getBookID() {
		return bookID;
	}
	public void setBookID(BookID bookID) {
		this.bookID = bookID;
	}
	
}

