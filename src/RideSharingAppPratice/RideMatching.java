package RideSharingAppPratice;

import java.util.ArrayList;
import java.util.List;

public class RideMatching {
	
	private User passenger;
	private List<Driver> availableDriver = new ArrayList<>();
	
	void rideMatch(User pass, Fare fare, Location loc) {
		
		Driver assignedDriver = null;
		double dist = Double.MAX_VALUE;
		for(Driver driver : availableDriver) {
			double currDist = pass.getLocation().calculateDistance(driver.getLocation());
			if( currDist < dist) {
				dist = currDist;
				assignedDriver = driver;
			}
		}
		
		// notifyUser
		
		Ride ride = new Ride(pass,assignedDriver,fare);
		
		availableDriver.remove(assignedDriver);
		
		// get fare 
		double fareCharges = ride.calculateFare();
		
		// payment 
		
		// after completion
		availableDriver.add(assignedDriver);
	}
	
	void addDriver(Driver driver) {
		availableDriver.add(driver);
	}
}
