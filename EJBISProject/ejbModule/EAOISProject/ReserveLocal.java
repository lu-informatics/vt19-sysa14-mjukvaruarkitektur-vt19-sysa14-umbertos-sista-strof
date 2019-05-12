package EAOISProject;

import java.util.List;

import javax.ejb.Local;

import ejbModule.Reserve;

@Local
public interface ReserveLocal {
	public void CreateReserve(Reserve reserve);
	public void DeleteReserve(Reserve reserve);
	public List<Reserve> PersonReserve(String id);
	
}
