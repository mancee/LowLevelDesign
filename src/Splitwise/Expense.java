package Splitwise;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

enum SplitStrategy {
	EQUAL, EXACT, PERCENTAGE
}

public class Expense {
	
	private String expenseId, title;
	private Balance balance;
	private Group groupId;
	private User expenseOwner;
	private PriorityQueue<Node> positives,negatives;
	private SplitStrategy strategy;
	private List<PaymentNode> transactions;
	private Node expenseOwnerNode; // testing
	
	public Expense(String title, Balance bal, Group id,SplitStrategy strategy,User user) {
		this.setBalance(bal);
		this.setTitle(title);
		this.setGroupId(id);
		this.expenseOwner = user;
		this.strategy = strategy;
		this.positives = new PriorityQueue<>();
		this.negatives  = new PriorityQueue<>();
		this.addPaymentToUsersEqually();
	}
	
	public void addPaymentToUsers() {
		switch(this.strategy) {
		case SplitStrategy.EQUAL :
			addPaymentToUsersEqually();
		case SplitStrategy.EXACT :
			System.out.println("We are woking on this functionality! ");
		default:
			break;
			
		}
		
	}
	// we can create separate class also for - split strategy
	public void addPaymentToUsersEqually() {
		double amount = this.balance.getAmount();
		double part = amount/this.groupId.getMembers().size();
		
		for(User user : this.groupId.getMembers()) {
			// equal split
			if(user.equals(expenseOwner)) {
				 continue;
			}
			negatives.add(new Node(user,-part));
		}
		expenseOwnerNode = new Node(expenseOwner,part*(this.groupId.getMembers().size()-1));
		positives.add(expenseOwnerNode);
		this.makePaymentGraph();
	}
	
	public void makePaymentGraph() {
		// create nodes
		transactions = new ArrayList<>();
		
		while(negatives.size()>0) {
			Node sender = negatives.poll();
			Node receiver = positives.poll();
			
			double amountTransfered = Math.min(-sender.getFinal_balance() , receiver.getFinal_balance());
			transactions.add(new PaymentNode(sender.getUser(),receiver.getUser(),amountTransfered));
			
			sender.setFinal_balance(amountTransfered+sender.getFinal_balance());
			receiver.setFinal_balance(receiver.getFinal_balance()-amountTransfered);
			
			if(sender.getFinal_balance()!=0) {
				negatives.add(sender);
			}
			if(receiver.getFinal_balance()!=0) {
				positives.add(receiver);
			}
		}
		
	}
	// we can put balance in user class only and create node of that
	public void showExpense() {
//		Node node = expenseOwnerNode;
//		if(node.getFinal_balance()>0) System.out.println("Owes you -" + node.getFinal_balance());
//		else System.out.println("You owe -" + node.getFinal_balance());
		
		double owed_amount=0;
		for(PaymentNode trans : transactions) {
			System.out.println( trans.getFromUser().getName() +" owes "+ trans.getToUser().getName() +" " + trans.getAmount());
			owed_amount += trans.getAmount();
		}
		if(owed_amount>0) System.out.println("Owes you " + owed_amount);
		else System.out.println("You owe " + owed_amount);
	}
	
	public Group getGroupId() {
		return groupId;
	}

	public void setGroupId(Group groupId) {
		this.groupId = groupId;
	}
	
	public String getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(String expenseId) {
		this.expenseId = expenseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Balance getBalance() {
		return balance;
	}
	public void setBalance(Balance balance) {
		this.balance = balance;
	}
	
	
}
