package ChessPractice;

import java.util.*;

public class ChessGame implements Notifier{
	
	private Board board;
	Player currturn, winner;
	List<Move> moves = new ArrayList<>();
	Random rand = new Random();
	List<Player> observers;
//	Scanner s = new Scanner(System.in);
	
	ChessGame(){
		this.board = new Board(8);
		observers = new ArrayList<>();
	}
	
	void start(Player player1, Player player2) {
		// assuming player1 will be white or we can take as input as well
		
		addObserver(player1);
		addObserver(player2);
		currturn = player1;
		
		while(true) {
			System.out.println("Player " + currturn.getUsername() +" please provide your move as start and end coordinates");
//			int x1 = s.nextInt();
//			int y1 = s.nextInt();
//			int x2 = s.nextInt();
//			int y2 = s.nextInt();
//			
			int x1 = rand.nextInt(board.getSize());
			int y1 = rand.nextInt(board.getSize());
			int x2 = rand.nextInt(board.getSize());
			int y2 = rand.nextInt(board.getSize());
			
			Box start = board.getBox(x1, y1);
			Box end = board.getBox(x2, y2);

			if(start==null || start.getPiece()==null || end ==null) {
				System.out.println("This is an Invalid move, please try again....");
				continue;
			}
			Piece source = start.getPiece();
			if(!source.canMove(start, end)) {
				System.out.println("This is an Invalid move, please try again");
				continue;
			}
			
			Piece dest = end.getPiece();
			if(dest!=null) {
				dest.setKilled(true);
				if(dest instanceof King) {
					winner = currturn;
					System.out.println("Congratulations "+ winner.getUsername() + " won !");
					return;
				}
			}
			
			Move move = new Move(currturn,start,end);
			moves.add(move);
			
			makeMove(move);
			
			currturn = currturn==player1?player2:player1;
			
		}
		
		
		
	}
	
	public void makeMove(Move move) {
		Piece p = move.getStart().getPiece();
		move.getStart().setPiece(null);
		move.getEnd().setPiece(p);
		notifyUsers(move);
	}

	@Override
	public void addObserver(Player p) {
		// TODO Auto-generated method stub
		observers.add(p);
	}

	@Override
	public void removeObserver(Player p) {
		// TODO Auto-generated method stub
		observers.remove(p);
	}

	@Override
	public void notifyUsers(Move move) {
		// TODO Auto-generated method stub
		for(Player ob: this.observers) {
			ob.notify("Move made succesfully by " + move.getPlayer().getUsername() + " for : " + move.getEnd().getPiece() );
		}
	}
}
