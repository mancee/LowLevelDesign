package ParkingLotPractice;

public class ElectricCar extends Vehicle{
	
	private int percentage;
	
	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	ElectricCar(String license, VehicleType type) {
		super(license, type,100);
	}

}
