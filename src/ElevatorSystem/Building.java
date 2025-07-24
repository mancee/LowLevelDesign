package ElevatorSystem;

public class Building {
	private int numberOfFloors;
	private String name;
	private ElevatorController controller;
	
	
	Building(int floors, String name, int elevators){
		
		this.numberOfFloors = floors;
		this.name = name;
		this.controller = new ElevatorController(elevators,floors);
	}


	public int getNumberOfFloors() {
		return numberOfFloors;
	}


	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ElevatorController getController() {
		return controller;
	}


	public void setController(ElevatorController controller) {
		this.controller = controller;
	}
}
