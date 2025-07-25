package ParkingLotPractice;

public class ParkingManager {
	public static void main(String[] args) {
		
		VehicleFactory vehicleFactory = new VehicleFactory();
		User mansi = new User("Mansi","Mansi");
		
		
		Vehicle car = vehicleFactory.createVehicle(VehicleType.CAR, "0001");
		Vehicle truck = vehicleFactory.createVehicle(VehicleType.TRUCK, "0021");
		Vehicle bike = vehicleFactory.createVehicle(VehicleType.BIKE, "1001");
		
		ParkingLot myParkingSystem = ParkingLot.getInstance();
		myParkingSystem.addFloor(1);
		
		myParkingSystem.parkVehicle(car);
		if(myParkingSystem.unParkVehicle(truck)) {
			Payment pay = new CreditCard();
			pay.processPay(truck.getTicket().getTicketAmount());
		}
		myParkingSystem.parkVehicle(bike);
		myParkingSystem.parkVehicle(truck);
		
		// payment
		if(myParkingSystem.unParkVehicle(bike)) {
			Payment pay = new UPI();
			pay.processPay(bike.getTicket().getTicketAmount());
			bike.getTicket().setStatus(ParkingTicketStatus.PAID);
		}
		if(myParkingSystem.unParkVehicle(car)) {
			Payment pay = new CreditCard();
			pay.processPay(car.getTicket().getTicketAmount());
			car.getTicket().setStatus(ParkingTicketStatus.PAID);
		}
		if(myParkingSystem.unParkVehicle(truck)) {
			Payment pay = new CreditCard();
			pay.processPay(truck.getTicket().getTicketAmount());
			truck.getTicket().setStatus(ParkingTicketStatus.PAID);
		}
	}
}
