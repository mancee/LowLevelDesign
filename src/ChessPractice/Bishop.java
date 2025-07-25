package ChessPractice;

public class Bishop extends Piece{
	
	Bishop(boolean white){
		this.setWhite(white);
	}
	@Override
	public boolean canMove(Box start, Box end) {
		
		int dx = Math.abs(start.getX() - end.getX());
		int dy = Math.abs(start.getY() - end.getY());
		
		return dx==dy;
	}
}
