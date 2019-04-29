package ejbModule;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Loaning")
public class Loaning implements Serializable{
	private String isbn;
	private String bookcopy;
	private String id;
	private Date starttime;
	private Date endtime;
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
	@Column(name="starttime")
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	@Column(name="endtime")
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

}
