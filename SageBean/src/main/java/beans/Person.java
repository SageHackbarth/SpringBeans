package beans;

public class Person {
	public int id;
	public String fName;
	public String lName;
	public int heigth;
	public int points;
	
	public Person(int id, String fName, String lName, int heigth) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.heigth = heigth;
	}
	
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
}
