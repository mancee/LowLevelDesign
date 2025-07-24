package Amazon;

import java.util.List;

public class Member extends Customer{
	private Account account;
	private List<Order> orders;
	
	Member(){
		super();
	}

	public List<Order> getOrders() {
		return orders;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public OrderStatus placeOrder() {
		// checkout and pay the payment
		Order order  = new Order(this);
		this.cart.checkout();
		order.makePayment();
		order.setStatus(OrderStatus.PLACED);
		System.out.println("Your Order is - " + order.getStatus() + " at " + order.getOrderPlacedAt());
		orders.add(order);		
		return order.getStatus();
	}
	
	public void notify(String msg) {
		System.out.println("Member "+account.getName()+" : "+ msg);
	}
}
