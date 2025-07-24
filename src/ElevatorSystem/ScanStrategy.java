package ElevatorSystem;

import java.util.PriorityQueue;
import java.util.Queue;

public class ScanStrategy implements SchedulingStrategy{

	@Override
	public int getNextStop(Elevator elevator) {
		
		int currentFloor =  elevator.getCurrentFloor();
		Direction direction = elevator.getDirection();
		
		Queue<ElevatorRequest> requests = elevator.getRequest();
		
		if(requests.isEmpty()) return currentFloor;
		
		PriorityQueue<ElevatorRequest> upRequests = new PriorityQueue<>();
		PriorityQueue<ElevatorRequest> downRequests = new PriorityQueue<>((a,b)->Integer.compare(b.getFloor() , a.getFloor()));
		
		while(requests.size()>0) {
			ElevatorRequest request = requests.poll();
			if(request.getFloor()>currentFloor) {
				upRequests.add(request);
			}
			else downRequests.add(request);
		}
		
		
		if(direction==Direction.IDLE) {
			// find closest floor to me
			
			int nearestUpFloor = upRequests.isEmpty()?-1:upRequests.peek().getFloor();
			int nearestDownFloor = downRequests.isEmpty()?-1:downRequests.peek().getFloor();
			
			if(nearestUpFloor == -1) {
				elevator.setDirection(Direction.DOWN);
				return downRequests.poll().getFloor();
			}
			else if(nearestDownFloor == -1) {
				elevator.setDirection(Direction.UP);
				return upRequests.poll().getFloor();
			}
			if(Math.abs(nearestDownFloor - currentFloor) >= Math.abs(nearestUpFloor - currentFloor)) {
				elevator.setDirection(Direction.UP);
				return upRequests.poll().getFloor();
			}
			else {
				elevator.setDirection(Direction.DOWN);
				return downRequests.poll().getFloor();
			}
		}
		else if(direction == Direction.UP) {
			return !upRequests.isEmpty()?upRequests.poll().getFloor() : switchDirection(elevator,downRequests);
		}
		else {
			return !downRequests.isEmpty()?downRequests.poll().getFloor() : switchDirection(elevator,upRequests);
		}
		
	}
	
	private int switchDirection(Elevator elevator, Queue<ElevatorRequest> requests) {
		
		if(elevator.getDirection()==Direction.UP) {
			elevator.setDirection(Direction.DOWN);
		}
		else {
			elevator.setDirection(Direction.UP);
		}
		
		return requests.poll().getFloor();
	}
}
