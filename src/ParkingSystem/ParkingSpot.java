package ParkingSystem;

enum ParkingSpotType {
	HANDICAPPED, ELECTRIC, LARGE, MOTORBIKE, COMPACT
}

public abstract class ParkingSpot {
	
	private String number;
	private boolean free;
	private Vehicle vehicle;
	private final ParkingSpotType type;
	
	ParkingSpot(ParkingSpotType type){
		this.type = type;
	}
	
	public boolean assignVehicle(Vehicle vehicle) {
		// check if vehicle type aligns with parking spot , if not return false
		this.vehicle = vehicle;
		free = false;
		return true;
	}
	
	public boolean isFree() {
		return free;
	}
	
	public boolean removeVehicle() {
		this.vehicle = null;
		this.free = true;
		return true;
	}

	public ParkingSpotType getType() {
		return type;
	}

	public String getNumber() {
		return number;
	}
}
