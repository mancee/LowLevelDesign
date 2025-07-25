package LibraryManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member extends Account{
	private List<BookItem> checkedOutBooks;
	private LocalDate dateOfMembership;
	private int bookCount;
	
	public Member(String username, String password, String email, String phone) {
		super(username, password, email, phone);
		this.dateOfMembership = LocalDate.now();
		this.checkedOutBooks = new ArrayList<>();
	}
	
	public void CheckedOutBookItem(BookItem bi) {
		if(Constants.getMaxBookIssued()<=bookCount) {
			System.out.println("User has exceeded the maximum book keeping limit! ");
		}
		BookReservation reservation = BookReservation.getReservationDetails(bi);
		if(reservation != null && reservation.getMemberId() != this.getUsername()) {
			System.out.println("Book is reserved by another person!");
		}
		else if(reservation !=null) {
			reservation.setStatus(ReservationStatus.COMPLETED);
			this.checkedOutBooks.add(bi);
		}
		
		if(! bi.isCheckout(this.getUsername())) {
			
		}
		this.incrementBookCount();
	}
	
	public void removeReturnedBook(BookItem bi) {
		this.checkedOutBooks.remove(bi);
	}

	public LocalDate getDateOfMembership() {
		return dateOfMembership;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void incrementBookCount() {
		this.bookCount++;
	}

}
