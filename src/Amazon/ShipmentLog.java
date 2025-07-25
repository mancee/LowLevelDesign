package Amazon;

import java.time.LocalDate;

public class ShipmentLog {
	protected String shipmentNumber;
	protected ShipmentStatus status;
	protected LocalDate date;
	protected Member user;
	
	// notify user for every log
	public void notifyUser() {
		user.notify("Your Order status is "+this.status );
	}
}
