package Swiggy;

public class CreditCard extends Payment{

	@Override
	public void processPayment() {
		System.out.println("Payment done via Credit card!");
		
	}

}
