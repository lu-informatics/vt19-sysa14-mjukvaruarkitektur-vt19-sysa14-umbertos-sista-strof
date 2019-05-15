package sessionBeans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Reserve;


@Stateless
@LocalBean
public class ReserveImpl implements ReserveLocal {
	@PersistenceContext(unitName="ISEJBSql")
	private EntityManager em;
	List<Reserve> results = null;


    public ReserveImpl() {
    }
    //Create reservation with persist
    public void createReserve(Reserve reserve) {
    	em.persist(reserve);
    }
    
    //Deletes a persons reservation
    public void deleteReserve(Reserve reserve) {
    	Reserve reserved = em.find(Reserve.class, reserve.getBookID());
    	em.remove(reserved);
    }
    
    //Finds all person reservations
    public List<Reserve> personReserve(String id){
    	TypedQuery<Reserve> query = em.createNamedQuery("Reserve.findReserve", Reserve.class);
    	query.setParameter("PersonID", id);
    	results = query.getResultList();
    	return results;
    } 
}
