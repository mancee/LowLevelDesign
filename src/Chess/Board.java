package Chess;

public class Board {
	
	Box[][] boxes;
	
	Board(){
		boxes = new Box[8][8]; 
		this.resetBoard();
	}
	
	public Box getBox(int x, int y) throws Exception {
		if(x<0 || y<0 || x>=8 || y>=8) {
			throw new Exception("Invalid Box - Index Out of Bound!");
		}
		return boxes[x][y];
	}
	
	void resetBoard() {
		// set white 
		boxes[0][0] = new Box(0,0, new Rook(true)); 
		boxes[0][1] = new Box(0,1, new Knight(true));
		boxes[0][2] = new Box(0,2, new Bishop(true));
		boxes[0][3] = new Box(0,3, new Queen(true));
		boxes[0][4] = new Box(0,4, new King(true));
		boxes[0][5] = new Box(0,5, new Bishop(true));
		boxes[0][6] = new Box(0,6, new Knight(true));
		boxes[0][7] = new Box(0,7, new Rook(true));
		
		boxes[1][0] = new Box(1,0, new Pawn(true)); 
		boxes[1][1] = new Box(1,1, new Pawn(true));
		boxes[1][2] = new Box(1,2, new Pawn(true));
		boxes[1][3] = new Box(1,3, new Pawn(true));
		boxes[1][4] = new Box(1,4, new Pawn(true));
		boxes[1][5] = new Box(1,5, new Pawn(true));
		boxes[1][6] = new Box(1,6, new Pawn(true));
		boxes[1][7] = new Box(1,7, new Pawn(true));
		
		
		// set black
		boxes[7][0] = new Box(7,0, new Rook(false)); 
		boxes[7][1] = new Box(7,1, new Knight(false));
		boxes[7][2] = new Box(7,2, new Bishop(false));
		boxes[7][3] = new Box(7,3, new Queen(false));
		boxes[7][4] = new Box(7,4, new King(true));
		boxes[7][5] = new Box(7,5, new Bishop(false));
		boxes[7][6] = new Box(7,6, new Knight(false));
		boxes[7][7] = new Box(7,7, new Rook(false));
		
		boxes[6][0] = new Box(6,0, new Pawn(true)); 
		boxes[6][1] = new Box(6,1, new Pawn(true));
		boxes[6][2] = new Box(6,2, new Pawn(true));
		boxes[6][3] = new Box(6,3, new Pawn(true));
		boxes[6][4] = new Box(6,4, new Pawn(true));
		boxes[6][5] = new Box(6,5, new Pawn(true));
		boxes[6][6] = new Box(6,6, new Pawn(true));
		boxes[6][7] = new Box(6,7, new Pawn(true));
		
		// initialize remaining block with null
		
		for(int row=2;row<=5;row++) {
			for(int col=0;col<=7;col++) {
				boxes[row][col] = new Box(row,col,null);
			}
		}
	}
}
