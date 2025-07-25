package SnakeAndLadder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Board {
	protected int size; // for example 100
	HashMap<Integer,Snake> snakes;
	HashMap<Integer,Ladder> ladders;
	
	Board(int size, List<Snake> snakes, List<Ladder> ladders){

		this.snakes = new HashMap<>();
		this.ladders = new HashMap<>();
		this.size = size;
		
		for(Snake snake: snakes) {
			this.snakes.put(snake.getHead(),snake);
		}
		
		for(Ladder ladder: ladders) {
			this.ladders.put(ladder.getStart(),ladder);
		}
	}

	
	void makeMove(Player player, int next) {
		int curr = player.getPosition();

		next = curr+next;
		if(next > this.size) {
			System.out.println("Invalid Move ");
		}
		else if(snakes.containsKey(next)) {
			System.out.println("Ouch, You got a snake ! ");
			player.setPosition(snakes.get(next).getTail());
			
		}
		else if(ladders.containsKey(next)) {
			System.out.println("Yayyy, You got a ladder ! ");
			player.setPosition(ladders.get(next).getEnd());
		}
		else {
			System.out.println("Moved to "+ next);
			player.setPosition(next);
		}
	}
}
