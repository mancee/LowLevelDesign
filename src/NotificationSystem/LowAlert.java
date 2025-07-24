package NotificationSystem;

public class LowAlert extends NotificationTemplate{

	@Override
	public void setContent(String content) {
		this.content = String.format("""
				-------------------- LOW ALERT ----------------------\n
				|              %s             |
				|                                                       |
				|-------------------------------------------------------|
				""",content);
		
	}
	
}
