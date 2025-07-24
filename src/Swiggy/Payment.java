package Swiggy;

enum PaymentStatus {
	INCOMPLETE, PAID, REFUNDED, DECLINED, CANCELLED
}

public abstract class Payment {
	
	public abstract void processPayment();

}
