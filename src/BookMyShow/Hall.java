package BookMyShow;

import java.util.List;

public class Hall {
	
	private List<Show> show;
	private String name;
	private List<HallSeat> availableSeats;
	private List<HallSeat> bookedSeats;

	
	Hall(String name){
		this.name = name;
	}
	
	public List<Show> getShow() {
		return show;
	}
	public void addShow(Show show) {
		this.show.add(show);
		// notify/update search functionality 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<HallSeat> getAvailableSeats() {
		return availableSeats;
	}

	public void addAvailableSeats(HallSeat availableSeat) {
		this.availableSeats.add(availableSeat);
	}
	
	public List<HallSeat> getBookedSeats() {
		return bookedSeats;
	}

	public void addBookedSeats(HallSeat bookedSeat) {
		this.bookedSeats.add(bookedSeat);
	}
	
	
	
}
