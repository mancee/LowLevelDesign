package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{
	
	private HashMap<String,List<Book>> bookByTitle, bookByCategory, bookByAuthor;
	
	Catalog(){
		bookByTitle = new HashMap<>();
		bookByCategory = new HashMap<>();
		bookByAuthor = new HashMap<>();
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return bookByTitle.get(title);
		
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		return bookByAuthor.get(author);
		
	}

	@Override
	public List<Book> getBookByCategory(String cat) {
		return bookByCategory.get(cat);
		
	}
	
	public void addBookByTitle(String title, Book book) {
		this.bookByTitle.putIfAbsent(title,new ArrayList<>());
		this.bookByTitle.get(title).add(book);
	}
	
	public void addBookByAuthor(String auth, Book book) {
		this.bookByAuthor.putIfAbsent(auth,new ArrayList<>());
		this.bookByAuthor.get(auth).add(book);
	}
}
