package Leetcode;

import java.util.List;

public class Contest {
	private int contestId;
	private List<Problem> problems;
	private int timeAllowed;   // mins
	private LeaderBoard board;
	private int starttime;
	
	Contest(int id, List<Problem> problems,int sttime){
		this.setContestId(id);
		this.setProblems(problems);
		this.setTimeAllowed(90);
		this.board = new LeaderBoard(id);
		this.starttime = sttime;
	}

	public int getContestId() {
		return contestId;
	}

	public void setContestId(int contestId) {
		this.contestId = contestId;
	}

	public List<Problem> getProblems() {
		return problems;
	}

	public void setProblems(List<Problem> problems) {
		this.problems = problems;
	}

	public int getTimeAllowed() {
		return timeAllowed;
	}

	public void setTimeAllowed(int timeAllowed) {
		this.timeAllowed = timeAllowed;
	}

	public LeaderBoard getBoard() {
		return board;
	}

	public void setBoard(LeaderBoard board) {
		this.board = board;
	}
	
	
	

}
