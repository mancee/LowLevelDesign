package TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
	
	Player player1,player2,currTurn;
	Board board = new Board();
	Scanner sc = new Scanner(System.in);
	
	void start(Player player1, Player player2) {
		// assume - player 1 is X and player 2 is O
		currTurn = player1;
		
		while(true) {
			System.out.println("Please enter your move - "+ currTurn.getName());
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x<0 || x>=3 || y<0 || y>=3 || board.getBox(x, y)!="") {
				System.out.println("Wrong Move , please enter valid range!");
				continue;
			}
			
			if(currTurn.equals(player1)) {

				board.setBox(x, y, "X");
			}
			else {
				board.setBox(x, y, "0");
			}
			
			// check if someone wins , return the winner from here only.
			if(checkWinner(board.getBox(x,y))) {
				System.out.println("Winner is - "+ currTurn.getName());
				return;
			}
			
			
			currTurn = currTurn.equals(player1)?player2:player1;
		}
	}
	boolean checkWinner(String val) {
		// rows
		for(int r=0;r<3;r++) {
			int c=0;
			for(c=0;c<3;c++) {
				if(!board.getBox(r, c).equals(val)) {
					break;
				}
			}
			if(c==3) return true;
		}
		
		// cols
		for(int c=0;c<3;c++) {
			int r=0;
			for(r=0;r<3;r++) {
				if(!board.getBox(r, c).equals(val)) {
					break;
				}
			}
			if(r==3) return true;
		}
		
		
		// daigonals
		int r=0,c=0;
		for(;r<3 && c<3;r++,c++) {
			if(!board.getBox(r, c).equals(val)) {
				break;
			}
		}
		if(r==3 &&c==3) return true;
		
		r=0;c=2;
		for(;r<3 && c>=0;r++,c--) {
			if(!board.getBox(r, c).equals(val)) {
				break;
			}
		}
		if(r==3 &&c==-1) return true;
		
		return false;
	}
	
}

