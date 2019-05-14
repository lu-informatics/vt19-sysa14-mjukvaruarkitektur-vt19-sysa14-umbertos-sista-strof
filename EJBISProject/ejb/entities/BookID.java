package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class BookID implements Serializable{

private String isbn;
private String bookcopy;

public BookID() {
}
public BookID(String isbn, String bookcopy) {
	this.isbn = isbn;
	this.bookcopy = bookcopy;
}
@Column(name="isbn")
public String getisbn() {
	return isbn;
}
public void setisbn(String isbn) {
	this.isbn = isbn;
}
@Column(name="bookcopy")
public String getbookcopy() {
	return bookcopy;
}
public void setbookcopy(String bookcopy) {
	this.bookcopy = bookcopy;
}

public boolean equals(Object other) {
	if((this == other)) {
		return true;
	}
	if((other == null)) {
		return false;
	}
	if(!(other instanceof BookID)) {
		return false;
	}
	
	BookID castOther = (BookID) other;
	
	return((this.getisbn() == castOther.getisbn()) || 
			(this.getisbn() != null && 
			castOther.getisbn() != null &&
			this.getisbn().equals(castOther.getisbn()
					)
			)
			&&
			(this.getbookcopy() == castOther.getbookcopy()) || 
			(this.getbookcopy() != null && 
			castOther.getbookcopy() != null &&
			this.getbookcopy().equals(castOther.getbookcopy()
					)
			)
			
			);
}
public int HachCode() {
	return super.hashCode();
}
}
