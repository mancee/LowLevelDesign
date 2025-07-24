package ParkingSystem;

public class Cash extends Payment{

	@Override
	void processPayment() {
		System.out.println("Paid via Cash! ");
		
	}

}
