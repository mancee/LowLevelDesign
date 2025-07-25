package LibraryManagementSystem;

public class Rack {
	
	private int rack, row;
	
	Rack(int rack, int row){
		this.setRack(rack);
		this.setRow(row);
	}

	public int getRack() {
		return rack;
	}

	public void setRack(int rack) {
		this.rack = rack;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
}
