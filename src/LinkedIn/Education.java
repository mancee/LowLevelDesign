package LinkedIn;

import java.time.LocalDate;

enum DegreeType{
	DIPLOMA, MASTERS, BACHELORS, HIGH_SCHOOL
}

public class Education {
	private String name, university;
	private LocalDate startDate, endDate;
	private boolean current;
	private DegreeType type;
	
	
	public Education(String name, String university, LocalDate startDate, LocalDate endDate, boolean current,
			DegreeType type) {

		this.name = name;
		this.university = university;
		this.startDate = startDate;
		if(current) this.endDate = LocalDate.now();
		this.current = current;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public boolean isCurrent() {
		return current;
	}
	public void setCurrent(boolean current) {
		this.current = current;
	}
	public DegreeType getType() {
		return type;
	}
	public void setType(DegreeType type) {
		this.type = type;
	}
	
	
}
