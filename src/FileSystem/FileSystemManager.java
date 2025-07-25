package FileSystem;

public class FileSystemManager {
	
	private FileSystemNode root;
	
	FileSystemManager(){
		this.root = new Directory("/");
	}
	
	public boolean isValidFilePath(String path) {
		// further split the path and check for all the directories in the path if they exist
		
		return path!=null && !path.isEmpty() && path.startsWith("/");
	}
	
	public boolean createPath(String path) {
		
		if(!isValidFilePath(path)) return false;
		
		String[] pathComponent = path.split("/");
		FileSystemNode current = root;
		
		for(int i=1;i<pathComponent.length-1;i++) { // so that we don't include file now
			
			String component = pathComponent[i];
			
			if(component=="") continue;
			
			if(!current.hasChild(component)) {
				current.addChild(component, new Directory(component));
			}
			
			FileSystemNode child = current.getChild(component);
			if(child.isFile()) return false;
			
			current = child;
		}
		
		String lastComponent = pathComponent[pathComponent.length-1];
		if(lastComponent=="") return false;
		
		if(current.hasChild(lastComponent)) return false;
		
		FileSystemNode node;
		if(lastComponent.contains(".")) {
			node = new File(lastComponent);
		}
		else node = new Directory(lastComponent);
		
		
		current.addChild(lastComponent, node);
		return true;
	}
	
	
	public FileSystemNode getNode(String path) {
		
		if(!isValidFilePath(path)) return null;
		
		String[] pathComponent = path.split("/");
		FileSystemNode current = root;
		
		for(int i=1;i<pathComponent.length-1;i++) {
			String comp = pathComponent[i];
			if(!current.hasChild(comp)) return null;
			
			FileSystemNode child = current.getChild(comp);
			if(child.isFile()) return null;
			
			current = child;
		}
		
		String lastComponent =  pathComponent[pathComponent.length-1];;
		
		if(lastComponent=="") return null;
		
		return current.getChild(lastComponent);
	}
	
	public boolean removePath(String path) {
		
		if(!isValidFilePath(path)) return false;
		
		String[] pathComponent = path.split("/");
		FileSystemNode current = root;
		
		for(int i=1;i<pathComponent.length-1;i++) {
			String comp = pathComponent[i];
			if(!current.hasChild(comp)) return false;
			
			FileSystemNode child = current.getChild(comp);
			if(child.isFile()) return false;
			
			current = child;
		}
		
		String lastComponent =  pathComponent[pathComponent.length-1];;
		
		if(lastComponent=="") return false;
		
		return current.removeChild(lastComponent);
	}
	
	public String getParentPath(String path) {
		int idx = path.lastIndexOf("/");
		
		if(idx<=0) return "/";
		
		return path.substring(0,idx);
	}
	
	public void display() {
		root.display(0);
	}
	
	public boolean setFileContent(String path, String content) {
		
		FileSystemNode current = getNode(path);
		if(current ==null || !current.isFile()) return false;
		
		File file = (File) current;
		file.appendContent(content);
		return true;
	}
	
	public String getFileContent(String path) {
		
		FileSystemNode current = getNode(path);
		if(current ==null || !current.isFile()) return "";
		
		File file = (File) current;
		
		return file.getContent();
	}
	
	public boolean ifFileExists(String path) {
		if(getNode(path)==null) return false;
		return true;
	}
}
