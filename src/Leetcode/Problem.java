package Leetcode;

import java.util.List;

enum DSACategory{
	TREE, ARRAY, HASHMAP, HASHSET, GRAPH, BINARYSEARCH, STACK, QUEUE, STRING, MATH, BITS
}

public class Problem {
	private int problemId;
	private String title, description;
	private List<DSACategory> category;
	private int likes,dislikes;
	private List<Comment> discussion;
	private List<TestCase> testCases;
	// list of companies this question appeared.
	
	Problem(int id, String title, String desc, DSACategory category){
		this.setProblemId(id);
		this.setTitle(title);
		this.setDescription(desc);
		this.addCategory(category);
	}
	
	public List<TestCase> getTestCases() {
		return testCases;
	}

	public void setTestCases(List<TestCase> testCases) {
		this.testCases = testCases;
	}

	public int getProblemId() {
		return problemId;
	}

	public void setProblemId(int problemId) {
		this.problemId = problemId;
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

	public List<DSACategory> getCategory() {
		return category;
	}

	public void addCategory(DSACategory category) {
		this.category.add(category);
	}

	public int getLikes() {
		return likes;
	}

	public void addLikes() {
		this.likes++;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes() {
		this.dislikes++;
	}

	public List<Comment> getDiscussion() {
		return discussion;
	}

	public void setDiscussion(List<Comment> discussion) {
		this.discussion = discussion;
	}
	
	
	
}
