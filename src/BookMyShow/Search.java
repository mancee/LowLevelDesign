package BookMyShow;

import java.util.List;

public interface Search {
	
	List<Movie> SearchByName(String name);
	List<Movie> SearchByGenre(String genre);
	List<Theatre> SearchTheatreByCity(City c);
}
