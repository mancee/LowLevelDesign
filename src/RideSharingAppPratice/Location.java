package RideSharingAppPratice;

public class Location {
	
	private double lng, lat;
	private String city;
	
	Location(double lng, double lat){
		this.setLng(lng);
		this.setLat(lat);
	}
	
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public double calculateDistance(Location l2) {
		double dlng = Math.abs(this.getLng()-l2.getLng());
		double dlat = Math.abs(this.getLat()-l2.getLat());
		return Math.sqrt(dlng*dlng + dlat*dlat);
	}
	
}
