package Swiggy;

import java.util.HashMap;
import java.util.Map;

enum Cuisine {
	ITALIAN, CHINESE, MEXICAN, FRENCH, THAI, JAPANESE
}

public class Dish {
	
	private String name;
	private Cuisine type;
	private HashMap<Member,Integer> ratings;
	private double amount;
	
	Dish(String name, Cuisine type, double amount){
		this.name = name;
		this.type = type;
		this.setAmount(amount);
	}
	
	void addRating(Member mem, int rate) {
		ratings.put(mem, rate);
	}
	double getRating() {
		double sum=0.0;
		for(Map.Entry<Member,Integer> entry: ratings.entrySet()) {
			sum += entry.getValue();
		}
		return  sum / ratings.size();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cuisine getType() {
		return type;
	}
	public void setType(Cuisine type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
