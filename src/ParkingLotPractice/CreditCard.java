package ParkingLotPractice;

public class CreditCard extends Payment{

	private String number, name;
	@Override
	public void processPay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing payment via Credit card - "+ amount);
	}

}
