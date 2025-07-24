package Amazon;

public class Customer {
	protected ShoppingCart cart;
	
	Customer(){
		cart = new ShoppingCart();
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public ShoppingCart getShoppingCart() {
		return cart;
	}
	
	public boolean addItemToCart(Item item) {
		cart.addItem(item);
		return true;
	}
	
	public boolean removeItemFromCart(Item item) {
		if(cart.getItems().size()==0) return false;
		cart.getItems().remove(item);
		return true;
	}
	
}
