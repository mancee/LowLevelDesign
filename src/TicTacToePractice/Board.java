package TicTacToePractice;

public class Board {
	
	private int size;
	private Box[][] board;
	
	Board(int size){
		this.setSize(size);
		board = new Box[size][size];
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				board[i][j] = new Box(i,j);
			}
		}
	}

	public Box[][] getBoard() {
		return board;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
