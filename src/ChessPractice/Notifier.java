package ChessPractice;

public interface Notifier {
	
	public void addObserver(Player p);
	public void removeObserver(Player p);
	public void notifyUsers(Move move);
}
