package sessionBeans;

import java.util.List;

import javax.ejb.Local;

import entities.Loaning;

@Local
public interface LoaningLocal {
	public List<Loaning> personLoans(String id);
}
