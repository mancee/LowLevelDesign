package Amazon;

public class CreditCard extends Payment{

	@Override
	void processPayment() {
		System.out.println("Paying Via Credit Card");
		this.setStatus(PaymentStatus.PAID);
	}

}
