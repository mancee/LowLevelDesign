package Amazon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

enum OrderStatus {
	PENDING, PLACED, DISPATCHED, SHIPPED, COMPLETED, CANCELLED, REFUND_APPLIED
}

public class Order {
	private OrderStatus status;
	private String OrderNumber;
	private LocalDate orderPlacedAt;
	private List<OrderLog> logs;
	private Payment pay;
	private Shipment shipment;
	private Member member;
	
	Order(Member member){
		this.logs = new ArrayList<>();
		this.OrderNumber = Integer.toString(logs.size()+1);
		this.status = OrderStatus.PENDING;
		this.member = member;
		this.orderPlacedAt = LocalDate.now();
	}
	private boolean sendForShipment(){
		shipment = new Shipment();
		
		return shipment.status!=ShipmentStatus.ABORTED;
	}
	
	public boolean makePayment() {
		pay = new CreditCard();
		pay.processPayment();
		return pay.status == PaymentStatus.PAID ;
	}
	
	public void addOrderLogs(OrderLog log) {
		logs.add(log);
	}
	
	public String getOrderNumber() {
		return OrderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}

	public LocalDate getOrderPlacedAt() {
		return orderPlacedAt;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public OrderStatus getStatus() {
		return this.status;
	}
}
