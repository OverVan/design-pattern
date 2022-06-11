package decorator.bridge;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Customer {
	void checkout(Beverage beverage) {
		System.out.println(beverage.getDescription() + "：￥" + beverage.cost());
	}

	@Test
	void testSoyEspresso() {
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(new Soy(1));
		Beverage espresso = new Espresso(toppings, 2);
		checkout(espresso);
	}

	@Test
	void testMilkSoyDecaf() {
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(new Milk(2));
		toppings.add(new Soy(3));
		Beverage decaf = new Decaf(toppings, 1);
		checkout(decaf);
	}
}
