package ejbModule;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "Loaning.findLoan", query = "SELECT l FROM Loaning l WHERE l.id = :PersonID"),
})

@Table(name="Loaning")
public class Loaning implements Serializable{
	private BookID bookID;
	private String id;
	private Date starttime;
	private Date endtime;
	
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
	@EmbeddedId
	public BookID getBookID() {
		return bookID;
	}
	public void setBookID(BookID bookID) {
		this.bookID = bookID;
	}

}
