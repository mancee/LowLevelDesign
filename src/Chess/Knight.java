package Chess;

public class Knight extends Piece{
	
	Knight(boolean white){
		super(white);
	}

	@Override
	public boolean canMove(Board board, Box start, Box end) {
		
		// we can't move to a piece where another piece of same color is present
		
		if(end.getPiece().isWhite()==this.isWhite()) return false;
		
		int x = Math.abs(start.getX()-end.getX());
		int y = Math.abs(start.getY()-end.getY());
		
		
		return x*y==2;
	}
}
