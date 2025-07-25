package LibraryManagementSystem;

public class UPI extends FineTransaction{

	@Override
	void processPay(int amount) {
		System.out.println("Paying the amount via Credit Card :" + amount );
		
	}
	
}
