package ParkingLotPractice;

enum ParkingTicketStatus {
	PAID, ACTIVE, CANCELLED
}

public class ParkingTicket {
	
	private int ticketAmount;
	private int id;
	private ParkingTicketStatus status;
	
	ParkingTicket(int base, int hour){
		this.ticketAmount = base*hour;
		this.status = ParkingTicketStatus.ACTIVE;
	}
	
	public int getTicketAmount() {
		return this.ticketAmount;
	}
	public void setTicketAmount(int ticketAmount) {
		this.ticketAmount = ticketAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ParkingTicketStatus getStatus() {
		return status;
	}
	public void setStatus(ParkingTicketStatus status) {
		this.status = status;
	}
	
	
	
	
}
