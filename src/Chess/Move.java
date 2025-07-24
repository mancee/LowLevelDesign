package Chess;

public class Move {
	Player player;
	protected Box start, end;
	Piece killed, moved;
	
	Move(Player player, Box start, Box end){
		this.player = player;
		this.start = start;
		this.end=end;
		this.moved = start.getPiece();
	}
	
	public void setKilled(Piece killed) {
		this.killed = killed;
	}

	public void setMoved(Piece moved) {
		this.moved = moved;
	}
	
	public Box getStart() {
		return start;
	}

	public void setStart(Box start) {
		this.start = start;
	}

	public Box getEnd() {
		return end;
	}

	public void setEnd(Box end) {
		this.end = end;
	}
}
