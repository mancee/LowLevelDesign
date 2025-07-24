package Amazon;

enum PaymentStatus {
	INCOMPLETE, PAID, REFUNDED, DECLINED, CANCELLED
}

abstract class Payment {
	
	protected PaymentStatus status;
	
	abstract void processPayment();

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
}
