package LoggingSystem;

public class FileAppender implements LogAppender{
	
	
	
	@Override
	public void writeLog(LogMessage msg) {
		// TODO Auto-generated method stub
		System.out.println("Appending log in file " + msg.getContent());
	}

}
