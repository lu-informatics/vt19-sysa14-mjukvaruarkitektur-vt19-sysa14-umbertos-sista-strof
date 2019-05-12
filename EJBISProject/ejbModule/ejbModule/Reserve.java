package ejbModule;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "Reserve.findReserve", query = "SELECT r FROM Reserve r WHERE r.id = :PersonID"), 
})


@Table(name="Reserve")
public class Reserve implements Serializable{
	private BookID bookID;
	private String id;
	
	@EmbeddedId
	public BookID getBookID() {
		return bookID;
	}
	public void setBookID(BookID bookID) {
		this.bookID = bookID;
	}
	@Column(name="id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}

