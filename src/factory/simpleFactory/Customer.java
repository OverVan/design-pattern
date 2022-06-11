package factory.simpleFactory;

import org.junit.jupiter.api.Test;

public class Customer {
	@Test
	void testOrderPizza() {
		SimplePizzaFactory factory = SimplePizzaFactory.getSimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		pizzaStore.orderPizza("pepper");
	}
}
