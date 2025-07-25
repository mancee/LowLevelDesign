package BookMyShow;

public abstract class Notifier {
	
	public abstract void attach(User u);
	
	public abstract void dettach(User u);
	
	public abstract void notifyObservers();
}
