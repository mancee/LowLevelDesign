package NotificationSystem;

public class Push implements NotificationSender{

	@Override
	public void sendNotification(String content) {
		System.out.println("Sending Notification via Push..");
		System.out.println(content);
	}

}
