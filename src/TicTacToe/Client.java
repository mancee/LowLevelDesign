package TicTacToe;

public class Client {
	
	public static void main(String[] args) {
		// create board
		Player player1 = new Player("Mansi","mansi@gmail.com");
		Player player2 = new Player("Disha","disha@gmail.com");
		TicTacToeGame game = new TicTacToeGame();
		game.start(player1,player2);
	}
	
	

}
