package LinkedIn;

enum SkillType{
	TECHNICAL, SOFT
}

public class Skill {
	private String name;
	private SkillType type;
	
	Skill(String name, SkillType type){
		this.setName(name);
		this.setType(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SkillType getType() {
		return type;
	}

	public void setType(SkillType type) {
		this.type = type;
	}
	
	
}
