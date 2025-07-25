package ElevatorSystem;

import java.util.Queue;

public class FCFS implements SchedulingStrategy{

	@Override
	public int getNextStop(Elevator elevator) {
		
		Direction direction = elevator.getDirection();
		int currentFloor = elevator.getCurrentFloor();
		Queue<ElevatorRequest> queue =  elevator.getRequest();
		
		if(queue.isEmpty()) return currentFloor;
		
		int nextRequestedFloor = queue.poll().getFloor();
		
		if(nextRequestedFloor == currentFloor) return currentFloor;
		
		if(direction==Direction.IDLE) {
			
			elevator.setDirection(nextRequestedFloor > currentFloor ? Direction.UP: Direction.DOWN);
		}
		else if(direction == Direction.UP && nextRequestedFloor < currentFloor) {
			elevator.setDirection(Direction.DOWN);
		}
		else if(direction == Direction.DOWN && nextRequestedFloor > currentFloor) {
			elevator.setDirection(Direction.UP);
		}
		
		
		return nextRequestedFloor;
	}

}
