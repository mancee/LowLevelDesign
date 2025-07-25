package Splitwise;

public class Node implements Comparable<Node>{
	
	User user;
	double final_balance;
	
	
	public Node(User user, double final_balance) {
		this.user = user;
		this.final_balance = final_balance;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public double getFinal_balance() {
		return final_balance;
	}
	public void setFinal_balance(double final_balance) {
		this.final_balance = final_balance;
	}
	public int compareTo(Node ob) {
		return Double.compare(ob.final_balance, this.final_balance);
	}
}
