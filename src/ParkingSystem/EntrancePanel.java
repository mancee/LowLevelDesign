package ParkingSystem;

public class EntrancePanel {
	
	private ParkingTicket ticket;
	
	
	// generate ticket 
	void generateTicket() {
		ticket = new ParkingTicket();
		ticket.setStatus(ParkingTicketStatus.ACTIVE);
		ticket.generateReciept();
	}
}
