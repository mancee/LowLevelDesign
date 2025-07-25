package Chess;

public class Queen extends Piece{
	
	Queen(boolean white){
		super(white);
	}

	@Override
	public boolean canMove(Board board, Box start, Box end) {
		
		if(end.getPiece().isWhite()==this.isWhite()) return false;
		
		int x = Math.abs(start.getX()-end.getX());
		int y = Math.abs(start.getY()-end.getY());
		
		// horizontal/vertical move
		if((x==0 && y>0) || (y==0 && x>0)) return true;
		
		//bishops move
		return x==y;
	}
}
