package Amazon;

public class ElectronicBankTransfer extends Payment{
	
	@Override
	void processPayment() {
		System.out.println("Paying via Bank Transfer!");
		this.setStatus(PaymentStatus.PAID);
	}

}
