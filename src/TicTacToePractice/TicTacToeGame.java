package TicTacToePractice;

import java.util.Random;

public class TicTacToeGame {
	
	private Board board;
	private Player currTurn;
	private Random rand;
	
	TicTacToeGame(int size){
		this.board = new Board(size);
		this.rand = new Random();
	}
	
	public void startGame(Player p1, Player p2) {
		
		currTurn = p1;
		
		while(true) {
			System.out.println("Player - " + currTurn.getUsername() + " its' your turn -");
			int x = rand.nextInt(board.getSize());
			int y = rand.nextInt(board.getSize());
			
			if(x<0 || x>=3 || y<0 || y>=3 || board.getBoard()[x][y].getSymbol() !=' ') {
				System.out.println("Wrong Move , please enter valid range!");
				continue;
			}
			makeMove(currTurn,x,y);
			
			if(checkWinner()) {
				System.out.println("Congratulations "+ currTurn.getUsername() +" you won!!");
				return;
			}
			currTurn = currTurn.equals(p1)?p2:p1;
		}
	}
	
	private void makeMove(Player curr, int x, int y) {
		System.out.println("Move made at " + x +":"+y);
		this.board.getBoard()[x][y].setSymbol(curr.getSymbol());
	}
	
	private boolean checkWinner() {
		return checkRow() || checkCol() || checkDaigonal() || checkDaigonal2();
	}
	
	private boolean checkRow() {
		
		for(int i=0;i<this.board.getSize();i++) {
			char symbol = this.board.getBoard()[i][0].getSymbol();
			int j=0;
			for(;j<this.board.getSize();j++) {
				if(this.board.getBoard()[i][j].getSymbol() == ' ' || this.board.getBoard()[i][j].getSymbol()!= symbol) break;
			}
			if(j==this.board.getSize()) return true;
		}
		return false;
	}
	
	private boolean checkCol() {
		
		for(int i=0;i<this.board.getSize();i++) {
			char symbol = this.board.getBoard()[0][i].getSymbol();
			int j=0;
			for(;j<this.board.getSize();j++) {
				if(this.board.getBoard()[j][i].getSymbol() == ' ' || this.board.getBoard()[j][i].getSymbol()!= symbol) break;
			}
			if(j==this.board.getSize()) return true;
		}
		return false;
	
	}
	
	private boolean checkDaigonal() {
		char symbol = this.board.getBoard()[0][0].getSymbol();
		for(int i=0,j=0;i<this.board.getSize();i++,j++) {
			if(this.board.getBoard()[i][j].getSymbol() == ' ' || this.board.getBoard()[i][j].getSymbol()!= symbol) return false;
		}
		return true;
	}
	
	private boolean checkDaigonal2() {
		char symbol = this.board.getBoard()[0][this.board.getSize()-1].getSymbol();
		for(int i=0,j=this.board.getSize()-1;i<this.board.getSize();i++,j--) {
			if(this.board.getBoard()[i][j].getSymbol() == ' ' || this.board.getBoard()[i][j].getSymbol()!= symbol) return false;
		}
		return true;
	}
}
