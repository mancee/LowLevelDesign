package Swiggy;

import java.util.List;

enum PaymentMethod{
	CreditCard, Cash, UPI
}

public class Order {
	
	private int orderId;
	private List<Item> items;
	private double amount;
	private PaymentMethod pay;
	private Payment p;
	
	Order(List<Item> items){
		this.items.addAll(items);
	}
	
	void checkout() {
		for(Item item:this.items) {
			this.amount += item.getDish().getAmount();
		}
		System.out.println("amount to be paid -" + this.amount);
		
		System.out.println("Payment Method");
		// hardcode 
		pay = PaymentMethod.Cash;
		
		switch(pay) {
		case PaymentMethod.Cash:
			p = new Cash();
			p.processPayment();
		
		case PaymentMethod.CreditCard:
			p = new CreditCard();
			p.processPayment();
		default :
			break;
		}
	}
	
}
