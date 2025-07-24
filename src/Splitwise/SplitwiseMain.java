package Splitwise;

import java.util.ArrayList;
import java.util.List;

public class SplitwiseMain {
	public static void main(String[] args) {
		// basic idea is to reduce the number of transactions
		// formula - total cash inflow - total cash outflow 
		// sum of all the nodes after this formula should be zero
		// total inflow will always be same to total outflow
		// 0 nodes are useless
		
		User userA = new User("Mansi","10000","swetrdfyhgjk");
		User userB = new User("Shivay","1453683","drtfyujd");
		User userC = new User("Bhavna","679800","dfghjk");
		
		List<User> users = new ArrayList<>();
		users.add(userA);
		users.add(userB);
		users.add(userC);
		Group Flatmates = new Group("Flatmates","Daily Expenses Group",users);
		
		Expense exp1 = new Expense("Grocery",new Balance("Rs",300.0),Flatmates,SplitStrategy.EQUAL,userA);
		
		exp1.showExpense();
		
		
	}
}
