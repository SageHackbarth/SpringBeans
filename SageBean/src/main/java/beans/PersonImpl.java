package beans;

public class PersonImpl implements PersonService {
	private PersonDao personDao;

	public PersonImpl(PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public PersonDao getPersonDao() {
		return personDao;
	}
	
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public void addPoints(int id, int amount) {
		Person targetPerson = personDao.find(id);
		
		targetPerson.setPoints(targetPerson.getPoints() + amount);
		
		personDao.update(targetPerson);
		
	}

	public void subPoints(int id, int amount) {
		Person targetPerson = personDao.find(id);
		
		targetPerson.setPoints(targetPerson.getPoints() - amount);
		
		personDao.update(targetPerson);
		
	}

	public Person getPerson(int personId) {
		return personDao.find(personId);
	}

}
