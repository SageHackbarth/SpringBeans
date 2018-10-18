package beans;

public interface PersonService {
	public void addPoints(int id, int amount);
	public void subPoints(int id, int amount);
	public Person getPerson(int personId);
}
