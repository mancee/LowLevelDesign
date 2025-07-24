package RideSharingApp;

// LisKov principle
abstract class Vehicle {
	
	protected String numberPlate;
	
	Vehicle(String numberPlate){
		this.numberPlate = numberPlate;
	}
	public abstract int baseFarePerKm();
}
