package NotificationSystem;

public class Email implements NotificationSender{

	@Override
	public void sendNotification(String content ) {
		System.out.println("Sending notification via email.. ");
		System.out.println(content);
	}

}
