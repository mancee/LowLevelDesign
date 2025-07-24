package RideSharingApp;

public class Client {
	
	public static void main(String[] args) {
		Location loc1 = new Location(12.9716,77.5946);
		Location loc2 = new Location(12.9352,77.6245);
		Location loc3 = new Location(13.0352,77.6175);
		
		Vehicle bike = new Bike("QWXV5678");
		Vehicle car = new Car("DAGH1290");
		
		Driver driver1 = new Driver("Alice","alice@gmail.com",loc1,car);
		Driver driver2 = new Driver("Bob","bob@gmail.com",loc3,bike);
		
		Passenger passenger1 = new Passenger("John","john@gmail.com",loc2);
		
		RideMatchingSystem rideMatchingSystem = new RideMatchingSystem();
		
		rideMatchingSystem.addDriver(driver1);
		rideMatchingSystem.addDriver(driver2);
		
		rideMatchingSystem.requestRide(passenger1,10,new StandardFare());
		
	}
	
}
