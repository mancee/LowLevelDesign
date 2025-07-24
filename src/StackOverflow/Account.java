package StackOverflow;

enum AccountStatus{
	BLOCKED, ACTIVE, ARCHIVED, DELETED, UNKNOWN
}
public class Account {
	
	private String name, password;
	private AccountStatus status;
	private int reputation;
	
	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	Account(String name, String password){
		this.name = name;
		this.password = password;
	}
	
	public boolean resetPassword(String password) {
		this.password = password;
		return true;
	}

	public String getName() {
		return name;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}
}
