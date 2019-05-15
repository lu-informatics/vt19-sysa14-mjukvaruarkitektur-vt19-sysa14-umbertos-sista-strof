package sessionBeans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Loaning;


@Stateless
@LocalBean
public class LoaningImpl implements LoaningLocal {
	@PersistenceContext(unitName="ISEJBSql")
	private EntityManager em;
	List<Loaning> results = null;

    public LoaningImpl() {

    }
    
    //Find all loans that belongs to a person with ID
    public List<Loaning> personLoans(String id){
    	TypedQuery<Loaning> query = em.createNamedQuery("Loaning.findLoan", Loaning.class);
    	query.setParameter("PersonID", id);
    	results = query.getResultList();
    	return results;
    	
    }

}
