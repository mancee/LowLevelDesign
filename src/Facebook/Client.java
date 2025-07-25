package Facebook;

public class Client {
	
	public static void main(String[] args) {
		Member facebookmember1 = new Member("Mansi","Female","mansi@gmail.com","9725267576","password");
		Member facebookmember2 = new Member("Isha","Female","isha@gmail.com","2345678900","password2");
		
		facebookmember1.getProfile();
		facebookmember2.getProfile();
		
		facebookmember2.sendConnectionRequest(facebookmember1);
		
		facebookmember2.acceptConnectionRequest(facebookmember1);
		
		Message msg =  facebookmember2.createMessage("Hello! How are you ?",null);
		facebookmember2.sendMessage(msg, facebookmember1);
		
		facebookmember1.createPost("Hello everybody 1", null);
		facebookmember1.createPost("Hello everybody 2", null);
		facebookmember1.createPost("Hello everybody 3", null);
		
		facebookmember1.getPost();
		facebookmember2.getPost();
	
		
	}
	
}
