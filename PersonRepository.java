package repository;
import java.util.Collection;
import models.Person;
public interface PersonRepository {
	public Person addPerson(Person Person);
	public Collection<Person>getAllPersons();
	public Person getPersonById(int id) throws Exception;
	public void deletePersonById(int id) throws Exception;
	public  Person updatePersonById(Person Person) throws Exception;

}