package ParkingLotPractice;

public class UPI extends Payment{
	
	private String upiId;

	@Override
	public void processPay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing payment via UPI - "+ amount);
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

}
