package BookMyShow;

public class User {
	String name;
	
	User(String name){
		this.name=name;
	}
	void notify(String msg) {
		System.out.println(msg);
	}
}
