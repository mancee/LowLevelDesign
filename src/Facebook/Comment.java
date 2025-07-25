package Facebook;

public class Comment extends Content{
	
	int likes, shares ;
	Comment(String text, int id, Member owner, byte[] picture){
		super(text, owner, id, picture);
	}
	
	@Override
	Comment getContent() {
		// TODO Auto-generated method stub
		return this;
	}
	void addLikes() {
		likes++;
	}
	void removeLikes() {
		likes--;
	}
	void addShares() {
		shares++;
	}
}
