package Swiggy;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	Guest guest = new Guest();
	
	Member mem = new Member("Mansi","Mansi");
	
	Item item = new Item(new Dish("Burger",Cuisine.ITALIAN,30.00),2);
	List<Item> items = new ArrayList<>();
	items.add(item);
	
	Order order = new Order(items);

}
