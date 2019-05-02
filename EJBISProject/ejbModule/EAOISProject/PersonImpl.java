package EAOISProject;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ejbModule.Person;
import ejbModule.Reserve;

/**
 * Session Bean implementation class Person
 */
@Stateless
@LocalBean
public class PersonImpl implements PersonLocal {
	@PersistenceContext(unitName="ISEJBSql")
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public PersonImpl() {
        // TODO Auto-generated constructor stub
    }
    
    public Person CreatePerson(Person person) {
    	em.persist(person);
    	return person; 
    }

}
