package StackOverflow;

public class Guest {
	
	private Member member;
	
	Guest(){
		this.member = null;
	}
	
	public boolean registerAccount(String username, String password) {
		this.member = new Member(username,password);
		System.out.println("New Account Opened");
		return this.member!=null;
	}
	
	// can view question/answers
}
