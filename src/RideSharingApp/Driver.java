package RideSharingApp;

public class Driver extends User{
	
	private Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	Driver(String name, String email, Location location, Vehicle vehicle){
		super(name, email, location);
		this.vehicle = vehicle;
	}

	@Override
	public void notify(String msg) {
		System.out.println("Driver : " + msg);
		
	}
	
}
