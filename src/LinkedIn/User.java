package LinkedIn;

import java.time.LocalDate;
import java.util.List;

public class User extends Account{
	
	private String name, email;
	private Profile profile;
	private List<User> connections;
	private List<Integer> savedjobs;

	User(String user, String pass) {
		super(user, pass);
		
	}
	
	void addExperience(int yoe, Company comp, Title title, boolean  curr,DegreeType type, LocalDate stdate, LocalDate enddate) {
		profile.addExp(new Experience(yoe,comp,title,curr,type,stdate,enddate));
	}
	
	void addCertification() {
		
	}
	
	List<Experience> getExp() {
		return profile.getExp();
	}
	
	List<Certification> getCert(){
		return profile.getCerts();
	}
	
	List<Skill> getSkills(){
		return profile.getSkills();
	}
	
	void addSkills(Skill sk) {
		
	}
	
	void addConnection(User friend) {
		connections.add(friend);
	}
	
	void applyJob(int id) {
		savedjobs.add(id);
	}
	
}
