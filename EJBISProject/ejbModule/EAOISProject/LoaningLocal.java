package EAOISProject;

import java.util.List;

import javax.ejb.Local;

import ejbModule.Loaning;

@Local
public interface LoaningLocal {
	public List<Loaning> PersonLoans(String id);
}
