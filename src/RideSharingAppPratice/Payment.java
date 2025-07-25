package RideSharingAppPratice;

public abstract class Payment {
	
	private double amount; 
	
	public abstract void processPay(double amount);

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
