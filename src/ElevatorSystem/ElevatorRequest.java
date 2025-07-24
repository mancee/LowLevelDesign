package ElevatorSystem;

public class ElevatorRequest implements ElevatorCommand{
	
	private int elevatorId, floor;
	private Direction direction;
	private ElevatorController controller;
	private boolean isInternalRequest;
	
	
	public ElevatorRequest(int elevatorId, int floor, Direction direction, boolean isInternalRequest) {
		this.elevatorId = elevatorId;
		this.floor = floor;
		this.direction = direction;
		this.isInternalRequest = isInternalRequest;
	}
	
	public int getElevatorId() {
		return elevatorId;
	}
	public void setElevatorId(int elevatorId) {
		this.elevatorId = elevatorId;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public ElevatorController getController() {
		return controller;
	}
	public void setController(ElevatorController controller) {
		this.controller = controller;
	}
	public boolean isInternalRequest() {
		return isInternalRequest;
	}
	public void setInternalRequest(boolean isInternalRequest) {
		this.isInternalRequest = isInternalRequest;
	}

	@Override
	public void execute() {
		if(this.isInternalRequest()) controller.requestFloor(elevatorId,floor);  // if its internal request - go to this floor
		else controller.requestElevator(elevatorId,floor,direction);   // else come to this floor and i want to go this direction
		
	}
	
	
	
}
