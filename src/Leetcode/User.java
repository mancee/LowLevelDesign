package Leetcode;

public class User extends Account{
	private int contestRanking;
	private int noOfQuestionsSolved;
	private int overAllRank;
	
	public User(String user, String pass) {
		super(user,pass);
	}

	public int getContestRanking() {
		return contestRanking;
	}

	public void setContestRanking(int contestRanking) {
		this.contestRanking = contestRanking;
	}

	public int getNoOfQuestionsSolved() {
		return noOfQuestionsSolved;
	}

	public void setNoOfQuestionsSolved(int noOfQuestionsSolved) {
		this.noOfQuestionsSolved = noOfQuestionsSolved;
	}

	public int getOverAllRank() {
		return overAllRank;
	}

	public void setOverAllRank(int overAllRank) {
		this.overAllRank = overAllRank;
	}
	
	
}
