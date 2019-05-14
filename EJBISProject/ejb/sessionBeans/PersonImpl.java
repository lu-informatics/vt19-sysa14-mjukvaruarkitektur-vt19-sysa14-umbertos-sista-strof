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
    	try {
    	em.persist(person); 
    	}
    	catch (Exception e) {
    		System.out.println(e);
    	}
    }
    
    //Finds a password with email
    public String checkPassword(String email) {
    	try {
    	TypedQuery<Person> query = em.createNamedQuery("Person.FindByEmail", Person.class);
    	query.setParameter("email", email);
    	Person person = query.getSingleResult(); 
    	result = person.getPassword();
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	return result;

    }
    
    //Finds a persons ID with Email
    public String findPersonID(String email) {
    	try {
    	TypedQuery<Person> query = em.createNamedQuery("Person.FindByEmail", Person.class);
    	query.setParameter("email", email);
    	Person person = query.getSingleResult(); 
    	result = person.getId();
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
    	return result;
    }
}
