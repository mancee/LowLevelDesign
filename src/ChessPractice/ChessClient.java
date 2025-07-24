package ChessPractice;

public class ChessClient {
	public static void main(String[] args) {
		
		Player player1 = new Player("Mansi","Mansi");
		Player player2 = new Player("Disha","Disha");
		ChessGame game = new ChessGame();
		game.start(player1,player2);
	}
}
