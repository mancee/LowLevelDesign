package TicTacToePractice;

public class Box {
	
	private int x, y;
	private char symbol;
	
	Box(int x, int y){
		this.x=x;
		this.y=y;
		this.symbol=' ';
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	
}
