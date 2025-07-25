package Amazon;

import java.util.List;

class ProductReview{
	protected int rating;
	protected String review;
	protected Member reviewer;
}

public class Product {
	private String productId, name, description;
	private double price;
	private ProductCategory category;
	private int availableCount;
	private Account seller;
	private List<ProductReview> reviews;
	
	Product(String productId, String name){
		this.productId = productId;
		this.name = name;
	}
	
	public Account getSeller() {
		return seller;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void updatePrice(double price) {
		this.price = price;
	}
	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	public int getAvailableCount() {
		return availableCount;
	}
	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}
	public String getProductId() {
		return productId;
	}
	public void setSeller(Account seller) {
		this.seller = seller;
	}

	public List<ProductReview> getReviews() {
		return reviews;
	}

	public void setReviews(List<ProductReview> reviews) {
		this.reviews = reviews;
	}
	
	
	
}
