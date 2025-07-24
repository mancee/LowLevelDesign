package ElevatorSystem;

import java.util.List;
import java.util.Queue;

public class Elevator {
	
	private Direction direction;
	private int id, currentFloor;
	private ElevatorState state;
	private List<ElevatorObserver> observers;
	private Queue<ElevatorRequest> requests;
	
	Elevator(int id){
		this.id = id;
	}
	
	public void moveToNextStop(int nextStop) {
		// only move when elevator is in moving state
		
		if(state != ElevatorState.MOVING) return;
		
		while(currentFloor!=nextStop) {
			
			if(direction == Direction.UP) currentFloor++;
			else currentFloor--;
			
			notifyFloorChange(currentFloor);
			
			if(currentFloor == nextStop) {
				completeArrival();
			}
		}
	}
	
	public void completeArrival() {
		
		this.setState(ElevatorState.STOPPED);
		notifyStateChange(ElevatorState.STOPPED);
		
		// remove requests from queue
		
		if(requests.isEmpty()) {
			setDirection(Direction.IDLE);
			setState(ElevatorState.IDLE);
			notifyStateChange(ElevatorState.IDLE);
		}
		else {
			setState(ElevatorState.MOVING);
			notifyStateChange(ElevatorState.MOVING);
		}
		
	}
	
	
	public void addObservers(ElevatorObserver observer) {
		observers.add(observer);
	}
	public void removeObserver(ElevatorObserver observer) {
		observers.remove(observer);
	}
	public void notifyStateChange(ElevatorState state) {
		for(ElevatorObserver ob : observers) {
			ob.onElevatorStateChange(this,state);
		}
	}
	public void notifyFloorChange(int floor) {
		for(ElevatorObserver ob : observers) {
			ob.onElevatorFloorChange(this,floor);
		}
	}
	
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	public ElevatorState getState() {
		return state;
	}
	public void setState(ElevatorState state) {
		this.state = state;
	}
	public List<ElevatorObserver> getObservers() {
		return observers;
	}
	public Queue<ElevatorRequest> getRequest() {
		return requests;
	}
	public void addRequest(ElevatorRequest request) {
		if(!requests.contains(request)) this.requests.add(request);
		
		int reqFloor = request.getFloor();
		
		// if elevator is idle, start moving
		if(state == ElevatorState.IDLE  && !requests.isEmpty()) {
			
			if(reqFloor > currentFloor) {
				direction = Direction.UP;
			}
			else if(reqFloor < currentFloor) {
				direction = Direction.DOWN;
			}
			this.setState(ElevatorState.MOVING);
		}
	}
	
	
}
