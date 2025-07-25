package LinkedIn;

import java.util.List;

public class Profile {
	private String headline;
	private List<Experience> exp;
	private List<Certification> certs;
	private List<Skill> skills;
	
	
	public Profile(String headline, List<Experience> exp, List<Certification> certs, List<Skill> skills) {
		this.headline = headline;
		this.exp = exp;
		this.certs = certs;
		this.skills = skills;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public List<Experience> getExp() {
		return exp;
	}
	public void addExp(Experience exp) {
		this.exp.add(exp);
	}
	public List<Certification> getCerts() {
		return certs;
	}
	public void setCerts(List<Certification> certs) {
		this.certs = certs;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(Skill skills) {
		this.skills.add(skills);
	}
	
	
	
}
