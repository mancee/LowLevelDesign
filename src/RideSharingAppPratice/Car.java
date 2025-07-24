package RideSharingAppPratice;

public class Car extends Vehicle{
	
	private int basePerKm;

	public Car(String license) {
		this.setLicenseNumber(license);
		this.basePerKm = 30;
	}

	public int getBasePerKm() {
		return basePerKm;
	}

	public void setBasePerKm(int basePerKm) {
		this.basePerKm = basePerKm;
	}
}
