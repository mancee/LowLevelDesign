package ParkingSystem;

public class CreditCard extends Payment{

	@Override
	void processPayment() {
		System.out.println("Paid via Credit Card!");
		
	}

}
