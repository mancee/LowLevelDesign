package NotificationSystem;

public class SMS implements NotificationSender{

	@Override
	public void sendNotification(String content ) {
		System.out.println("Sending Notification via SMS..");
		System.out.println(content);
	}

}
