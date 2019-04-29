package EAOISProject;

import java.util.List;

import javax.ejb.Local;

import ejbModule.Reserve;

@Local
public interface ReserveLocal {
	public Reserve CreateReserve(Reserve reserve);
	public List<Reserve> PersonReserve(String id);

}
