package LinkedIn;

class Stats{
	private int profileViews, searchAppearance, followers;

	public int getProfileViews() {
		return profileViews;
	}

	public void setProfileViews(int profileViews) {
		this.profileViews = profileViews;
	}

	public int getSearchAppearance() {
		return searchAppearance;
	}

	public void setSearchAppearance(int searchAppearance) {
		this.searchAppearance = searchAppearance;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}
}

enum AccountStatus{
	ACTIVE, DELETED, BLOCKED, BANNED
}

public class Account {
	
	private String username, password;
	private AccountStatus status;
	
	Account(String user, String pass){
		this.setPassword(pass);
		this.setUsername(user);
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
