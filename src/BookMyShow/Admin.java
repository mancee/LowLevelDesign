package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User{
	Catalogue catalogue;
	
	Admin(String name) {
		super(name);
		this.catalogue = new Catalogue();
	}
	
	void addTheatre(City c, String name) {
		List<Theatre> theatres = catalogue.SearchTheatreByCity(c);
		theatres.add(new Theatre(name,c));
	}
	
	void addHalls(Theatre t, String hall) {
		t.addHalls(new Hall(hall));
	}
	
	void addSeats(Hall hall,HallSeat seat) {
		hall.addAvailableSeats(seat);
	}

}
