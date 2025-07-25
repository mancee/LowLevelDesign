package Facebook;

import java.time.LocalDate;

public class Post extends Content {
	
	int likes, shares;
	LocalDate createdAt;
	Comment comments;
	Post(String text, int id, Member owner, byte[] picture){
		super(text, owner, id, picture);
		createdAt = LocalDate.now();
	}
	
	@Override
	Post getContent() {
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
