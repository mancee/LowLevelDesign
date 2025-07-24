package StackOverflow;

public class Comment {
	private String text;
	private int upVote, downVote;
	
	Comment(String text){
		this.text = text;
	}
	public int getUpVote() {
		return upVote;
	}
	public void setUpVote(int upVote) {
		this.upVote = upVote;
	}
	public int getDownVote() {
		return downVote;
	}
	public void setDownVote(int downVote) {
		this.downVote = downVote;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
