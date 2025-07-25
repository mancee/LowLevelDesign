package RideSharingApp;

public interface fareStrategy {
	
	double calcFare(Vehicle vehicle, double distance); 
}

class StandardFare implements fareStrategy{

	@Override
	public double calcFare(Vehicle vehicle, double distance) {
		// TODO Auto-generated method stub
		return vehicle.baseFarePerKm() * distance;
	}
	
}

class SharedFare implements fareStrategy{

	@Override
	public double calcFare(Vehicle vehicle, double distance) {
		// TODO Auto-generated method stub
		return vehicle.baseFarePerKm() * distance * 0.5;
	}
	
}

class LuxuryFare implements fareStrategy{

	@Override
	public double calcFare(Vehicle vehicle, double distance) {
		// TODO Auto-generated method stub
		return vehicle.baseFarePerKm() * distance * 1.5;
	}
	
}