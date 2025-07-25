package LoggingSystem;

public class Logger {
	// singleton class 
	
	LogConfig config;
	private static Logger instance = null;
	LogFormatter formatter;
	
	Logger( LogConfig config){
		this.config = config;
		this.formatter = config.getFormat();
	}
	
	public static Logger createInstance(LogConfig config) {
		if(instance ==null) {
			instance = new Logger(config);
		}
		return instance;
	}
	
	public void setConfig(LogConfig config) {
	    synchronized (Logger.class) { // Ensure thread safety while updating config
	      this.config = config;
	    }
	  }
	
	public void log(LogLevel level, String message) {
		if(this.config.getLevel().getValue() <= level.getValue()) {
			LogMessage msg = new LogMessage(message);
			msg.setContent(this.formatter.format(msg, level));
			config.getAppender().writeLog(msg);
		}
	}
	
	public void debug(String message) {
		log(LogLevel.DEBUG,message);
	}
	
	public void info(String message) {
		log(LogLevel.INFO,message);
	}
	
	public void warning(String message) {
		log(LogLevel.WARNING,message);
	}
	
	public void error(String message) {
		log(LogLevel.ERROR,message);
	}
	
	public void critical(String message) {
		log(LogLevel.CRITICAL,message);
	}
}
