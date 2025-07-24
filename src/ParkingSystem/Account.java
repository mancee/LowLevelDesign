package ParkingSystem;

enum  AccountStatus{
	ACTIVE, BLOCKED, ARCHIVED, BANNED, UNKNOWN
}

// no need of this class 

public class Account {
	private String username, password;
	private AccountStatus status;
	
	Account(String username, String password){
		this.username=username;
		this.password=password;
	}
	public AccountStatus getAccountStatus() {
		return status;
	}
	public void updateAccountStatus(AccountStatus status) {
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void resetPassword(String password) {
		this.password = password;
	}
}
