package RideSharingApp;

import java.util.ArrayList;
import java.util.List;

// mediator btw three types of objects - ride, passenger, driver
public class RideMatchingSystem {
	
	List<Driver> availableDrivers = new ArrayList<>();
	
	void addDriver(Driver driver) {
		availableDrivers.add(driver);
	}
	
	public void requestRide(Passenger passenger, double distance, fareStrategy farestrategy) {
		
		// check if drivers are available
		if(availableDrivers.size()==0) {
			passenger.notify("Drivers are not available for this Ride. Sorry for inconvenience !");
			return;
		}
		
		// find nearest driver
		Driver nearestDriver = nearestDriver(passenger.getLocation());
//		passenger.notify("Driver has been successfully assigned for your ride!" + nearestDriver);
		
		// remove the driver from available list
		availableDrivers.remove(nearestDriver);
		Ride ride = new Ride(passenger, nearestDriver, distance, farestrategy);
		ride.calculateFare();
		
		passenger.notify("Ride scheduled with Fare" + ride.getFare());
		nearestDriver.notify("You have a new ride request for " + ride.getFare());
		
		ride.updateStatus(RideStatus.ONGOING);   // observer pattern
		
		ride.updateStatus(RideStatus.COMPLETED);  // observer pattern
		availableDrivers.add(nearestDriver);
		
	}
	
	private Driver nearestDriver(Location passengerLocation) {
		
		int miniDistance = Integer.MAX_VALUE;
		Driver assignedDriver = null;
		for(Driver driver : availableDrivers) {
			double currdistance = driver.getLocation().calcDistance(passengerLocation);
			if( currdistance < miniDistance) {
				currdistance = miniDistance;
				assignedDriver = driver;
			}
		}
		return assignedDriver;
	}
	
}
