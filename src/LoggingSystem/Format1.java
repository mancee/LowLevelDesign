package LoggingSystem;

import java.time.LocalDateTime;

public class Format1 extends LogFormatter{

	@Override
	public String format(LogMessage msg, LogLevel level) {

		
		LocalDateTime time = msg.getTime();
		String text = msg.getContent();
		
		return new String(level + " " + time + " " + text);
	}

}
