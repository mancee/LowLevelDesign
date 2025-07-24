package RideSharingApp;

public class Bike extends Vehicle{

	Bike(String numberPlate){
		super(numberPlate);
	}
	
	@Override
	public int baseFarePerKm() {
		// TODO Auto-generated method stub
		return 10;
	}

}
