package BookMyShow;

public class PushNotificationOb implements Observer{

	@Override
	public void update(String msg) {
		System.out.println(msg);
		
	}

}
