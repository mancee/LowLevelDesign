package LibraryManagementSystem;

import java.time.LocalDate;

public class BookLending {
	
	private LocalDate dateLending,dueDate;
	private String memberId;
	private String barCode;

	public BookLending(LocalDate dateLending, LocalDate dueDate) {
		this.dateLending = dateLending;
		this.dueDate = dueDate;
	}

	public LocalDate getDateLending() {
		return dateLending;
	}

	public void setDateLending(LocalDate dateLending) {
		this.dateLending = dateLending;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	public boolean lendBook(String barcode, String memberId) {
		// should have hashmap for lendbook to see whom we have lend the books to
	}
	
}
