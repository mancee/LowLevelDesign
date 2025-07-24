package RideSharingApp;

public class Car extends Vehicle{	
	
	Car(String numberPlate){
		super(numberPlate);
	}
	
	@Override
	public int baseFarePerKm() {
		// TODO Auto-generated method stub
		return 20;
	}
	
	
}
