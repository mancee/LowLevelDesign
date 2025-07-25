package Leetcode;

enum AccountStatus{
	ACTIVE, BANNED, BLOCKED, DEACTIVATED
}

public class Account {
	private String username, password;
	private AccountStatus status;
	
	Account(String name, String pass){
		this.username=name;
		this.password=pass;
	}
}
