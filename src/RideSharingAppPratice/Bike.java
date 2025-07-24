package RideSharingAppPratice;

public class Bike extends Vehicle{
	
	private int basePerKm;

	public Bike(String license) {
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
