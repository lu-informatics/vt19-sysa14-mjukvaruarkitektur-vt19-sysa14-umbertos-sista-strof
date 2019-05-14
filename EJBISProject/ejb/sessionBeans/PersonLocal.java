package sessionBeans;


import javax.ejb.Local;

import entities.Person;

@Local
public interface PersonLocal {
	public void createPerson(Person person);
	public String checkPassword(String email);
	public String findPersonID(String email);

}
