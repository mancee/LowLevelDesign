package StackOverflow;

import java.util.ArrayList;
import java.util.List;

enum QuestionStatus{
	OPEN, CLOSED, ON_HOLD, DELETED
}

enum QuestionClosingRemark{
	DUPLICATE, OFF_TOPIC, TOO_BROAD, NON_CONSTRUCTIVE, NOT_A_REAL_QUESTION, PRIMARILY_OPINION_BASED
}

public class Question implements Search{

	private int upVotes, downVotes, viewCount ;
	private String title, description;
	private List<Tag> tags;
	private QuestionStatus status;

	private Member askingMember;
	private List<Answer> answers;
	private List<Comment> comments;
	private QuestionClosingRemark remarks;
	
	Question(String title, String description){
		this.setTitle(title);
		this.setDescription(description);
		this.tags = new ArrayList<>();
		this.comments = new ArrayList<>();
		this.answers = new ArrayList<>();
	}
	
	public int getUpVotes() {
		return upVotes;
	}
	public void setUpVotes(int upVotes) {
		this.upVotes = upVotes;
	}
	public int getDownVotes() {
		return downVotes;
	}
	public void setDownVotes(int downVotes) {
		this.downVotes = downVotes;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public static List<Question> search(String query) {
		List<Question> list = new ArrayList<>();
		return list;
	}
	
	public boolean close(QuestionClosingRemark remarks) {
		this.status = QuestionStatus.CLOSED;
		this.remarks = remarks;
		return true;
	}
	
	// get accepted answer
	public Answer getAcceptedAnswer() {
		for(Answer a:answers) {
			if(a.isAccepted()) {
				return a;
			}
		}
		return null;
	}
	
	public void addTags(List<Tag> tag) {
		tags.addAll(tag);
	}
	
	public void addAnswer(Answer ans) {
		answers.add(ans);
	}
	
	public QuestionStatus getStatus() {
		return status;
	}

	public void setStatus(QuestionStatus status) {
		this.status = status;
	}

	public QuestionClosingRemark getRemarks() {
		return remarks;
	}

	public void setRemarks(QuestionClosingRemark remarks) {
		this.remarks = remarks;
	}
	
	public List<Answer> getAnswers(){
		return this.answers;
	}
	
}
