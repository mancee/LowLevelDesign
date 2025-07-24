package Chess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum GameStatus {
	WHITE_WIN, BLACK_WIN, DRAW, ACTIVE
}

public class ChessGame {
	private Player player1, player2;
	private Board board;
	private Player currTurn;
	private List<Move> movesPlayed = new ArrayList<>();
	private GameStatus status;
	private Scanner s;
	
	ChessGame() {
		s = new Scanner(System.in);
		System.out.println("Enter Player 1 Details --");
		System.out.println("Enter Player 1 name - ");
		String name = s.next();
		System.out.println("Enter Player 1 email - ");
		String email = s.next();
		System.out.println("Enter Player 1 age - ");
		int age = s.nextInt();
		
		player1 = new Player(new Person(name,email,age),true);
		
		System.out.println("Enter Player 2 Details --");
		System.out.println("Enter Player 2 name - ");
		name = s.next();
		System.out.println("Enter Player 2 email - ");
		email = s.next();
		System.out.println("Enter Player 2 age - ");
		age = s.nextInt();
		
		player2 = new Player(new Person(name,email,age),false);
	}
	
	void start() throws Exception {
		 this.board = new Board();
		 this.status = GameStatus.ACTIVE;
		 
		 // start game from here - with white's turn as first
		 
		 if(player1.isWhiteSide()) {
			 this.currTurn = player1;
		 }
		 else this.currTurn = player2;
		 
		 while(!isEnd()) {
			 
			 System.out.println("Curret Turn - " + this.currTurn.getPerson().getName());
			 // getMove from curr player
			 int[] move =  takeMoveCoordinates();
			 
			 if(!playerMove(this.currTurn,move[0],move[1],move[2],move[3])) {
				 System.out.println("Please try with Valid moves and Valid Player!");
				 continue;
			 }
			 
			// set next turn
			if(this.currTurn==player1) {
				this.currTurn=player2;
			}
			else {
				this.currTurn=player1;
			}
		 }
		 
	}
	
	private boolean isEnd() {
		return this.getStatus() != status.ACTIVE;
	}
	
	private GameStatus getStatus() {
		return this.status;
	}
	
	private int[] takeMoveCoordinates() {
		int[] move = new int[4];
		System.out.println("Enter your source move -");
		System.out.println("Enter x - ");
		move[0] = s.nextInt();
		System.out.println("Enter y - ");
		move[1] = s.nextInt();
		
		System.out.println("Enter your dest move -");
		System.out.println("Enter x - ");
		move[2]= s.nextInt();
		System.out.println("Enter y - ");
		move[3] = s.nextInt();
		return move;
	}
	
	public boolean playerMove(Player player, int startX, int startY, int endX, int endY) throws Exception {
		Box start = board.getBox(startX, startY);
		Box end = board.getBox(endX, endY);
		
		Move move = new Move(player,start,end);
		
		return this.makeMove(move, player);
	}

	// most important function
	private boolean makeMove(Move move, Player player) {
		
		Piece sourcePiece = move.start.getPiece();
		
		if(sourcePiece==null) return false;
		
		if(player != currTurn) return false;
		
		if(!sourcePiece.canMove(board, move.start, move.end)) return false;
		
		// kill
		Piece destPiece = move.end.getPiece();
		if(destPiece!=null) {
			destPiece.setKilled(true);
			move.setKilled(destPiece);
		}
		
		movesPlayed.add(move);
		
		// make an actual move now
		move.getEnd().setPiece(sourcePiece);
		move.getStart().setPiece(null);
		
		// check for who wins the game
		if(destPiece != null && destPiece instanceof King){
			if(player.isWhiteSide()) {
				this.setStatus(GameStatus.WHITE_WIN);
			}
			else {
				this.setStatus(GameStatus.BLACK_WIN);
			}
		}
		
		return true;
		
	}
	private void setStatus(GameStatus status) {
		this.status=status;
	}
}
