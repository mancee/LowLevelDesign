package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	// find my nearest theatre or in the given city for particular movie , search the movie by genre, 
	public static void main(String[] args) {
		
		// add theatre , add halls
		Admin admin = new Admin("Mansi");
		City city = new City("Delhi",new Location(12.9090,45.90887));

		
		admin.addTheatre(city, "Miraj");
		admin.addTheatre(city, "Cinepolies");
		admin.addTheatre(city, "PVR");
		admin.addHalls(admin.catalogue.getTheatre("Miraj"), "Hall 1");
		admin.addHalls(admin.catalogue.getTheatre("Miraj"), "Hall 2");
		admin.addHalls(admin.catalogue.getTheatre("Miraj"), "Hall 3");
		
		// get theratres nearby 
		
		
		// search movie by name
		
		// get shows for movie
		
		// book movie
		
		// cancel movie
	}
}
