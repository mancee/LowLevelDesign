package Facebook;

enum AccountStatus {
	ACTIVE, CLOSED, CANCELLED, BLACKLISTED, DISABLED
}

public class Account {
	
	protected String userid, password;
	
	protected AccountStatus status;
	
	Account(String userid, String password, AccountStatus status){
		this.userid = userid;
		this.password=password;
		this.status=status;
	}
	
	protected void resetPassword(String newPassword) {
		this.password = newPassword;
	}
	
}
