package ChessPractice;

public class Rook extends Piece{
	
	Rook(boolean white){
		this.setWhite(white);
	}
	@Override
	public boolean canMove(Box start, Box end) {
		
		int dx = Math.abs(start.getX() - end.getX());
		int dy = Math.abs(start.getY() - end.getY());
		if(dx==0 && dy==0) return false;
		
		return dx==0 || dy==0;
	}

}
