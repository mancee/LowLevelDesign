package ChessPractice;

public class Move {
	
	Box start, end;
	Player player;
	Piece killed;
	
	public Piece getKilled() {
		return killed;
	}

	public void setKilled(Piece killed) {
		this.killed = killed;
	}

	Move(Player p, Box start, Box end){
		this.setPlayer(p);
		this.setStart(start);
		this.setEnd(end);
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

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
