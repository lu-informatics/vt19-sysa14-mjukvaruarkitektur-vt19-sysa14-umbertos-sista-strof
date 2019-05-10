package EAOISProject;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ejbModule.Loaning;
import ejbModule.Reserve;

/**
 * Session Bean implementation class LoaningImpl
 */
@Stateless
@LocalBean
public class LoaningImpl implements LoaningLocal {
	@PersistenceContext(unitName="ISEJBSql")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public LoaningImpl() {
        // TODO Auto-generated constructor stub
    }
    
    public List<Loaning> PersonLoans(String id){
    	TypedQuery<Loaning> query = em.createNamedQuery("Loaning.findLoan", Loaning.class);
    	query.setParameter("PersonID", id);
    	List<Loaning> results = query.getResultList();
    	return results;
    }

}
