package ParkingSystem;

public class Admin extends Account{
	
	Admin(String name, String password){
		super(name,password);
	}
	
	// add parking slots
	public boolean addParkingSlot(String floorname, ParkingSpot spot) {
		return true;
	}
	
	// add parking floor
	public boolean addParkingFloor(ParkingFloor floor) {
		return true;
	}
	
	
	// remove parking floor
	public boolean removeParkingFloor(ParkingFloor floor) {
		return true;
	}
	
	
	// add parking display board
	public boolean addParkingDiplayBoard(ParkingDisplayBoard board) {
		return true;
	}
	
	// add customer info panel
	public boolean addCustomerInfoPanel(CustomerInfoPanel panel) {
		return true;
	}
	
	public boolean addEntrancePanel(EntrancePanel panel) {
		return true;
	}
	
	public boolean addExitPanel(ExitPanel panel) {
		return true;
	}
}
