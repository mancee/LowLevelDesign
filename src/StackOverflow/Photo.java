package StackOverflow;

public class Photo {
	private int id;
	private String path;
	
	private Member creatingMember;
	
	Photo(int id, String path, Member mem){
		this.id = id;
		this.path = path;
		this.creatingMember = mem;
	}
	
	public Photo delete() {
		return null;
	}
}
