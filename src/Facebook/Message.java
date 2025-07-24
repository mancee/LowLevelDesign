package Facebook;

public class Message extends Content{
	
	Member[] sendTo;
	Message(String text, int id, Member owner, byte[] picture){
		super(text, owner, id, picture);
	}
	
	@Override
	Message getContent() {
		// TODO Auto-generated method stub
		return this;
	}
}
