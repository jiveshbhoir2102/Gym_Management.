package services;
import java.util.Collection;
import java.util.LinkedHashMap;

import repository.PersonRepository;
import models.Person;

public class Person_Services implements PersonRepository{
	private LinkedHashMap<Integer,Person> Persons=new LinkedHashMap<>();

	@Override
	public Person addPerson(Person Person) {
		Persons.put(Person.getId(),Person);
		// TODO Auto-generated method stub
		return Persons.get(Person.getId());
	}

	@Override
	public Collection<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return this.Persons.values();
	}

	@Override
	public Person getPersonById(int id) throws Exception {
		Person p=Persons.get(id);
		if(p!=null)
			return p;
		else
			throw new Exception("Invalid id");
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePersonById(int id) throws Exception {
		// TODO Auto-generated method stub
		Person p=getPersonById(id);
		Persons.remove(id);
		
	}

	@Override
	public Person updatePersonById(Person Person) throws Exception {
		// TODO Auto-generated method stub
		Persons.put(Person.getId(),Person);
		return Persons.get(Person.getId());
	}

}
