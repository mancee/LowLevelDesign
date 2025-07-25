package Leetcode;

import java.util.List;

public class Submission {
	private int subId;
	private int problemId;
	private int userId;
	private boolean isPassed;
	private List<String> error;
	private int runTime; // seconds
	private int completionTime; // optional
	private Solution code;
	
	Submission(int problemId, int userId, Solution code){
		this.setProblemId(problemId);
		this.setUserId(userId);
		this.setCode(code);
	}
	
	public Solution getCode() {
		return code;
	}

	public void setCode(Solution code) {
		this.code = code;
	}	


	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public int getProblemId() {
		return problemId;
	}

	public void setProblemId(int problemId) {
		this.problemId = problemId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isPassed() {
		return isPassed;
	}

	public void setPassed(boolean isPassed) {
		this.isPassed = isPassed;
	}

	public List<String> getError() {
		return error;
	}

	public void setError(List<String> error) {
		this.error = error;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public int getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(int completionTime) {
		this.completionTime = completionTime;
	}
	
	
}
