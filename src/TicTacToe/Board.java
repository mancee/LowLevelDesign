package TicTacToe;

public class Board {
	// singleton pattern here
	// assuming it's 3*3 board only
	Box[][] boxes;
	
	Board(){
		this.boxes = new Box[3][3];
		this.resetBoard();
	}
	
	Box[][] resetBoard() {
		for(int row=0;row<=2;row++) {
			for(int col=0;col<=2;col++) {
				boxes[row][col] = new Box(row,col,"");
			}
		}
		return boxes;
	}
	void setBox(int x, int y, String val) {
		this.boxes[x][y].setVal(val);
	}
	
	String  getBox(int x, int y) {
		return boxes[x][y].getVal();
	}
}
