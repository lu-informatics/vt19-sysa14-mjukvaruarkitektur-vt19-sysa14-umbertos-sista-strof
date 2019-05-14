package sessionBeans;

import java.util.List;

import javax.ejb.Local;

import entities.Reserve;

@Local
public interface ReserveLocal {
	public void createReserve(Reserve reserve);
	public void deleteReserve(Reserve reserve);
	public List<Reserve> personReserve(String id);
	
}
