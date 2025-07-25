package ElevatorSystem;

import java.util.Queue;

public class LookStrategy implements SchedulingStrategy{

	@Override
	public int getNextStop(Elevator elevator) {
		
		int currentFloor = elevator.getCurrentFloor();
		Direction direction  = elevator.getDirection();
		
		Queue<ElevatorRequest> requests = elevator.getRequest();
		
		ElevatorRequest primaryRequest = requests.poll();
		
		Direction travelDirection;
		
		if(primaryRequest.getFloor() > currentFloor) {
			travelDirection = Direction.UP;
		}
		else if(primaryRequest.getFloor() < currentFloor) {
			travelDirection = Direction.DOWN;
		}
		else return currentFloor;
		
		// intermediate requests that can be served on the way 
		Integer candidate = null;
		
		for(ElevatorRequest request:requests) {
			
			int reqFloor = request.getFloor();
			
			if(travelDirection == Direction.UP && reqFloor > currentFloor && reqFloor <= primaryRequest.getFloor()) {
				
				if(request.isInternalRequest() || (!request.isInternalRequest() && request.getDirection() == Direction.UP)) {
					
					if(candidate == null || reqFloor < candidate) {
						candidate = reqFloor;
					}
				}
			}
			else if(travelDirection == Direction.DOWN && reqFloor < currentFloor && reqFloor >= primaryRequest.getFloor()) {
				
				if(request.isInternalRequest() || (!request.isInternalRequest() && request.getDirection() == Direction.DOWN)) {
					
					if(candidate == null || reqFloor > candidate) {
						candidate = reqFloor;
					}
				}
			}
		}
		
		return candidate !=null ? candidate : primaryRequest.getFloor();
	}

}
