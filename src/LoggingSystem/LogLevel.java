package LoggingSystem;

public enum LogLevel {
	
	INFO(1), 
	DEBUG(2), 
	WARNING(3),
	ERROR(4),
	CRITICAL(5);
	
	private final int value;
	
	LogLevel(int val){
		this.value = val;
	}
	
	public int getValue() {
        return value;
    }

	public boolean isGreaterOrEqual(LogLevel other) {
        return this.value >= other.value;
    }
}
