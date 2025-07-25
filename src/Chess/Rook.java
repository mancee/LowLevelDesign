package Chess;

public class Rook extends Piece{

	public Rook(boolean white) {
		super(white);
	}

	@Override
	public boolean canMove(Board board, Box start, Box end) {
		
		if(end.getPiece().isWhite()==this.isWhite()) return false;
		
		int x = Math.abs(start.getX()-end.getY());
		int y = Math.abs(start.getY()-end.getY());
		
		if(x==0 && y==0) return false; // no move in this case
		return x==0 || y==0;
	}

}
