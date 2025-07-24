package LibraryManagementSystem;

public class Book {
	
	private String title, author, ISBN, subject;
	
	
	public Book(String title, String author, String iSBN, String subject) {
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.subject = subject;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
