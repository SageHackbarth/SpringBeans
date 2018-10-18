package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonDaoMemory implements PersonDao{
	private Map<Long, Person> accountsMap = new HashMap<Long, Person>();
	{
		Person person1 = new Person(1, "Sage", "Hackbarth", 10);
		Person person2 = new Person(2, "Mary", "Jane", 20);
		
		accountsMap.put(person1.getId(), person1);
		accountsMap.put(person2.getId(), person2);
	}
	public void insert(Person person) {
		accountsMap.put(person.getId(), person);
		
	}

	public void update(Person person) {
		accountsMap.put(person.getId(), person);
		
	}

	public void update(List<Person> persons) {
		for(Person person : persons) {
			update(person);
		}
		
	}

	public void delete(long personId) {
		accountsMap.remove(personId);
		
	}

	public Person find(long personId) {
		return accountsMap.get(personId);
	}

	public List<Person> find(List<Long> personIds) {
		List<Person> persons = new ArrayList<Person>();
		for(Long id : personIds) {
			persons.add(accountsMap.get(id));
		}
		return persons;
	}

	public List<Person> find(String fName) {
		List<Person> persons = new ArrayList<Person>();
		for(Person person : accountsMap.values()) {
			if(fName.equals(person.getfName())) {
				persons.add(person);
			}
		}
		return persons;
	}

}
