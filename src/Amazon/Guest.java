package Amazon;

public class Guest extends Customer {
	
	private Account account = null;
	
	void registerAccount(String username, String password, String phone) {
		this.account = new Account(username, password, phone);
	}
	
	boolean isRegisteredUser() {
		return this.account != null;
	}
	
}
