package LoggingSystem;

public class JSONTextFormat extends LogFormatter{

	@Override
	public String format(LogMessage msg, LogLevel level) {
		// TODO Auto-generated method stub
		
		return new String("Time : " + msg.getTime()  + "\nLogLevel : "+ level +" \nMessage :" + msg.getContent());
	}

}
