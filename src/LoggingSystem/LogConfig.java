package LoggingSystem;

public class LogConfig {
	
	private LogLevel level;
	private LogAppender appender;
	private LogFormatter format;
	
	LogConfig(LogLevel level, LogAppender appender, LogFormatter format){
		this.level = level;
		this.appender = appender;
		this.format = format;
	}

	public LogLevel getLevel() {
		return level;
	}

	public void setLevel(LogLevel level) {
		this.level = level;
	}

	public LogAppender getAppender() {
		return appender;
	}

	public void setAppender(LogAppender appender) {
		this.appender = appender;
	}

	public LogFormatter getFormat() {
		return format;
	}

	public void setFormat(LogFormatter format) {
		this.format = format;
	}
	
	
}
