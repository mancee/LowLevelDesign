package BookMyShow;

public class Location {
	
	private double lat,lon;
	
	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	Location(double lat,double lon){
		this.setLat(lat);
		this.setLon(lon);
	}
}
