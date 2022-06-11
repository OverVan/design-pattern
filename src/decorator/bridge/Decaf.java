package decorator.bridge;

import java.util.List;

/**
 * 具体的主体产品-低因咖啡
 * 
 * @author Van
 *
 */
public class Decaf extends Beverage {

	public Decaf(List<Topping> toppings, int count) {
		super("低因咖啡", 10, toppings, count);
	}

}
