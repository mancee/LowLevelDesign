package BookMyShow;

import java.util.List;

public class Theatre {
	
	private String name;
	private City city;
	List<Hall> halls;
	// add shows here ?
	
	Theatre(String name, City city){
		this.setLoc(city);
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getLoc() {
		return city;
	}
	public void setLoc(City city) {
		this.city = city;
	}
	public List<Hall> getHalls() {
		return halls;
	}
	public void addHalls(Hall hall) {
		this.halls.add(hall);
	}
	
	

}
