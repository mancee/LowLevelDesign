package ChessPractice;

public class Player {
	
	private String username, password;
	private int rank;
	
	Player(String username, String password){
		this.username = username;
		this.setPassword(password);
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void notify(String message) {
		System.out.println(this.username +" ->" +message);
	}
}
