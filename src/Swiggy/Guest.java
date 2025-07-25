package Swiggy;

public class Guest {
	
	Account account = null;
	
	void registerAccount(String username, String password) {
		this.account = new Account(username,password);
	}
	
	boolean isRegisteredUser() {
		return this.account != null;
	}
}
