package StackOverflow;

public class Moderator {
	
	private Account account;
	
	Moderator(String username, String password){
		account = new Account(username, password);
	}
	
	// close question
	public boolean closeQuestion(Question question, QuestionClosingRemark remarks) {
		question.close(remarks);
		return true;
	}
	
	// undelete question
	public boolean unDelete(Question question) {
		question.setStatus(QuestionStatus.OPEN);
		return true;
	}
}
