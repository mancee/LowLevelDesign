package ElevatorSystem;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Building building = new Building(10,"Mansi",4);
		ElevatorController controller = building.getController();
		
		ElevatorDisplay display = new ElevatorDisplay();
		
		
		for(Elevator elevator: controller.getElevators()) {
			elevator.addObservers(display);
		}
		
		Scanner s = new Scanner(System.in);
		boolean running =true;
		
		
		System.out.println("Elevator System Simulation");
		
		System.out.println("Building : "+ building.getName());
		System.out.println("Floors : " + building.getNumberOfFloors());
		
		while(running) {
			System.out.println("\n Select option");
			System.out.println("1. Request Floor ");
			System.out.println("2. Request Elevator ");
			System.out.println("3. Change Scheduling Strategy");
			System.out.println("4. Next Step");
			System.out.println("5. Exit");
			
			
			int choice = s.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Enter elevator ID ");
				int eId = s.nextInt();
				System.out.println("Destination Floor");
				int floor = s.nextInt();
				
				controller.requestFloor(eId, floor);
				break;
				
			case 2: System.out.println("Current floor");
			int currentFloor = s.nextInt();
			System.out.println("Direction (1 for UP and 2 for DOWN )");
			int dir = s.nextInt();
			Direction direction = dir==1?Direction.UP:Direction.DOWN;
			
			int id = s.nextInt();
			
			controller.requestElevator(id, currentFloor, direction);
			}
				
		}
	}
}
