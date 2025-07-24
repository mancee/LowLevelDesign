package ParkingLotPractice;

public class ParkingSpot {
	
	private int id;
	private boolean available;
	private VehicleType type;
	private Vehicle vehicle;
	
	ParkingSpot(int id,VehicleType type){
		this.setId(id);
		this.type = type;
		this.available = true;
	}

	public synchronized boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}
	
	public synchronized boolean parkVehicle(Vehicle vehicle) {
		if(isAvailable() && this.type == vehicle.getType()) {
			this.setVehicle(vehicle);
			return true;
		}
		return false;
	}
	
	public synchronized void unParkVehicle(Vehicle vehicle) {
		vehicle = null;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
