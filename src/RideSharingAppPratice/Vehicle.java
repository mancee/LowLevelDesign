package RideSharingAppPratice;

public abstract class Vehicle {
	
	private String licenseNumber;
	private int basePerKm;

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public int getBasePerKm() {
		return basePerKm;
	}

	public void setBasePerKm(int basePerKm) {
		this.basePerKm = basePerKm;
	}
	
}
