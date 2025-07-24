package ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {
	
	// manages all my elevators
	
	private List<Elevator> elevators;
	private List<Floor> floors;
	private SchedulingStrategy strategy;
	private int currentElevatorId;
	
	ElevatorController(int numberOfElevators, int no_floors){
		this.elevators = new ArrayList<>();
		this.floors = new ArrayList<>();
		this.strategy = new ScanStrategy();
		
		for(int i=0;i<numberOfElevators;i++) {
			elevators.add(new Elevator(i));
		}
		for(int i=0;i<no_floors;i++) {
			floors.add(new Floor(i));
		}
	}
	
	public void requestFloor(int elevatorId, int floor) {
		// handle internal request 	
		System.out.println("Internal request - Floor " + floor);
		
		Elevator elevator = getElevatorById(elevatorId);
		
		Direction dir = elevator.getDirection();
		elevator.addRequest(new ElevatorRequest(elevatorId,floor,dir,true));
		
	}
	
	public void requestElevator(int elevatorId, int floor, Direction dir) {
		
		// handling request from external
		// logic to get the free lift or left closer to current floor
		
		System.out.println("External request - Floor " + floor + "Direction : "+ dir);
		
		Elevator selectedElevator = getElevatorById(elevatorId); // get elevator by strategy here
		
		if(selectedElevator!=null) {
			selectedElevator.addRequest(new ElevatorRequest(elevatorId,floor,dir,false));
			System.out.println("Assigned Elevator - "+ elevatorId + " for Floor  - " + floor);
		}
		else {
			System.out.println("No elevator avialable for floor "+ floor);
		}
	}
	
	public void step() {
		// will perform the pending requests
		
		for(Elevator elevator : elevators) {
			if(!elevator.getRequest().isEmpty()) {
				
				int nextStop = strategy.getNextStop(elevator);
				
				if(elevator.getCurrentFloor()!=nextStop) {
					elevator.moveToNextStop(nextStop);
				}
			}
		}
	}
	
	public Elevator getElevatorById(int id) {
		
		for(Elevator el:elevators) {
			if(el.getId()==id) return el;
		}
		return null;
	}
	public List<Elevator> getElevators() {
		return elevators;
	}
	public void setElevators(List<Elevator> elevators) {
		this.elevators = elevators;
	}
	public List<Floor> getFloors() {
		return floors;
	}
	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	}
	public SchedulingStrategy getStrategy() {
		return strategy;
	}
	public void setStrategy(SchedulingStrategy strategy) {
		this.strategy = strategy;
	}
	public int getCurrentElevatorId() {
		return currentElevatorId;
	}
	public void setCurrentElevatorId(int currentElevatorId) {
		this.currentElevatorId = currentElevatorId;
	}
	
	
	

}
