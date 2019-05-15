package sessionBeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Person;


@Stateless
@LocalBean
public class PersonImpl implements PersonLocal {
	@PersistenceContext(unitName="ISEJBSql")
	private EntityManager em;
	String result = new String();

    public PersonImpl() {
    }
    
    //Create a person with persist
    public void createPerson(Person person) {
    	em.persist(person);
    }
    
    //Finds a password with email
    public String checkPassword(String email) {
    	TypedQuery<Person> query = em.createNamedQuery("Person.FindByEmail", Person.class);
    	query.setParameter("email", email);
    	Person person = query.getSingleResult(); 
    	result = person.getPassword();
    	return result;
    }
    
    //Finds a persons ID with Email
    public String findPersonID(String email) {
    	TypedQuery<Person> query = em.createNamedQuery("Person.FindByEmail", Person.class);
    	query.setParameter("email", email);
    	Person person = query.getSingleResult(); 
    	result = person.getId();
    	return result;
    }
}
