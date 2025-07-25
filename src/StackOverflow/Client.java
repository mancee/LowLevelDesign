package StackOverflow;

import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		
		Member mem1 = new Member("Mansi","pass");
		Question ques = new Question("How to create search functionality", "This is regarding searching question in StackOverflow");
		mem1.createQuestion(ques);
		
		Member mem2 = new Member("ABC","pass2");
		mem2.upVoteQuestion(ques);
		
		Answer ans = new Answer("That is a separte LLD topic itself, practice that please",mem2,null);
		ques.addAnswer(ans);
		Comment comment = new Comment("Nice question");
		ques.addComment(comment);
		
		List<Question> searchResult = Question.search("search");
		
		for(Question q: searchResult) {
			System.out.println(q);
		}
		
		List<Question> res = mem1.getQuestions();
		
		for(Question q: res) {
			System.out.println(q.getTitle());
			System.out.println(q.getDescription());
			System.out.println(q.getStatus());
			System.out.println(q.getAnswers());
			
		}
		
	}
}
