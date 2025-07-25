package ParkingSystem;

enum VehicleType{
	CAR, TRUCK, MOTORBIKE, ELECTRIC, HANDICAPPED, VAN
}

public abstract class Vehicle {
	private String number;
	private VehicleType type;
	private ParkingTicket ticket;
	private int basePrice;
	
	Vehicle(String number, VehicleType type){
		this.type = type;
		this.number = number;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}
	public void assignTicket(ParkingTicket ticket) {
		this.ticket = ticket;
	}

	public ParkingTicket getTicket() {
		return ticket;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
}	
