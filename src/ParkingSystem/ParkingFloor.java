package ParkingSystem;

import java.util.HashMap;

public class ParkingFloor {
	private String name;
	private ParkingDisplayBoard board;
	private HashMap<String,HandicappedSpot> handicappedSpots;
	private HashMap<String,ElectricSpot> electricSpots;
	private HashMap<String,LargeSpot> largeSpots;
	private HashMap<String,CompactSpot> compactSpots;
	private HashMap<String,MotorbikeSpot> motorbikeSpots;
	private int freeHandicappedSpots, freeElectricSpots, freeMotorbikeSpots, freeLargeSpots, freeCompactSpots; 
	
	ParkingFloor(String name){
		this.name = name;
		this.handicappedSpots = new HashMap<>();
		this.electricSpots = new HashMap<>();
		this.largeSpots = new HashMap<>();
		this.compactSpots = new HashMap<>();
		this.motorbikeSpots = new HashMap<>();
	}
	
	public int getFreeHandicappedSpots() {
		return freeHandicappedSpots;
	}

	public int getFreeElectricSpots() {
		return freeElectricSpots;
	}

	public int getFreeMotorbikeSpots() {
		return freeMotorbikeSpots;
	}

	public int getFreeLargeSpots() {
		return freeLargeSpots;
	}

	public int getFreeCompactSpots() {
		return freeCompactSpots;
	}

	public void addParkingSpot(ParkingSpot spot) {
		switch(spot.getType()) {
		case ParkingSpotType.HANDICAPPED:
			handicappedSpots.put(spot.getNumber(), (HandicappedSpot) spot);
			freeHandicappedSpots++;
			break;
		case ParkingSpotType.ELECTRIC:
			electricSpots.put(spot.getNumber(), (ElectricSpot) spot);
			freeElectricSpots++;
			break;
		case ParkingSpotType.MOTORBIKE:
			motorbikeSpots.put(spot.getNumber(), (MotorbikeSpot) spot);
			freeMotorbikeSpots++;
			break;
		case ParkingSpotType.LARGE:
			largeSpots.put(spot.getNumber(), (LargeSpot) spot);
			freeLargeSpots++;
			break;
		case ParkingSpotType.COMPACT:
			compactSpots.put(spot.getNumber(), (CompactSpot) spot);
			freeCompactSpots++;
			break;
		default:
			System.out.println("Invalid Spot Type! ");
			break;
		}
	}
	
	public void removeParkingSpot(ParkingSpot spot) {
		
	}
	
	public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
		
		if(!spot.isFree()) {
			System.out.println("This Spot is already occupied! Please find some other spot...");
		}
//		if(spot.getType()!=vehicle.getType()) {
//			System.out.println("This spot is not for - "+ vehicle.getType());
//		}
		spot.assignVehicle(vehicle);
		
		switch(spot.getType()) {
		case ParkingSpotType.HANDICAPPED:
			updateDisplayBoardHandicapped(spot);
			freeHandicappedSpots--;
			break;
		case ParkingSpotType.MOTORBIKE:
			updateDisplayBoardMotorbike(spot);
			freeMotorbikeSpots--;
			break;
		case ParkingSpotType.ELECTRIC:
			updateDisplayBoardElectric(spot);
			freeElectricSpots--;
			break;
		case ParkingSpotType.COMPACT:
			updateDisplayBoardCompact(spot);
			freeCompactSpots--;
			break;
		case ParkingSpotType.LARGE:
			updateDisplayBoardLarge(spot);
			freeLargeSpots--;
			break;
		default:
			System.out.println("Wrong Parking Spot Type!");
			break;
		
		}
	}
	
	public void freeSpot(ParkingSpot spot) {
		// remove vehicle from the spot
		
		spot.removeVehicle();
		
		switch(spot.getType()) {
		case ParkingSpotType.HANDICAPPED:
			freeHandicappedSpots++;
			break;
		case ParkingSpotType.MOTORBIKE:
			freeMotorbikeSpots++;
			break;
		case ParkingSpotType.ELECTRIC:
			freeElectricSpots++;
			break;
		case ParkingSpotType.COMPACT:
			freeCompactSpots++;
			break;
		case ParkingSpotType.LARGE:
			freeLargeSpots++;
			break;
		default:
			System.out.println("Wrong Parking Spot Type!");
			break;
		
		}
		
	}
	
	private void updateDisplayBoardHandicapped(ParkingSpot spot) {
		
		if(this.board.getHandicappedFreeSpot().getNumber() == spot.getNumber()) {
			// get next free spot and update the display board
			for(String key:handicappedSpots.keySet()) {
				if(handicappedSpots.get(key).isFree()) {
					this.board.setHandicappedFreeSpot(handicappedSpots.get(key));
				}
			}
		}
	}
	
	private void updateDisplayBoardElectric(ParkingSpot spot) {
		
		if(this.board.getElectricFreeSpot().getNumber() == spot.getNumber()) {
			// get next free spot and update the display board
			for(String key:electricSpots.keySet()) {
				if(handicappedSpots.get(key).isFree()) {
					this.board.setElectricFreeSpot(electricSpots.get(key));
				}
			}
		}
	}
	
	private void updateDisplayBoardMotorbike(ParkingSpot spot) {
		
		if(this.board.getMotorbikeFreeSpot().getNumber() == spot.getNumber()) {
			// get next free spot and update the display board
			for(String key:motorbikeSpots.keySet()) {
				if(motorbikeSpots.get(key).isFree()) {
					this.board.setMotorbikeFreeSpot(motorbikeSpots.get(key));
				}
			}
		}
	}
	
	private void updateDisplayBoardCompact(ParkingSpot spot) {
		
		if(this.board.getCompactFreeSpot().getNumber() == spot.getNumber()) {
			// get next free spot and update the display board
			for(String key:compactSpots.keySet()) {
				if(compactSpots.get(key).isFree()) {
					this.board.setCompactFreeSpot(compactSpots.get(key));
				}
			}
		}
	}
	
	private void updateDisplayBoardLarge(ParkingSpot spot) {
	
		if(this.board.getLargeFreeSpot().getNumber() == spot.getNumber()) {
			// get next free spot and update the display board
			for(String key:largeSpots.keySet()) {
				if(largeSpots.get(key).isFree()) {
					this.board.setLargeFreeSpot(largeSpots.get(key));
				}
			}
		}
	}
	
	
	public ParkingDisplayBoard getBoard() {
		return board;
	}

	public String getName() {
		return name;
	}
	
	public boolean isFull() {
		return freeHandicappedSpots ==0  && freeElectricSpots ==0 && freeCompactSpots ==0 && freeLargeSpots==0 && freeMotorbikeSpots==0;
	}
	

}
