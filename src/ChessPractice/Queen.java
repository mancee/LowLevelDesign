package ChessPractice;

public class Queen extends Piece{
	
	Queen(boolean white){
		this.setWhite(white);
	}
	@Override
	public boolean canMove(Box start, Box end) {
		
		int dx = Math.abs(start.getX() - end.getX());
		int dy = Math.abs(start.getY() - end.getY());
		
		return (dx==0 && dy>0) || (dy==0 && dx>0) || (dx==dy);
	}
}
