package BookMyShow;

enum BookingStatus{
	BOOKED, CANCELLED, PENDING, REFUNDED
}
enum PaymentStatus{
	REFUNDED, PAID, CANCELLED, DECLINED, FAILED
}

public class Book {
	private Show show;
	private int tickets, bookingNumber;
	private BookingStatus status; 
	private Payment pay;
	
	Book(Show show, int tick){
		this.show=show;
		this.tickets=tick;
		// add the seats to booked seat 
	}
	
	void cancel() {
		this.status = BookingStatus.CANCELLED;
		//add the seat back to avialable seat
	}
	
	void checkout() {
		pay = new CreditCard("Masni", "123456789");
		pay.processPayment();
		// notify users
	}	
	
}
