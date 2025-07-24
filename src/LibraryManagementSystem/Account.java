package LibraryManagementSystem;

import java.time.LocalDate;

public class Account {
	private String username, password, email, phone;
	private AccountStatus status;
	private LibraryCard card;
	
	
	public Account(String username, String password, String email, String phone) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.card = new LibraryCard("1234","1234",LocalDate.now().plusYears(2));
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AccountStatus getStatus() {
		return status;
	}
	public void setStatus(AccountStatus status) {
		this.status = status;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LibraryCard getCard() {
		return card;
	}
	
	
	
}
