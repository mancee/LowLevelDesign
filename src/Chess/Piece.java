package Chess;

abstract class Piece {
	private boolean killed, white;

	public Piece(boolean white) {
		this.setWhite(white);
	}
	
	public boolean isKilled() {
		return this.killed==true;
	}
	
	public boolean isWhite() {
		return this.white==true;
	}

	public void setKilled(boolean killed) {
		this.killed = killed;
	}

	public void setWhite(boolean white) {
		this.white = white;
	}
	
	public abstract boolean canMove(Board board, Box start, Box end);
	
}
