package StackOverflow;

import java.time.LocalDate;
import java.util.List;

public class Answer {
	private Member creatingMember;
	private String answerText;
	private boolean accepted;
	private int upVote, downVote;
	private int flagCount;
	private LocalDate creationDate;
	private List<Photo> photos;
	
	Answer(String text, Member member, List<Photo> photos){
		this.answerText = text;
		this.creatingMember = member;
		this.creationDate = LocalDate.now();
		this.photos = photos;
	}
	
	public boolean incrementUpVote() {
		this.upVote++;
		return true;
	}
	public boolean incrementDownVote() {
		this.downVote++;
		return true;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	
}
