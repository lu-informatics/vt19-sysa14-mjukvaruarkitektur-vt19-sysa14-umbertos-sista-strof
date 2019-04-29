package ejbModule;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book implements Serializable {

	private String isbn;
	private String title;
	private String bookcopy;
	private String author;
	
	@Id
	@Column(name="isbn")
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Column(name="title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Id
	@Column (name="bookcopy")
	public String getBookcopy() {
		return bookcopy;
	}
	public void setBookcopy(String bookcopy) {
		this.bookcopy = bookcopy;
	}
	@Column (name="author")
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}

