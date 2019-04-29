package EAOISProject;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ejbModule.Book;
import ejbModule.Reserve;

/**
 * Session Bean implementation class ReserveImpl
 */
@Stateless
@LocalBean
public class ReserveImpl implements ReserveLocal {
	@PersistenceContext(unitName="ISEJBSql")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public ReserveImpl() {
        // TODO Auto-generated constructor stub
    }
    
    public Reserve CreateReserve(Reserve reserve) {
    	em.persist(reserve);
    	return reserve; 
    }
    
    public List<Reserve> PersonReserve(String id){
    	TypedQuery<Reserve> query = em.createNamedQuery("Reserve.findReserve", Reserve.class);
    	query.setParameter("PersonID", id);
    	
    	List<Reserve> results = query.getResultList();
    	return results;
    }
    

}
