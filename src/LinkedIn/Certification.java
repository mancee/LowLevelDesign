package LinkedIn;

public class Certification {
	private int licenseId;
	private String name;
	
	public Certification(int licenseId, String name) {
		this.setLicenseId(licenseId);
		this.setName(name);
	}

	public int getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(int licenseId) {
		this.licenseId = licenseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
