package ParkingSystem;

import java.time.LocalDate;
import java.util.Random;

enum ParkingTicketStatus{
	PAID, ACTIVE
}

public class ParkingTicket {
	
	private ParkingTicketStatus status;
	private String ticketNumber;
	private LocalDate entryTime, exitTime;
	private double amount;
	private Random rand;
	
	ParkingTicket(){
		rand = new Random(10000);
		this.ticketNumber = Integer.toString(rand.nextInt());
		this.entryTime = LocalDate.now();
		this.exitTime = null;
		this.amount = 0.00;
	}

	public ParkingTicketStatus getStatus() {
		return status;
	}

	public void setStatus(ParkingTicketStatus status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public LocalDate getEntryTime() {
		return entryTime;
	}

	public LocalDate getExitTime() {
		return exitTime;
	}
	
	void generateReciept() {
		System.out.println(" Here's your Receipt - ");
		System.out.println("Ticket Number - " + this.getTicketNumber());
		System.out.println("Entry Time - " + this.getEntryTime());
		System.out.println("Exit Time - " + this.getExitTime());
		System.out.println("Amount Paid - " + this.getAmount());
		System.out.println("Thankyou! Please Visit Again!:)");
	}

}
