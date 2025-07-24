package RideSharingApp;

enum RideStatus{
	PENDING, ONGOING, COMPLETED
}

public class Ride {
	
	private Passenger passenger;
	private Driver driver;
	private double distance;
	private fareStrategy farestrategy;
	private double fare;
	private RideStatus status;
	
	public double getFare() {
		return fare;
	}
	
	Ride(Passenger passenger, Driver driver, double distance, fareStrategy strategy){
		this.passenger = passenger;
		this.driver = driver;
		this.distance = distance;
		this.farestrategy = strategy;
		this.status = RideStatus.PENDING;
	}
	
	public void calculateFare() {
		this.fare = farestrategy.calcFare(driver.getVehicle() , distance);
	}
	
	public void updateStatus(RideStatus status) {
		this.status = status;
		notifyUsers();
	}
	public void notifyUsers() {
		passenger.notify("Your ride is " + status);
		driver.notify("Ride status :"+ status);
	}
}
