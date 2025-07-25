package Amazon;

public class Item {
	
	// can directly add product here and quantity that's it or just product id and quantity
	
	private String productID;
	private int quantity;
	private double price;
	
	public boolean updateQuantity(int quantity) {
		if(this.quantity+quantity<0) return false;
		this.quantity += quantity;
		return true;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
