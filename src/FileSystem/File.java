package FileSystem;

import java.time.LocalDateTime;
import java.util.Map;

public class File extends FileSystemNode{
	
	private String content;
	private String extension;
	

	public File(String name) {
		super(name);
		this.extension = extractExtension(name);
		this.content = "";
	}
	
	private String extractExtension(String name) {
		int idx = name.lastIndexOf('.');
		return idx >0 ? name.substring(idx+1):"";
	}

	public String getContent() {
		return content;
	}
	
	public void appendContent(String content) {
		this.content += content;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Override
	public boolean isFile() {
		return true;
	}

	@Override
	public void display(int depth) {
		
		// display with two for every depth
		
		String indent = " ".repeat(depth*2);
		
		System.out.println(indent + "📄 " + getName() +" " + getCreatedAt() );
		
	}
	
}
