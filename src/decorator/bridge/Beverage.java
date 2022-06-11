package decorator.bridge;

import java.util.List;

/**
 * 抽象层-抽象的主体产品类-饮料
 * 
 * @author Van
 *
 */
public abstract class Beverage {
	private String description;
	private double price;
	private List<Topping> toppings;
	private int count;

	public Beverage(String description, double price, List<Topping> toppings, int count) {
		super();
		this.description = description;
		this.price = price;
		this.toppings = toppings;
		this.count = count;
	}

	public String getDescription() {
		return toppings.stream().map(Topping::getDescription).reduce(String::concat).orElse("") + description;
	}

	public double cost() {
		// 玩一玩Stream API，映射加求和
		double toppingsPrice = toppings.stream().map(Topping::cost).reduce(Double::sum).orElse(0.0);
		return count * price + toppingsPrice;
	}
}
