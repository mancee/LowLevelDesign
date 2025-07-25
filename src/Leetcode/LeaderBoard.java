package Leetcode;

import java.util.TreeMap;

public class LeaderBoard {
	private TreeMap<User,Integer> rank;
	private int contestId;
	
	LeaderBoard(int contestId){
		rank = new TreeMap<>();
		this.contestId = contestId;
	}
	
	public void getDashboard() {
		System.out.println(rank);
	}
	
	public void addUser(User user) {
		rank.put(user, null);
	}
	
}
