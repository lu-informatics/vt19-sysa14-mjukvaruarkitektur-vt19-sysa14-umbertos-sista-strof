package EAOISProject;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ejbModule.Person;

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
    public String CheckPassword(String email) {
    	TypedQuery<Person> query = em.createNamedQuery("Person.FindByEmail", Person.class);
    	query.setParameter("email", email);
    	Person person = query.getSingleResult(); 
    	String password = person.getPassword();
    	return password;

    }
    public String FindPersonID(String email) {
    	TypedQuery<Person> query = em.createNamedQuery("Person.FindByEmail", Person.class);
    	query.setParameter("email", email);
    	Person person = query.getSingleResult(); 
    	String id = person.getId();
    	return id;
    }
}
