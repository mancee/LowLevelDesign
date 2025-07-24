package Amazon;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

enum ShipmentStatus {
	SHIPPED, DELIVERED, ONHOLD, PENDING, INPROCESS, ABORTED
}

public class Shipment {
	private String shipmentNumber;
	private LocalDate shipmentDate;
	private LocalDate ETA;
	private String shipmentMethod;
	private List<ShipmentLog> logs;
	private Random rand = new Random();
	protected ShipmentStatus status;
	
	Shipment(){
		this.shipmentNumber = Integer.toString(rand.nextInt(10000));
		this.shipmentDate = LocalDate.now();
		this.status = ShipmentStatus.PENDING;
	}
	public void addShipmentLog(ShipmentLog log) {
		logs.add(log);
	}
	
	public LocalDate getShipmentDate() {
		return shipmentDate;
	}

	public String getShipmentMethod() {
		return shipmentMethod;
	}

	public void setShipmentMethod(String shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}

	public String getShipmentNumber() {
		return shipmentNumber;
	}

	public LocalDate getETA() {
		return ETA;
	}

	public List<ShipmentLog> getLogs() {
		return logs;
	}
}
