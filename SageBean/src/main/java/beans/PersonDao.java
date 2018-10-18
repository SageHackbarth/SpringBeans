package beans;

import java.util.List;

public interface PersonDao {
	public void insert(Person person);
	public void update(Person person);
	public void update(List<Person> persons);
	public void delete(long personId);
	public Person find(long personId);
	public List<Person> find(List<Long> personIds);
	public List<Person> find(String fName);
}
