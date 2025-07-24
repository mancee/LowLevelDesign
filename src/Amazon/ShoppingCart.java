package Amazon;

import java.util.List;

public class ShoppingCart {
	
	private List<Item> items;

	public List<Item> getItems() {
		return items;
	}
	
	public boolean addItem(Item item) {
		items.add(item);
		return true;
	}
	
	public boolean removeItem(Item item) {
		if(items.size()==0) return false;
		items.remove(item);
		return true;
	}
	
	public boolean updateItemQuantity(Item item, int quantity) {
		if(this.items.size()==0 || !this.items.contains(item)) return false;
		item.updateQuantity(quantity);
		return true;
	}
	
	public boolean checkout() {
		return true;
	}
	
}
