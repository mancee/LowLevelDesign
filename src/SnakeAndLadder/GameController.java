package SnakeAndLadder;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class GameController {
	Dice dice;
	Board board;
	Queue<Player> turns;
	
	GameController(Player[] players,List<Snake> snakes, List<Ladder> ladders){
		
		board = new Board(100,snakes,ladders);
		turns = new ArrayDeque<>();
		for(Player p:players) {
			turns.add(p);
		}
		dice = new Dice(6);
	}
	
	void startGame() {
		
		while(true) {
			// take out currplayer
			// roll the dice
			// move your turn
			// check if you reach 100;
			// put the current player back to the queue
			Player currTurn = turns.poll();
			System.out.println("Let's roll the dice for "+ currTurn.getName());
			
			int diceVal = dice.rollDice();
			System.out.println("Dice Value " + diceVal);
			
			board.makeMove(currTurn,diceVal);
			
			if(currTurn.getPosition()==board.size) {
				System.out.println("Winner of the Game is -" + currTurn.getName());
				return;
			}
			
			turns.add(currTurn);
		}
	}
}
