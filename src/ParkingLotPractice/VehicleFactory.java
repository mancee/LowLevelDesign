package ParkingLotPractice;

public class VehicleFactory {
	
	public Vehicle createVehicle(VehicleType type, String license){
		Vehicle vehicle;
		
		switch(type) {
		case VehicleType.CAR:
			vehicle = new Car(license,type);
			break;
		case VehicleType.BIKE:
			vehicle = new Bike(license,type);
			break;
		case VehicleType.ELECTRICCAR:
			vehicle = new ElectricCar(license,type);
			break;
		case VehicleType.TRUCK:
			vehicle = new Truck(license,type);
			break;
		case VehicleType.HANDICAPPED:
			vehicle = new Handicapped(license,type);
			break;
		default:
			vehicle = null;
		}
		return vehicle;
	}
}
