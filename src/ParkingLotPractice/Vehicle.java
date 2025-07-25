package ParkingLotPractice;

import java.time.LocalDateTime;

enum VehicleType{
	CAR, TRUCK, BIKE, ELECTRICCAR, HANDICAPPED
}

public abstract class Vehicle {
	
	private String licenseNumber;
	private VehicleType type;
	private ParkingTicket ticket;
	private int basePrice;
	private LocalDateTime start, end;
	
	Vehicle(String license, VehicleType type, int base){
		this.licenseNumber = license;
		this.type = type;
		this.setBasePrice(base);
	}
	
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
	
	public void assignTicket(ParkingTicket ticket) {
		this.ticket = ticket;
		
	}
	public ParkingTicket getTicket() {
		return this.ticket;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

}
