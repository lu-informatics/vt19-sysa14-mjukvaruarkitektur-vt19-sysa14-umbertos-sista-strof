package EAOISProject;

import java.util.List;

import javax.ejb.Local;

import ejbModule.Person;

@Local
public interface PersonLocal {
	public Person CreatePerson(Person person);
	public List<Person> CheckPassword(String email);

}
