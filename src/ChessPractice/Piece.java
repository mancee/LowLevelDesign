package ChessPractice;

public abstract class Piece {
	
	private boolean isKilled;
	private boolean isWhite;
	
	
	public boolean isKilled() {
		return isKilled;
	}



	public void setKilled(boolean isKilled) {
		this.isKilled = isKilled;
	}



	public boolean isWhite() {
		return isWhite;
	}



	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}



	public abstract boolean canMove(Box start, Box end);
}
