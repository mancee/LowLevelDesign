package SnakeAndLadder;

public class Player {
	private String name;
	private int position;
	
	Player(String name, int position){
		this.setName(name);
		this.setPosition(position);
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
