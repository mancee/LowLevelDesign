package ParkingLotPractice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingFloor {
	
	private int floor;
	private List<ParkingSpot> spots;
	private HashMap<VehicleType,List<ParkingSpot>> nextAvailable;
	
	ParkingFloor(int floor, int numSpots){
		this.setFloor(floor);
		this.spots = new ArrayList<>();
		nextAvailable = new HashMap<>();
		List<ParkingSpot> bikes = new ArrayList<>();
		List<ParkingSpot> cars = new ArrayList<>();
		List<ParkingSpot> trucks = new ArrayList<>();
		List<ParkingSpot> electricCars = new ArrayList<>();
		List<ParkingSpot> handicapped = new ArrayList<>();
		
		int i=0;
		for(;i<numSpots;i++) {
			bikes.add(new ParkingSpot(i+1,VehicleType.BIKE));
		}
		for(;i<numSpots*2;i++) {
			cars.add(new ParkingSpot(i+1,VehicleType.CAR));
		}
		for(;i<numSpots*3;i++) {
			trucks.add(new ParkingSpot(i+1,VehicleType.TRUCK));
		}
		for(;i<numSpots*4;i++) {
			electricCars.add(new ParkingSpot(i+1,VehicleType.ELECTRICCAR));
		}
		for(;i<numSpots*5;i++) {
			handicapped.add(new ParkingSpot(i+1,VehicleType.HANDICAPPED));
		}
		
		nextAvailable.put(VehicleType.BIKE, bikes);
		nextAvailable.put(VehicleType.CAR, cars);
		nextAvailable.put(VehicleType.TRUCK, trucks);
		nextAvailable.put(VehicleType.ELECTRICCAR, electricCars);
		nextAvailable.put(VehicleType.HANDICAPPED, handicapped);
		spots.addAll(bikes);
		spots.addAll(cars);
		spots.addAll(trucks);
		spots.addAll(electricCars);
		spots.addAll(handicapped);
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public boolean parkVehicle(Vehicle vehicle) {
		if(nextAvailable.get(vehicle.getType()).size()==0) return false;
		ParkingSpot nextAvailableSpot = nextAvailable.get(vehicle.getType()).get(0);
		nextAvailableSpot.parkVehicle(vehicle);
		nextAvailable.get(vehicle.getType()).remove(0);
		nextAvailableSpot.setAvailable(false);
		vehicle.setStart(LocalDateTime.now().minusHours(1));
		return true;
	}
	
	public boolean unParkVehicle(Vehicle vehicle) {
		
		for(ParkingSpot spot: spots) {
			if(!spot.isAvailable() && vehicle.getType().equals(spot.getType())) {
				spot.setAvailable(true);
				
				// generate ticket and checkout payment
				int hours = (int)(Duration.between(vehicle.getStart(),LocalDateTime.now()).toHours());
				ParkingTicket ticket = new ParkingTicket(vehicle.getBasePrice(),hours);
				vehicle.assignTicket(ticket);
				return true;
			}
		}
		return false;
	}
	
	public void displayAvailability() {
		
		for(VehicleType type : nextAvailable.keySet()) {
			System.out.println(type + " -> "+ nextAvailable.get(type));
		}
	}
}
