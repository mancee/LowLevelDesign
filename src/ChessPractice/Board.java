package ChessPractice;

public class Board {
	private int size;
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	Box[][] board;
	
	Board(int size) {
		this.size=size;
		board = new Box[size][size];
		this.resetBoard(size);
	}
	
	public void resetBoard(int size) {
		
		board[0][0] = new Box(0,0,new Rook(true)); 
		board[0][1] = new Box(0,1,new Bishop(true));
		board[0][2] = new Box(0,2,new Knight(true));
		board[0][3] = new Box(0,3,new King(true));
		board[0][4] = new Box(0,4,new Queen(true));
		board[0][5] = new Box(0,5,new Knight(true));
		board[0][6] = new Box(0,0,new Bishop(true));
		board[0][7] = new Box(0,0,new Rook(true));
		
		board[7][0] = new Box(7,0,new Rook(false)); 
		board[7][1] = new Box(7,1,new Bishop(false));
		board[7][2] = new Box(7,2,new Knight(false));
		board[7][3] = new Box(7,3,new Queen(false));
		board[7][4] = new Box(7,4,new King(false));
		board[7][5] = new Box(7,5,new Knight(false));
		board[7][6] = new Box(7,0,new Bishop(false));
		board[7][7] = new Box(7,0,new Rook(false));
		
		board[1][0] = new Box(1,0,new Pawn(true));
		board[1][1] = new Box(1,1,new Pawn(true));
		board[1][2] = new Box(1,2,new Pawn(true));
		board[1][3] = new Box(1,3,new Pawn(true));
		board[1][4] = new Box(1,4,new Pawn(true));
		board[1][5] = new Box(1,5,new Pawn(true));
		board[1][6] = new Box(1,6,new Pawn(true));
		board[1][7] = new Box(1,7,new Pawn(true));
		
		board[6][0] = new Box(6,0,new Pawn(false));
		board[6][1] = new Box(6,1,new Pawn(false));
		board[6][2] = new Box(6,2,new Pawn(false));
		board[6][3] = new Box(6,3,new Pawn(false));
		board[6][4] = new Box(6,4,new Pawn(false));
		board[6][5] = new Box(6,5,new Pawn(false));
		board[6][6] = new Box(6,6,new Pawn(false));
		board[6][7] = new Box(6,7,new Pawn(false));
				
				
		for(int i=2;i<size-2;i++) {
			for(int j=0;j<size;j++) {
				board[i][j] = new Box(i,j,null);
			}
		}
//		for(int i=0;i<size;i++) {
//			for(int j=0;j<size;j++) {
//				System.out.println(i+" " +j+" "+ board[i][j].getPiece());
//			}
//		}
	}
	
	Box getBox(int x, int y) {
		if(x<0 || y<0 || x>=size || y>=size) return null;
		return board[x][y];
	}
}
