package RideSharingAppPratice;

public class Ride {
	
	private User passenger;
	private Driver driver;
	private Fare fare;
	
	Ride(User Pass, Driver d, Fare f){
		this.setDriver(d);
		this.setPassenger(Pass);
		this.setFare(f);
	}
	
	public double calculateFare() {
		return this.driver.getVehicle().getBasePerKm()*this.fare.getFare();
	}

	public User getPassenger() {
		return passenger;
	}

	public void setPassenger(User passenger) {
		this.passenger = passenger;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Fare getFare() {
		return fare;
	}

	public void setFare(Fare fare) {
		this.fare = fare;
	}
}
