package FileSystem;

import java.util.*;

public class Directory extends FileSystemNode {
	
	public Directory(String name) {
		super(name);
	}

	@Override
	public boolean isFile() {
		return false;
	}

	@Override
	public void display(int depth) {
		
		String indent = " ".repeat(depth);
		
		System.out.println(indent + "📁 "+ getName());
		
		for(FileSystemNode child : getChildren()) {
			child.display(depth+1);
		}
	}

}
