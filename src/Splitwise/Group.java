package Splitwise;

import java.util.List;

public class Group {
	private String groupId, title, description;
	private List<User> members;
	
	
	Group(String title,String desc,List<User> mem){
		this.setTitle(title);
		this.setDescription(desc);
		this.setMembers(mem);
	}
	
	public boolean addMembers(List<User> mem) {
		this.members.addAll(mem);
		return true;
	}
	
	public boolean removeMembers(List<User> mem) {
		for(User m : mem) {
			this.members.remove(m);
		}
		return true;
	}
	
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<User> getMembers() {
		return members;
	}
	public void setMembers(List<User> members) {
		this.members = members;
	}
	
	
	
}
