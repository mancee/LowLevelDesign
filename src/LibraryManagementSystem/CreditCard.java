package LibraryManagementSystem;

public class CreditCard extends FineTransaction{

	@Override
	void processPay(int amount) {
		System.out.println("Paying the amount via Credit Card :" + amount );
		
	}

}
