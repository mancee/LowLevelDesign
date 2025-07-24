package SnakeAndLadder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the number of players ? ");
		int playersCount = s.nextInt();
		
		System.out.println("Enter player names one by one");
		
		Player[] players = new Player[playersCount];
		
		for(int i=0;i<playersCount;i++) {
			players[i] = new Player(s.next(),0);
		}
		
		List<Snake> snakes = new ArrayList<>();
		List<Ladder> ladders = new ArrayList<>();
		

		snakes.add(new Snake(99,3));
		snakes.add(new Snake(50,15));
		snakes.add(new Snake(91,70));
		snakes.add(new Snake(23,7));
		
		ladders.add(new Ladder(6,35));
		ladders.add(new Ladder(45,94));
		ladders.add(new Ladder(34,82));
		ladders.add(new Ladder(49,88));

		
		GameController game = new GameController(players,snakes,ladders);
		game.startGame();
	}
}
