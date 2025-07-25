package Facebook;

abstract class Content {
	protected String text;
	protected byte[] picture;
	protected Member owner;
	protected int id;
	
	Content(String text, Member owner, int id, byte[] picture)
	{	
		this.text = text;
		this.owner=owner;
		this.id = id;
		this.picture=picture;
	}
	abstract Content getContent();
}
