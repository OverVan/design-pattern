package factory.ordinary;

import org.junit.jupiter.api.Test;

public class Customer {
	@Test
	void testOrderPizza() {
		PizzaStore pizzaStore = new PizzaStore();
		pizzaStore.orderPizza(pizzaStore.getPizzaType("cheese"));
	}
}
