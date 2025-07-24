package ParkingSystem;

public class ExitPanel {
	
	
	void scanTicket(ParkingTicket ticket) {
		// check if already processed 
		if(ticket.getStatus()==ParkingTicketStatus.PAID) {
			System.out.println("Your Ticket is already Paid. You can proceed now ! Thankyou! ");
		}
		else {
			processPayment(ticket);
		}
		ticket.generateReciept();
		System.out.println("------------ GATE IS OPENED NOW -------------------");
	}
	void processPayment(ParkingTicket ticket) {
//		ticket.generateReciept();
		System.out.println("Your payment is proccessed by Exit Panel ");
	}

}
