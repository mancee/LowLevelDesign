package TicTacToePractice;

public class Player<T> {
	
	private String username, password;
	private char symbol;
	
	Player(String user, String pass, char symbol){
		this.setUsername(user);
		this.setPassword(pass);
		this.symbol = symbol;
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
	
	public char getSymbol() {
		return this.symbol;
	}
	
}
