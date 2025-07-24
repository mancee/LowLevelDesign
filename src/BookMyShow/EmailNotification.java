package BookMyShow;

public class EmailNotification implements Observer{

	@Override
	public void update(String msg) {
		System.out.println(msg);
		
	}

}
