package TicTacToe;

public class Box {
	private int x,y;
	String val;
	
	Box(int x, int y,String val){
		this.x=x;
		this.y=y;
		this.val=val;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
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
	
	
}
