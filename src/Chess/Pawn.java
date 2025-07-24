package Chess;

public class Pawn extends Piece{
	
	Pawn(boolean white){
		super(white);
	}

	@Override
	public boolean canMove(Board board, Box start, Box end) {
		
		if(end.getPiece().isWhite()==this.isWhite()) return false;
		
		int x = Math.abs(start.getX()-start.getY());
		int y = Math.abs(end.getX()-end.getY());
		
		return x==1 && y==0;
	}
}
