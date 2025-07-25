package LinkedIn;

enum JobStatus{
	APPLIED, REJECTED, ONHOLD, INREVIEW
}

public class JobPosting {
	private int jobId,yoe;
	private String description;
	private Title title;
	private JobStatus status;

	public JobPosting(int jobId, int yoe, String description, Title title) {
		this.jobId = jobId;
		this.yoe = yoe;
		this.description = description;
		this.title = title;
	}


	public int getJobId() {
		return jobId;
	}


	public void setJobId(int jobId) {
		this.jobId = jobId;
	}


	public int getYoe() {
		return yoe;
	}


	public void setYoe(int yoe) {
		this.yoe = yoe;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Title getTitle() {
		return title;
	}


	public void setTitle(Title title) {
		this.title = title;
	}


	public JobStatus getjobStatus() {
		return status;
	}


	public void setstatus(JobStatus status) {
		this.status = status;
	}
	
	
}
