package Swiggy;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	
	private String name, address;
	private Location loc;
	private List<Dish> dishes;
	
	Restaurant(String name, String address){
		this.name=name;
		this.address=address;
		this.dishes = new ArrayList<>();
	}
	
	void addDishes(Dish dish) {
		dishes.add(dish);
	}
}
