package BookMyShow;

public class UPI extends Payment{
	private String upiId;

	@Override
	void processPayment() {
		System.out.println("Making payment via UPI");
		
	}
	
}
