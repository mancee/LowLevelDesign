package NotificationSystem;

public class Client {
	
	public static void main(String[] args) {
		NotificationTemplate nt = new LowAlert();
		
		nt.setContent("This is low alert!");
//		System.out.println( nt.getContent());
		
		NotificationSender sender = new Email();
		sender.sendNotification(nt.getContent());
		
		sender = new Push();
		nt = new MediumAlert();
		nt.setContent("This is medium Alert!");
		sender.sendNotification(nt.getContent());
		
		
		// how to add observers and topics now 
		
	}
}
