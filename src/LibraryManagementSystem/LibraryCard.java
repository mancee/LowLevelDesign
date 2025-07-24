package LibraryManagementSystem;

import java.time.LocalDate;

public class LibraryCard {
	private String cardNumber, barCode;
	private LocalDate validity;
	
	
	public LibraryCard(String cardNumber, String barCode, LocalDate validity) {
		this.cardNumber = cardNumber;
		this.barCode = barCode;
		this.validity = validity;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public LocalDate getValidity() {
		return validity;
	}
	public void setValidity(LocalDate validity) {
		this.validity = validity;
	}
	public boolean isActive() {
		return validity.isAfter(LocalDate.now());
	}
	
	
}
