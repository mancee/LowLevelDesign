package Facebook;

import java.time.LocalDate;
import java.time.LocalTime;

enum ConnectionStatus{
	PENDING, ACCECPTED, CANCELLED, REJECTED
}

public class ConnectionInvitation {
	protected ConnectionStatus status;
	protected Member memberInvited;
	protected LocalDate dateCreated;
	protected LocalTime dateUpdated;
	
	ConnectionInvitation(Member friend){
		this.memberInvited = friend;
		this.dateCreated = LocalDate.now();
		this.status = ConnectionStatus.PENDING;
		
	}
}
