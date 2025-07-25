package Amazon;

import java.util.ArrayList;
import java.util.List;

enum AccountStatus {
	ACTIVE, UNKNOWN, BLACKLISTED, ARCHIVED
}

class Address{
	String street, city, state, country, zipCode;

	public Address(String street, String city, String state, String country, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
}

public class Account {
	
	private String username, password, name, phone;
	private AccountStatus status;
	private Address address;
	private List<CreditCard> creditCard;
	private List<ElectronicBankTransfer> bankTransfer;
	
	Account(String username, String password, String phone){
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.creditCard = new ArrayList<>();
		this.bankTransfer = new ArrayList<>();
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(String street, String city, String state, String country, String zipcode) {
		this.address = new Address(street,city, state, country,zipcode);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public AccountStatus getStatus() {
		return status;
	}
	public void setStatus(AccountStatus status) {
		this.status = status;
	}
	public void resetPassword(String password) {
		this.password = password;
	}
	
	
}
