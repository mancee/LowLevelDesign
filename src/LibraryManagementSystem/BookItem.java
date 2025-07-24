package LibraryManagementSystem;

import java.time.LocalDate;

public class BookItem {
	
	private double price;
	private Rack rack;
	private String barcode;
	private BookStatus status;
	private BookFormat format;
	private LocalDate pubDate;
	private boolean checkout;
	private Member memberId;
	
	public BookItem(double price, Rack rack, String barcode, BookStatus status, BookFormat format, LocalDate pubDate) {
		super();
		this.price = price;
		this.rack = rack;
		this.barcode = barcode;
		this.status = status;
		this.setFormat(format);
		this.pubDate = pubDate;
		this.setCheckout(false);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public BookStatus getStatus() {
		return status;
	}
	public void setStatus(BookStatus status) {
		this.status = status;
	}
	public LocalDate getPubDate() {
		return pubDate;
	}
	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}
	public Rack getRack() {
		return rack;
	}
	public void setRack(Rack rack) {
		this.rack = rack;
	}
	public BookFormat getFormat() {
		return format;
	}
	public void setFormat(BookFormat format) {
		this.format = format;
	}
	public boolean isCheckout(String memberId) {
		
		if(!BookLending.lendBook(this.getBarcode(),memberId)) return false;
		this.setStatus(BookStatus.LOANDED);
		return true;
	}

}
