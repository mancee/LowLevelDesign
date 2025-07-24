package LoggingSystem;

public class Client {
	
	public static void main(String[] args) {
		
		LogFormatter format = new Format1();
		FileAppender fileAppender = new FileAppender();
		LogConfig config = new LogConfig(LogLevel.DEBUG,fileAppender, format);
		Logger logger = Logger.createInstance(config);
		
		logger.debug("This is a debug log!");
		logger.info("This is info log");
		logger.critical("This is critical log");
	}
	
}
