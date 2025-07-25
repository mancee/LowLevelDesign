package BookMyShow;

import java.time.LocalDate;

public class Show {
	
	private Movie movie;
	private LocalDate startTime , endTime;

	Show(Movie mov, LocalDate st, LocalDate end){
		this.setMovie(mov);
		this.setStartTime(st);
		this.setEndTime(end);
	}
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public LocalDate getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}
	public LocalDate getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}
	
	
}
