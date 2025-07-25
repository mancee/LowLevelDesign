package RideSharingAppPratice;

public class RideSharingAppClient {
	
	public static void main(String[] args) {
		User passenger1 = new User("Mansi","gftyft","ggfuyfyg");
		User passenger2 = new User("Disha","gjgygiu","yfuyfy");
		
		Driver d1 = new Driver("driver1","guyftudf","ftyfutfyu",new Car("1344343"),new Location(12.9659,77.6989));
		Driver d2 = new Driver("driver2","hiyguyfyu","hgjyfyu",new Car("366776"), new Location(12.9699,77.6499));
		Driver d3 = new Driver("driver3","gyyigiygu","hgyftuf",new Bike("545476"),new Location(17.387140,78.491684));
		
		RideMatching service = new RideMatching();
		
		service.addDriver(d1);
		service.addDriver(d3);
		service.addDriver(d2);
		
		passenger1.setLocation(new Location(12.9362,77.7055));
		passenger2.setLocation(new Location(13.004725,77.687592));
		
		service.rideMatch(passenger1, new StandardFare(), new Location(13.199379,77.710136));
		service.rideMatch(passenger2, new LuxuryFare(), new Location(13.199379,77.710136));
	}
	
}
