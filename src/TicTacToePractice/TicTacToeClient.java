package TicTacToePractice;

public class TicTacToeClient {
	public static void main(String[] args) {
		
		Player p1 = new Player("Mansi", "man",'X');
		Player p2 = new Player("Disha", "dis", '0');
		
		TicTacToeGame game = new TicTacToeGame(3);
		
		game.startGame(p1, p2);
	}
}
