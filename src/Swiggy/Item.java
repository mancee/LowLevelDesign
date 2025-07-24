package Swiggy;

public class Item {
	Dish dish;
	int count;
	
	Item(Dish d, int count){
		this.dish = d;
		this.count=count;
	}
	
	public Dish getDish() {
		return dish;
	}
	public void setDish(Dish dish) {
		this.dish = dish;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
