package LoggingSystem;

public abstract class LogFormatter {
	
	public abstract String format(LogMessage msg,LogLevel level);
}
