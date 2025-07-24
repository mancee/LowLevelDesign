package Chess;

public class Bishop extends Piece{
	
	Bishop(boolean white){
		super(white);
	}

	@Override
	public boolean canMove(Board board, Box start, Box end) {
		
		if(end.getPiece().isWhite()==this.isWhite()) return false;
		
		int x = Math.abs(start.getX()-end.getX());
		int y = Math.abs(start.getY()-end.getY());
		
		return x==y;
	}
}
