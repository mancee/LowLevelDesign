package RideSharingApp;

//LisKov principle
abstract class User {
	
	protected String name, email;
	
	protected Location location;
	
	public Location getLocation() {
		return location;
	}

	User(String name, String email, Location location){
		this.name =  name;
		this.email = email;
		this.location = location;
	}
	
	public abstract void notify(String msg);
	
}
