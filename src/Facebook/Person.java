package Facebook;

class Address{
	String street, city, state, country, pincode;
}

abstract class Person {
	
	String name, phone;
	Address address;
	
	Account account;
	
	Person(String name, String email, String phone, String password, AccountStatus status){
		this.name = name;
		this.phone = phone;
		this.account = new Account(email,password,status);
	}
	void notify(String msg) {
		System.out.println("Notification for "+ this.name +":" + msg);
	}
}
