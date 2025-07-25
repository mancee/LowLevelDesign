package LibraryManagementSystem;


public class LibraryManagementSystem {
	
	private Catalog catalog;
	private static LibraryManagementSystem library = null;
	
	private LibraryManagementSystem() {
		this.setCatalog();
		System.out.println("-----WELCOME TO LIBRARY--------");
		
	}
	
	public static LibraryManagementSystem createInstance() {
		if(library==null) {
			library = new LibraryManagementSystem();
		}
		return library;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog() {
		this.getCatalog().addBookByTitle("Cracking the coding Interview",new Book("Cracking the coding Interview","Mansi","1234","Interviews"));
		this.getCatalog().addBookByTitle("System Design",new Book("System Design","Alex Xu","1234","Interviews"));
		
		this.getCatalog().addBookByAuthor("Mansi",new Book("Cracking the coding Interview","Mansi","1234","Interviews"));
		this.getCatalog().addBookByTitle("Alex Xu",new Book("System Design","Alex Xu","1234","Interviews"));
	}
	
}
