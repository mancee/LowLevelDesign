package RideSharingAppPratice;

public class Driver extends Account{
	
	private Vehicle vehicle;
	
	Driver(String user, String pass, String email, Vehicle vehicle, Location loc) {
		super(user, pass, email);
		this.setVehicle(vehicle);
		this.setLocation(loc);
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	
	
	
}
