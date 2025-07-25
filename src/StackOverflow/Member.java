package StackOverflow;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private Account account;
	List<Badge> badges;
	List<Question> questionsAsked;
	List<Answer> addedAnswers;
	List<Tag> tagsCreated;
	
	Member(String username, String password){
		this.account = new Account(username, password);
		this.badges = new ArrayList<>();
		this.questionsAsked = new ArrayList<>();
		this.addedAnswers = new ArrayList<>();
	}
	
	// create question
	public void createQuestion(Question question) {
		questionsAsked.add(question);
	}
	
	public boolean createTag(Tag tag) {
		tagsCreated.add(tag);
		return true;
	}
	
	// upvote/downvote answer or question
	public void upVoteQuestion(Question question) {
		question.setUpVotes(question.getUpVotes()+1);
	}
	
	public void downVoteQuestion(Question question) {
		question.setUpVotes(question.getUpVotes()-1);
	}
	
	public List<Question> getQuestions(){
		return this.questionsAsked;
	}
	
}
