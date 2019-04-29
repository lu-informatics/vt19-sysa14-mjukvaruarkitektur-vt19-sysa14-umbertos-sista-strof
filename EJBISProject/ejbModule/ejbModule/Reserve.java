package ejbModule;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Reserve")
public class Reserve implements Serializable{
	private String isbn;
	private String bookcopy;
	private String id;
	
	@Column(name="isbn")
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Column(name="bookcopy")
	public String getBookcopy() {
		return bookcopy;
	}
	public void setBookcopy(String bookcopy) {
		this.bookcopy = bookcopy;
	}
	@Column(name="id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}

