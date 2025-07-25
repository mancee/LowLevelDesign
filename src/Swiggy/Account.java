package Swiggy;

enum AccountStatus{
	ACTIVE, BLOCKED, DELETED
}

public class Account {
	
	private String username, password;
	private AccountStatus status;
	
	Account(String user, String pass){
		this.setUsername(user);
		this.setPassword(pass);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}
	
}
