package BookMyShow;

public class CreditCard extends Payment{
	private String name,number;
	
	CreditCard(String name, String num){
		this.setName(name);
		this.setNumber(num);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	void processPayment() {
		System.out.println("Making payment via CC.");
		
	}

}
