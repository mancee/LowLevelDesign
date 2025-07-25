package Amazon;

import java.time.LocalDate;

public class OrderLog {
	private String orderNumber;
	private LocalDate creationDate;
	private OrderStatus status;
	private Member user;
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	// notify user for every log
	public void notifyUser() {
		user.notify("Your Order status is "+this.status );
	}

}
