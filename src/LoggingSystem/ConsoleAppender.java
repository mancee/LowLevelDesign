package LoggingSystem;

public class ConsoleAppender implements LogAppender {

	@Override
	public void writeLog(LogMessage msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

}
