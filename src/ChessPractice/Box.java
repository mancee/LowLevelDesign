package ChessPractice;

public class Box {
	private int x,y;
	private Piece piece;
	
	Box(int x, int y, Piece p){
		this.x=x;
		this.y=y;
		this.piece=p;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
}
