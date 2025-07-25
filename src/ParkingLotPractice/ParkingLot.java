package ParkingLotPractice;

import java.util.HashMap;

public class ParkingLot {
	
	private HashMap<Integer,ParkingFloor> floors;
	private String name, address;
	
	
	private static ParkingLot instance = null;
	
	private ParkingLot() {
		floors = new HashMap<>();
		
	}
	public static ParkingLot getInstance() {
		if(instance==null) {
			instance = new ParkingLot();
		}
		return instance;
	}
	
	public void addFloor(int num) {
		floors.put(num, new ParkingFloor(num,2));
	}
	
	public void parkVehicle(Vehicle vehicle) {
		boolean parked=false;
		for(int floor: floors.keySet()) {
			if(floors.get(floor).parkVehicle(vehicle)) {
				System.out.println(vehicle.getType()+" is parked succesfully!");
				parked=true;
				break;
			}
		}
		if(!parked) System.out.println("Parking is full currently!");
	}
	
	public boolean unParkVehicle(Vehicle vehicle) {
		for(int floor: floors.keySet()) {
			if(floors.get(floor).unParkVehicle(vehicle)) {
				System.out.println(vehicle.getType()+" is unparked succesfully!");
				return true;
			}
		}
		return false;
	}
	
	public void displayBoard() {
		for(int floor: floors.keySet()) {
			floors.get(floor).displayAvailability();
		}
	}
}
