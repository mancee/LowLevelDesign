package RideSharingApp;

public class Passenger extends User{

	Passenger(String name, String email, Location location) {
		super(name, email, location);
	}

	@Override
	public void notify(String msg) {
		System.out.println("Passenger : " + msg);
		
	}
	
}
