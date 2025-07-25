package LibraryManagementSystem;

import java.time.LocalDate;

public class BookReservation {
	private LocalDate reservationDate;
	private ReservationStatus status;
	private String memberId;
	
	
	public BookReservation(LocalDate reservationDate, ReservationStatus status) {
		this.reservationDate = reservationDate;
		this.status = status;
	}
	
	public LocalDate getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}
	public ReservationStatus getStatus() {
		return status;
	}
	public void setStatus(ReservationStatus status) {
		this.status = status;
	}
	private static BookReservation getReservationDetails() {
		return this;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

}
