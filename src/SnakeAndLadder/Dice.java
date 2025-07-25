package SnakeAndLadder;

import java.util.Random;

public class Dice {
	
	int size;
	Random rand;
	
	Dice(int size){
		rand  = new Random();
		this.size=size;
	}
	
	int rollDice() {
		return rand.nextInt(size+1)%size;
	}
}
