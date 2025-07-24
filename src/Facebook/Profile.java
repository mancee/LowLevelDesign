package Facebook;

public class Profile{
	
	protected byte[] profilePicture, coverPicture;
	protected String gender;
	
	Profile(String gender, byte[] profilePicture, byte[] coverPicture){
		this.gender = gender;
		this.profilePicture = profilePicture;
		this.coverPicture = coverPicture;
	}
	
	// can add work experince , education, interests, etc...
}
