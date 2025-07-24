package NotificationSystem;

public class HighAlert extends NotificationTemplate {

	@Override
	public void setContent(String content) {
		this.content = String.format("""
				-------------------- HIGH ALERT ----------------------\n
				|              %s                 |
				|                                                       |
				|-------------------------------------------------------|
				""",content);
		
	}

}
