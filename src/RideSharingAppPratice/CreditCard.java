package RideSharingAppPratice;

public class CreditCard extends Payment {

	@Override
	public void processPay(double amount) {
		System.out.println("Payment via CreditCard...");
		
	}

}
