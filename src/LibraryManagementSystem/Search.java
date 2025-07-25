package LibraryManagementSystem;

import java.util.List;

public interface Search {
	
	List<Book> getBookByTitle(String title);
	List<Book> getBookByAuthor(String Author);
	List<Book> getBookByCategory(String cat);
}
