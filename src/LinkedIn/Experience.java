package LinkedIn;

import java.time.LocalDate;

enum Title{
	SOFTWARE_ENG, SITE_RELIABILITY_ENG, ACCOUNTANT, EXECUTIVE_ASSISTANT, HARDWAREE_ENG
}

public class Experience {
	private int yoe;
	private Company company;
	private Title title;
	private boolean current;
	private DegreeType type;
	private LocalDate startDate, endDate;
	
	
	public Experience(int yoe, Company company, Title title, boolean current, DegreeType type, LocalDate startDate,
			LocalDate endDate) {
		this.yoe = yoe;
		this.company = company;
		this.title = title;
		this.current = current;
		this.type = type;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getYoe() {
		return yoe;
	}
	public void setYoe(int yoe) {
		this.yoe = yoe;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
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
	
	
}
