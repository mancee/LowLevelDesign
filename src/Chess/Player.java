package Chess;

class Person{
	protected String name, email;
	protected int age;
	
	public Person(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
}

public class Player{
	private Person person;
	//private int rank;
	private boolean isWhiteSide=false;
	
	public Player(Person person, boolean isWhiteSide) {
		this.setPerson(person);
		this.isWhiteSide = isWhiteSide;
	}
	
	public boolean isWhiteSide() {
		return this.isWhiteSide ==true;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
