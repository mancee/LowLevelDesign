package NotificationSystem;

public class MediumAlert extends NotificationTemplate{
	
	
	@Override
	public void setContent(String content) {
		
		this.content = String.format("""
				-------------------- MEDIUM ALERT ----------------------\n
				|              %s         |
				|                                                       |
				|-------------------------------------------------------|
				""",content);
	}
	
	
}
