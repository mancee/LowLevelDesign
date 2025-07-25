package FileSystem;

import java.time.LocalDateTime;
import java.util.*;

public abstract class FileSystemNode {
	
	private String name;
	Map<String,FileSystemNode> children;
	private LocalDateTime createdAt, modifiedAt;
	
	public FileSystemNode(String name) {
		this.name = name;
		this.children = new HashMap<>();
		this.createdAt = LocalDateTime.now();
		this.modifiedAt = LocalDateTime.now();
	}
	
	public abstract boolean isFile();
	public abstract void display(int depth);
	
	public void addChild(String name, FileSystemNode child) {
		children.put(name,child);
		this.modifiedAt = LocalDateTime.now();
	}
	public boolean hasChild(String name) {
		return this.children.containsKey(name);
	}
	public FileSystemNode getChild(String name) {
		return this.children.get(name);
	}
	public boolean removeChild(String name) {
		if(hasChild(name)){
			children.remove(name);
			return true;
		}
		return false;
	}
	public Collection<FileSystemNode> getChildren(){
		return this.children.values();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Map<String, FileSystemNode> getChildren() {
//		return children;
//	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(LocalDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

}
