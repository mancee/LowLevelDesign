package LoggingSystem;

import java.time.LocalDateTime;

public class LogMessage {
	
	private String content;
	private LocalDateTime time;
	
	LogMessage(String content){
		this.setContent(content);
		this.time = LocalDateTime.now();
	}
	

	public LocalDateTime getTime() {
		return time;
	}


	public void setTime(LocalDateTime time) {
		this.time = time;
	}



	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
