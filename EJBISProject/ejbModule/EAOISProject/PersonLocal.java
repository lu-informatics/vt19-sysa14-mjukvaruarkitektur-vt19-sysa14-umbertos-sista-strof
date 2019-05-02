package EAOISProject;

import javax.ejb.Local;

import ejbModule.Person;

@Local
public interface PersonLocal {
	public Person CreatePerson(Person person);

}
