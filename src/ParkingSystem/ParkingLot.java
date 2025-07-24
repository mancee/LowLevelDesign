package ParkingSystem;

import java.util.HashMap;

public class ParkingLot {
	private String name, address;
	private double parkingRate;
	
	private int compactCount, largeCount, motorbikeCount, electricCount, handicappedCount;
	private final int maxCompactCount, maxLargeCount, maxMotorbikeCount, maxElectricCount, maxHandicappedCount;
	
	private HashMap<String, EntrancePanel> entrancepanels;
	private HashMap<String, ExitPanel> exitpanels;
	private HashMap<String, ParkingFloor> parkingFloors;
	
	private HashMap<String,ParkingTicket> activeTickets;
	
	// singleton parkingLot to ensure only one object of parking lot in the system
	// all entrance panels will use this lot to generate new parking tickets
	// similarly all exit panels use this object to close the tickets
	
	private static ParkingLot parkingLot = null;
	
	// private constructor to restrict for singleton
	private ParkingLot() {
		// initialise name, address and rate from db 
		this.name = "-------------MANSI'S PARKING SYSTEM ------------";
		this.address = "Skanda Sukriti, Kaverappa Layout, Bangalore ";
		this.parkingRate = 100.00;
		
		// initialsize parking floors;
		parkingFloors  = new HashMap<>();
		parkingFloors.put("Level -1",new ParkingFloor("Level -1"));
		parkingFloors.put("Level 0",new ParkingFloor("Level 0"));
		parkingFloors.put("Level 1",new ParkingFloor("Level 1"));
		
		// how many max spots per floor - assume 10 spots per category
		this.maxCompactCount = 30;
		this.maxElectricCount = 30;
		this.maxHandicappedCount = 30;
		this.maxLargeCount = 30;
		this.maxMotorbikeCount = 30;
		this.compactCount = 0;
		this.electricCount = 0;
		this.largeCount = 0;
		this.handicappedCount = 0;
		this.motorbikeCount = 0;
		
		this.entrancepanels = new HashMap<>();
		entrancepanels.put("Level 0.1", new EntrancePanel());
		entrancepanels.put("Level 0.2", new EntrancePanel());
		
		this.exitpanels = new HashMap<>();
		exitpanels.put("Level 0.1", new ExitPanel());
		exitpanels.put("Level 0.2", new ExitPanel());
		
	}
	
	public static ParkingLot getInstance() {
		if(parkingLot ==null) {
			parkingLot = new ParkingLot();
		}
		return parkingLot;
	}
	
	
	// synchronized method to allow multiple entrance panels to issue a new parking ticket without interfering with each other.
	
	public synchronized ParkingTicket getNewParkingTicket(Vehicle vehicle) throws ParkingFullException {
		if(this.isFull(vehicle.getType())) {
			throw new ParkingFullException();
		}
		ParkingTicket ticket = new ParkingTicket();
		vehicle.assignTicket(ticket);
		this.incrementSpotCount(vehicle);
		this.activeTickets.put(ticket.getTicketNumber(), ticket);
		return ticket;
	}
	
	private boolean incrementSpotCount(Vehicle vehicle) {
		
		if(vehicle.getType()==VehicleType.TRUCK || vehicle.getType()==VehicleType.VAN) {
			largeCount++;
		}
		else if(vehicle.getType()==VehicleType.CAR) {
			compactCount++;
		}
		else if(vehicle.getType()==VehicleType.MOTORBIKE) {
			motorbikeCount++;
		}
		else if(vehicle.getType()==VehicleType.HANDICAPPED) {
			handicappedCount++;
		}
		else if(vehicle.getType()==VehicleType.ELECTRIC) {
			electricCount++;
		}
		return true;
	}

	private boolean isFull(VehicleType type) {
		if(type == VehicleType.TRUCK || type == VehicleType.VAN) {
			return largeCount >= maxLargeCount;
		}
		// cars can be parked at both large and compact spots
		else if(type == VehicleType.CAR) {
			return compactCount + largeCount >= maxLargeCount + maxCompactCount;
		}
		else if(type == VehicleType.MOTORBIKE) {
			return motorbikeCount >= maxMotorbikeCount;
		}
		else if(type == VehicleType.HANDICAPPED) {
			return handicappedCount >= maxHandicappedCount;
		}
		else if(type == VehicleType.ELECTRIC) {
			return compactCount + largeCount + electricCount >= maxCompactCount + maxElectricCount + maxLargeCount;
		}
		return false;
	}
	
	private boolean isFull() {
		for(String key: parkingFloors.keySet()) {
			if(!parkingFloors.get(key).isFull()) {
				return false;
			}
		}
		return true;
	}
	
}
