package BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Catalogue implements Search{
	
	HashMap<String,List<Movie>> byName;
	HashMap<String,List<Movie>> byGenre;
	HashMap<City,List<Theatre>> cinemaByCity;
	HashMap<String,Theatre> theatreByName;
	

	public Catalogue() {
		this.byName = new HashMap<>();
		this.byGenre = new HashMap<>();
		this.cinemaByCity = new HashMap<>();
	}

	@Override
	public List<Movie> SearchByName(String name) {
		this.byName.putIfAbsent(name, new ArrayList<>());
		return this.byName.get(name);
	}

	@Override
	public List<Movie> SearchByGenre(String genre) {
		this.byGenre.putIfAbsent(genre, new ArrayList<>());
		return this.byGenre.get(genre);
	}

	@Override
	public List<Theatre> SearchTheatreByCity(City c) {
		this.cinemaByCity.putIfAbsent(c, new ArrayList<>());
		return this.cinemaByCity.get(c);
	}
	
	public Theatre getTheatre(String name) {
		return this.theatreByName.get(name);
	}

}
