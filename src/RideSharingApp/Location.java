package RideSharingApp;

public class Location {
	
	private double latitude, longitude;
	
	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	Location(double lat, double lng){
		this.latitude = lat;
		this.longitude = lng;
	}
	
	public double calcDistance(Location dest) {
		double dx = this.latitude - dest.latitude;
		double dy = this.longitude - dest.longitude;
		
		return Math.sqrt((dx*dx)-(dy*dy));
	}
	
}
