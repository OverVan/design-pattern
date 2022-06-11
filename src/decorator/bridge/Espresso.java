package decorator.bridge;

import java.util.List;

/**
 * 具体的主体产品-浓咖啡
 * 
 * @author Van
 *
 */
public class Espresso extends Beverage {

	public Espresso(List<Topping> toppings, int count) {
		super("浓咖啡", 12, toppings, count);
	}

}
