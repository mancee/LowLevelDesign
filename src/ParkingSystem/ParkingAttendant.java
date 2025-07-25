package ParkingSystem;

public class ParkingAttendant extends Account{
	
	ParkingAttendant(String username, String password){
		super(username,password);
	}
	
	void processPayment() {
		System.out.println("Your payment is proccessed by - " + this.getUsername());
	}
}
